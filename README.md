# 🛒 StickyBytes | Full-Stack Sticker E-Commerce Application

StickyBytes is a full-stack e-commerce web application that allows users to browse and purchase stickers through a simple and user-friendly interface.

The application is built using **React, Spring Boot, and MySQL**, with **Stripe** for payment processing and **Docker** for running the MySQL database.

## 🚀 Tech Stack

| Category | Technologies |
|---|---|
| Frontend | React.js, JavaScript |
| Build Tool | Vite |
| Styling | Tailwind CSS |
| Backend | Java, Spring Boot |
| Database | MySQL |
| Database Containerization | Docker |
| Payment Integration | Stripe |
| API Communication | REST APIs |

## ✨ Features

### 🛍️ Sticker Catalog
- Browse available stickers.
- View sticker information and product details.

### 🛒 Shopping Cart
- Add stickers to the cart.
- Manage selected products before checkout.

### 💳 Stripe Payment Integration
- Integrated Stripe Checkout for secure online payments.
- Provides a streamlined payment experience.

### 🔐 User Authentication
- User login functionality.
- User logout functionality.

### 📄 Additional Pages
- **Home Page:** Displays available stickers.
- **About Page:** Provides information about StickyBytes.
- **Contact Page:** Allows users to access contact information.

## 🏗️ Application Architecture

StickyBytes follows a full-stack architecture with separate frontend and backend applications.

**Frontend: React + Vite + Tailwind CSS**

The React application handles the user interface, including product browsing, shopping cart interactions, authentication screens, and checkout initiation.

**Backend: Java + Spring Boot**

The Spring Boot application handles backend business logic, processes API requests, and communicates with the database.

**Database: MySQL + Docker**

MySQL stores application data and runs inside a Docker container to provide a consistent local development environment.

**Payments: Stripe**

Stripe is integrated to handle the payment checkout process.

### Application Flow

```text
                  User
                    |
                    v
          React Frontend (Vite)
               Tailwind CSS
                    |
                    | REST API Requests
                    v
             Spring Boot Backend
                    |
              +-----+-----+
              |           |
              v           v
           MySQL        Stripe
           Docker       Checkout
```

## 📁 Project Structure

```text
FullStackCourse/
│
├── Stickybytes/        # React frontend
│
└── Backend/            # Spring Boot backend
```

## ⚙️ Running the Application Locally

### Prerequisites

Make sure the following tools are installed:

- Node.js and npm
- Java JDK (compatible with the project's Spring Boot version)
- Maven or Maven Wrapper
- Docker Desktop
- Git

### 1. Clone the Repository

```bash
git clone https://github.com/surya492001/Stickybytes-Ecommerce.git
```

### 2. Start MySQL Using Docker

Start the MySQL container using your project's configured Docker setup.

Ensure the database credentials and connection settings match the Spring Boot configuration.

### 3. Start the Spring Boot Backend

Navigate to the backend folder:

```bash
cd Backend
```

Run the application using the Maven Wrapper, if available:

```bash
./mvnw spring-boot:run
```

### 4. Start the React Frontend

Open another terminal and navigate to the frontend folder:

```bash
cd Stickybytes
```

Install dependencies:

```bash
npm install
```

Start the development server:

```bash
npm run dev
```

Open the local URL displayed by Vite in your terminal.

## 🔒 Security

- Stripe secret keys and database credentials should be stored securely and excluded from version control.
- Environment-specific configuration files containing sensitive values should not be committed to GitHub.

## 🎯 Project Purpose

StickyBytes was developed to gain practical experience in full-stack application development, integrating frontend and backend technologies, managing data with MySQL, using Docker for local database infrastructure, and implementing an e-commerce payment workflow with Stripe.

## 👨‍💻 Author

**Suryanarayan Pillai**

GitHub: https://github.com/surya492001

## 📌 Future Enhancements

- Order history and tracking.
- Product search and filtering.
- Admin dashboard for sticker management.
- Improved user experience and responsive design.
