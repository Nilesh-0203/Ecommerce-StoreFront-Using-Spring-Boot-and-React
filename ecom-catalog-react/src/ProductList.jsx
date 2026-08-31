const ProductList = ({ products }) => {
  return (
    <div className="row g-4">
      {products.map((product) => (
        <div className="col-xl-3 col-lg-4 col-md-6 col-sm-12" key={product.id}>
          <div className="product-card">
            {/* Product Image */}
            <div className="product-image-container">
              <img
                src={product.imageUrl || "https://placehold.co/600x400"}
                className="product-image"
                alt={product.name}
              />
            </div>

            {/* Product Details */}
            <div className="product-content">
              <h5 className="product-name">{product.name}</h5>

              <p className="product-description">{product.description}</p>

              <div className="product-bottom">
                <span className="product-price">${product.price}</span>

                <button className="view-button">View</button>
              </div>
            </div>
          </div>
        </div>
      ))}
    </div>
  );
};

export default ProductList;
