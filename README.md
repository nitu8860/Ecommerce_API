# E-commerce API
This is an API for an E-commerce application. It allows users to interact with the application's database to retrieve information on products, orders, addresses, and users.

## Technologies Used
- Java
- Spring Boot
- Jakarta Persistence API
- Lombok
- MySql

## Models
### User
The User model represents a user of the E-commerce application. It has the following properties:
- **id (Integer):** the unique identifier for the user
- **name (String):** the name of the user
- **email (String):** the email address of the user
- **password (String):** the password for the user
- **phoneNumber (String):** the phone number of the user

### Product
The Product model represents a product that is sold through the E-commerce application. It has the following properties:
- **id (Integer):** the unique identifier for the product
- **name (String):** the name of the product
- **price (Integer):** the price of the product
- **description (String):** a description of the product
- **category (String):** the category that the product belongs to
- **brand (String):** the brand of the product

### Order
The Order model represents an order that has been placed through the E-commerce application. It has the following properties:
- **id (Integer):** the unique identifier for the order
- **user (User):** the user who placed the order
- **product (Product):** the product that was ordered
- **address (Address):** the address that the order should be delivered to
- **productQuantity (Integer):** the quantity of the product that was ordered

### Address
The Address model represents an address that is associated with a user of the E-commerce application. It has the following properties:
- **id (Integer):** the unique identifier for the address
- **name (String):** the name associated with the address
- **landmark (String):** a landmark associated with the address
- **phoneNumber (String):** the phone number associated with the address
- **zipcode (String):** the zip code associated with the address
- **state (String):** the state associated with the address
- **user (User):** the user associated with the address

## Controllers
### User Controller
The UserController is responsible for handling requests related to users. It has the following endpoints:
- **GET /users/{id}:** Retrieves a user by their ID
- **POST /users:** Creates a new user

### Product Controller
The ProductController is responsible for handling requests related to products. It has the following endpoints:
- **GET /products:** Retrieves a list of all products
- **GET /products?category={category}:** Retrieves a list of all products in a specified category
- **POST /products:** Creates a new product
- **DELETE /products/{id}:** Deletes a product by its ID

### Order Controller
The OrderController is responsible for handling requests related to orders. It has the following endpoints:
- **GET /orders/{id}:** Retrieves an order by its ID
- **POST /orders:** Creates a new order

### Address Controller
The AddressController is responsible for handling requests related to addresses. It has the following endpoints:
- **GET /addresses/{id}:** Retrieves an address by its ID
- **POST /addresses:** Creates a new address

## Repositories
### User Repository
The UserRepository is responsible for handling database operations related to users.

### Product Repository
The ProductRepository is responsible for handling database operations related to products.

### Order Repository
The OrderRepository is responsible for handling database operations related to orders.

### Address Repository
The AddressRepository is responsible for handling database operations related to addresses.

## Project Summary
This is an E-commerce API built with Java and Spring Boot, using Jakarta Persistence API and Lombok. It allows users to interact with the application's database to retrieve information on products, orders, addresses, and users.
