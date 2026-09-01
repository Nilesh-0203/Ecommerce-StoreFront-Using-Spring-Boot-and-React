# 🛒 Ecommerce StoreFront

A full-stack **Ecommerce StoreFront** built using **Spring Boot, React, and Bootstrap**.

The project was created to move beyond smaller applications and understand how a larger full-stack application is structured, how the frontend communicates with backend REST APIs, and how different application components work together to provide an ecommerce experience.

---

## 🚀 Features

* 🛍️ **Product Browsing**

  * Browse available products through the web interface.

* 🔎 **Product Interaction**

  * View and interact with product information.

* 🛒 **Shopping Cart**

  * Add products to the shopping cart.

* ⚛️ **React Frontend**

  * Provides the user interface and handles client-side interactions.

* ☕ **Spring Boot Backend**

  * Provides REST APIs and handles backend logic.

* 🎨 **Bootstrap UI**

  * Used for responsive and structured frontend styling.

* 🔗 **REST API Communication**

  * React communicates with the Spring Boot backend through REST APIs.

---

## 🛠️ Tech Stack

| Technology      | Purpose                                 |
| --------------- | --------------------------------------- |
| ☕ Java          | Backend development                     |
| 🌱 Spring Boot  | Backend framework                       |
| 🔗 Spring REST  | REST API development                    |
| ⚛️ React        | Frontend development                    |
| 🎨 Bootstrap    | UI styling                              |
| 📡 REST API     | Frontend-backend communication          |
| 📦 Maven        | Backend build and dependency management |
| 🟨 npm          | Frontend package management             |
| 🔀 Git & GitHub | Version control                         |

---

## 🏗️ Application Architecture

The application follows a typical full-stack architecture:

```text
┌──────────────────────┐
│        User          │
└──────────┬───────────┘
           │
           ▼
┌──────────────────────┐
│    React Frontend    │
│                      │
│  Products / Cart /   │
│     UI Components    │
└──────────┬───────────┘
           │
           │ REST API
           ▼
┌──────────────────────┐
│     Spring Boot      │
│                      │
│    REST Controllers  │
│         ↓            │
│     Business Logic   │
│         ↓            │
│     Data Layer       │
└──────────┬───────────┘
           │
           ▼
┌──────────────────────┐
│       Database       │
└──────────────────────┘
```

---

## 🔄 Application Flow

```text
👤 User
   ↓
⚛️ React Frontend
   ↓
📡 REST API Request
   ↓
☕ Spring Boot
   ↓
⚙️ Business Logic
   ↓
🗄️ Data Layer
   ↓
☕ Spring Boot
   ↓
📡 REST API Response
   ↓
⚛️ React
   ↓
👤 User
```

For example, when a user interacts with a product:

```text
User selects product
       ↓
React sends request
       ↓
Spring Boot REST API
       ↓
Backend processes request
       ↓
Response returned
       ↓
React updates the UI
```

---

## 🛒 Shopping Cart Flow

The shopping cart demonstrates how frontend state and backend functionality work together.

```text
👤 User
   ↓
Select Product
   ↓
🛒 Add to Cart
   ↓
⚛️ React
   ↓
Cart State / API
   ↓
☕ Spring Boot
   ↓
Cart Processing
   ↓
🛒 Updated Cart
   ↓
⚛️ React UI
```

---

## 🔌 REST API

The Spring Boot backend exposes REST endpoints used by the React frontend.

### Example Product APIs

```http
GET /api/products
```

Retrieve available products.

```http
GET /api/products/{id}
```

Retrieve a specific product.

### Example Cart APIs

```http
GET /api/cart
```

Retrieve cart information.

```http
POST /api/cart
```

Add a product to the cart.

```http
DELETE /api/cart/{id}
```

Remove an item from the cart.

> Update these endpoints according to the actual controllers and mappings implemented in your project.

---

## 📂 Project Structure

