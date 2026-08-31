import { useEffect, useState } from "react";
import "./App.css";
import ProductList from "./ProductList";
import CategoryFilter from "./CategoryFilter";

function App() {
  const [products, setProducts] = useState([]);
  const [categories, setCategories] = useState([]);
  const [selectedCategory, setSelectedCategory] = useState(null);
  const [searchTerm, setSearchTerm] = useState("");
  const [sortOrder, setSortOrder] = useState("asc");

  useEffect(() => {
    fetch("http://localhost:8080/api/products")
      .then((response) => response.json())
      .then((data) => setProducts(data));

    fetch("http://localhost:8080/api/categories")
      .then((response) => response.json())
      .then((data) => setCategories(data));
  }, []);

  const handleSearchChange = (event) => {
    setSearchTerm(event.target.value);
  };

  const handleSortChange = (event) => {
    setSortOrder(event.target.value);
  };

  const handleCategorySelect = (categoryId) => {
    setSelectedCategory(categoryId ? Number(categoryId) : null);
  };

  const filteredProducts = products
    .filter((product) => {
      return (
        (selectedCategory ? product.category.id === selectedCategory : true) &&
        product.name.toLowerCase().includes(searchTerm.toLowerCase())
      );
    })
    .sort((a, b) => {
      if (sortOrder === "asc") {
        return a.price - b.price;
      } else {
        return b.price - a.price;
      }
    });

  return (
    <div className="catalog-page">
      {/* Header */}
      <div className="catalog-header">
        <div className="container">
          <div className="text-center">
            <h1>Product Catalog</h1>
            <p>Discover products you'll love</p>
          </div>
        </div>
      </div>

      <div className="container py-4">
        {/* Filter Section */}
        <div className="filter-card">
          <div className="filter-title">
            <h5>Find Your Products</h5>
            <span>{filteredProducts.length} products</span>
          </div>

          <div className="row g-3">
            {/* Category */}
            <div className="col-lg-3 col-md-6">
              <label className="filter-label">Category</label>

              <CategoryFilter
                categories={categories}
                onSelect={handleCategorySelect}
              />
            </div>

            {/* Search */}
            <div className="col-lg-5 col-md-6">
              <label className="filter-label">Search</label>

              <div className="search-box">
                <span className="search-icon">🔍</span>

                <input
                  type="text"
                  className="form-control"
                  placeholder="Search for products..."
                  onChange={handleSearchChange}
                />
              </div>
            </div>

            {/* Sort */}
            <div className="col-lg-4 col-md-6">
              <label className="filter-label">Sort By</label>

              <select
                className="form-select sort-select"
                onChange={handleSortChange}
              >
                <option value="asc">Price: Low to High</option>

                <option value="desc">Price: High to Low</option>
              </select>
            </div>
          </div>
        </div>

        {/* Products */}
        <div className="products-section">
          {filteredProducts.length ? (
            <ProductList products={filteredProducts} />
          ) : (
            <div className="no-products">
              <div className="no-products-icon">🔍</div>

              <h4>No Products Found</h4>

              <p>Try changing your search or category filter.</p>
            </div>
          )}
        </div>
      </div>
    </div>
  );
}

export default App;
