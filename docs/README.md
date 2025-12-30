Assignment 2: Vehicle Management System
Project Overview

This project is a simple Vehicle Management System implemented in Java using Object-Oriented Programming (OOP) principles.

It demonstrates:

Abstract classes and method overriding

Inheritance between a superclass and multiple subclasses

Composition and aggregation using a Driver class

Use of constructors and the super keyword

Polymorphism with an array of Vehicle objects

The program creates different types of vehicles, assigns drivers to them, and processes them through a common superclass reference.

Class Descriptions
1. Vehicle (Abstract Class)

Fields (protected):

brand – Vehicle brand

year – Year of manufacture

driver – Assigned driver

Methods:

startEngine() (abstract)

stopEngine() (abstract)

displayInfo() – Displays vehicle and driver information

2. Car Class

Additional fields:

doors – Number of doors

fuelType – Type of fuel

Overrides engine start and stop behavior.

3. Motorcycle Class

Additional field:

hasSidecar – Indicates if the motorcycle has a sidecar

Overrides engine start and stop behavior.

4. Truck Class

Additional fields:

capacity – Load capacity

numAxles – Number of axles

Overrides engine start and stop behavior.

5. Driver Class

Fields (private):

name – Driver name

licenseNumber – Driver license number

A driver can be associated with multiple vehicles, demonstrating aggregation.

Reflection

This assignment helped reinforce my understanding of inheritance and abstraction in Java. Using an abstract superclass simplified the design and reduced duplicated code. Method overriding allowed each vehicle type to implement its own behavior while still being handled through a common Vehicle reference.

One challenge was deciding which fields should be protected versus private, as this affects how subclasses access shared data. Overall, the project is well structured and meets all assignment requirements.
![Program Output](docs/screenshots/img.png)