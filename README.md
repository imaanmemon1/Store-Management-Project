# Store-Management-Project
# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

![Copy of UML Diagram](https://github.com/user-attachments/assets/2d4276b4-f4d1-4967-b399-efea0ee29d71)


## Description

The StoreRunner project is a management system for a community library that handles books and magazines. I chose this topic because I love reading books and going to the library to spend time reading in peace. The project uses object-oriented programming with a main class called LibraryItem and two subclasses: Book and Magazine. This setup shows how the subclasses can inherit common features while adding their own specific details. Users can interact with the system through the LibraryInteraction class, where they are asked to enter information like the title, author, ISBN, and availability of each item. The program takes this input to create new Book or Magazine objects and displays their details in the console using the toString() method. This StoreRunner interaction aims to make library management easier and encourage reading like Spongebob SquarePants.

![image](https://github.com/user-attachments/assets/368b7174-7b4b-4696-b718-c88a16021950)