```text
ecommerce-storefront/
│
├── backend/
│   │
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── example/
│   │   │   │           └── ecommerce/
│   │   │   │               ├── controller/
│   │   │   │               ├── service/
│   │   │   │               ├── repository/
│   │   │   │               ├── model/
│   │   │   │               └── EcommerceApplication.java
│   │   │   │
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   │
│   │   └── test/
│   │
│   └── pom.xml
│
├── frontend/
│   │
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── services/
│   │   ├── App.jsx
│   │   └── main.jsx
│   │
│   ├── public/
│   ├── package.json
│   └── ...
│
├── screenshots/
│   ├── home-page.png
│   ├── products.png
│   └── shopping-cart.png
│
└── README.md
```

> Update the structure to match your actual repository.

---

## ⚙️ Setup & Installation

### Prerequisites

Make sure you have:

* Java 17+
* Maven
* Node.js
* npm
* Git

---

## ☕ Backend Setup

Navigate to the backend:

```bash
cd backend
```

Build the Spring Boot application:

```bash
./mvnw clean install
```

On Windows:

```powershell
mvnw.cmd clean install
```

Run the backend:

```bash
./mvnw spring-boot:run
```

The backend will normally run on:

```text
http://localhost:8080
```

---

## ⚛️ Frontend Setup

Open another terminal:

```bash
cd frontend
```

Install dependencies:

```bash
npm install
```

Start the React development server:

```bash
npm run dev
```

The frontend will normally be available at:

```text
http://localhost:5173
```

Use the URL displayed by your development server if your configuration uses a different port.

---

## 🔗 Frontend & Backend Communication

The React application communicates with the Spring Boot backend using REST APIs.

```text
React
  │
  │ HTTP Request
  ▼
Spring Boot
  │
  │ Process Request
  ▼
Backend / Database
  │
  │ HTTP Response
  ▼
React
  │
  ▼
Update UI
```

This separation allows the frontend and backend to evolve independently while communicating through clearly defined APIs.

---

## 🖼️ Screenshots

### 🏠 Ecommerce Store

![Ecommerce Store](screenshots/home-page.png)

Main storefront interface.

---

### 🛍️ Products

![Products](screenshots/products.png)

Product browsing and interaction.

---

### 🛒 Shopping Cart

![Shopping Cart](screenshots/shopping-cart.png)

Shopping cart containing selected products.

> Add your actual screenshots to the `screenshots/` directory and update the filenames if required.

---

## 🎯 Key Learning

This project was an important step from building smaller applications toward understanding **larger full-stack systems**.

The biggest learning was that building a full-stack application isn't simply about writing more code.

It is about making different layers communicate correctly:

```text
Frontend
   ↕
REST API
   ↕
Backend
   ↕
Business Logic
   ↕
Data Layer
   ↕
Database
```

I learned how responsibilities can be separated between the frontend and backend while still working together as one application.

---

## 📚 What I Learned

Through this project, I explored:

* Building REST APIs with Spring Boot.
* Developing frontend interfaces with React.
* Using Bootstrap for responsive UI development.
* Connecting React with Spring Boot REST APIs.
* Handling frontend-backend communication.
* Structuring a larger full-stack application.
* Working with product and shopping-cart functionality.
* Separating frontend, backend, and data responsibilities.
* Understanding how different application layers work together.

---

## 🔮 Future Improvements

Possible improvements include:

* 🔐 User authentication and authorization
* 👤 User registration and login
* 💳 Payment gateway integration
* 📦 Order management
* 📋 Order history
* ❤️ Wishlist
* 🔎 Product search
* 🏷️ Product categories and filters
* ⭐ Product reviews and ratings
* 📧 Email notifications
* 🐳 Docker deployment
* ⚙️ CI/CD pipeline
* ☁️ AWS deployment
* 📊 Admin dashboard
* ☸️ Kubernetes deployment

---

## 🎯 Project Goal

The goal of this project was to move beyond simple applications and understand how a **larger full-stack application** is designed.

The core architecture is:

**👤 User → ⚛️ React → 📡 REST API → ☕ Spring Boot → 🗄️ Data Layer**

This project helped me take another step toward building production-oriented applications with **Spring Boot and modern frontend technologies**.

---

## 👨‍💻 Author

**Nilesh Kudale**

Java | Spring Boot | React | REST APIs | Full-Stack Development

---

## ⭐ Support

If you find this project useful or interesting, consider giving the repository a ⭐.

**Still learning. Still building. Still improving. 🚀**
