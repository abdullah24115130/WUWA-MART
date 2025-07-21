# 🛒 WuwaMart – A Simple Java-Based E-Commerce Platform

Welcome to **WuwaMart**, a beginner-to-intermediate level **Java project** that simulates an online shopping system. It includes features like product management, order processing, user roles, and a JavaFX-based login system.

---

## 📦 Features

- 🧍 User Roles:
  - Admin
  - Customer
  - Moderator
  - Rider

- 🛍️ Shop Management:
  - Categories, Subcategories
  - Items (with price, stock)

- 📦 Order Handling:
  - Regular & Delivery Orders
  - Order Cancellation, Claiming Tickets

- 🎫 Support Ticket System

- 🔐 GUI Login System (JavaFX)

---

## 🧪 Tech Stack

| Layer       | Technology         |
|-------------|--------------------|
| Language    | Java (JDK 24.0)   |
| GUI         | JavaFX             |
| Build Tool  | Ant / NetBeans     |
| Structure   | OOP (Encapsulation, Inheritance, etc.) |
| Future Plan | MySQL + JDBC + Spring Boot |

---

## 🗂️ Project Structure

WuwaMart/
├── src/
│   ├── com.abdullah.wuwamart.shop/
│   │   ├── Item.java
│   │   ├── Category.java
│   │   ├── SubCategory.java
│   │   ├── Order.java
│   │   ├── DeliveryOrder.java
│   │   ├── Ticket.java
│   │   └── Shop.java
│   ├── com.abdullah.wuwamart.users/
│   │   ├── User.java
│   │   ├── Admin.java
│   │   ├── Customer.java
│   │   ├── Moderator.java
│   │   └── Rider.java
│   ├── com.abdullah.wuwamart.main/
│   │   └── Main.java
│   └── com.abdullah.wuwamartfx/
│       ├── Main.java
│       ├── LoginController.java
│       └── login.fxml
