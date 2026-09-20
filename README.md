# Assignment 2 – Factory Method and Abstract Factory

## Project Description

This project is a Java logistics application that demonstrates two creational design patterns:

- Factory Method
- Abstract Factory

The application supports two delivery modes:

- ROAD
- SEA

It also supports two UI platforms:

- WINDOWS
- MACOS

Factory Method is used to create transport objects such as Truck and Ship.

Abstract Factory is used to create matching UI component families such as WindowsButton with WindowsCheckbox and MacOSButton with MacOSCheckbox.

## Requirements

- Java JDK 17
- IntelliJ IDEA or another Java IDE

## Project Structure

```text
src/
├── factorymethod/
│   ├── Transport.java
│   ├── Truck.java
│   ├── Ship.java
│   ├── Logistics.java
│   ├── RoadLogistics.java
│   └── SeaLogistics.java
│
├── abstractfactory/
│   ├── Button.java
│   ├── Checkbox.java
│   ├── GUIFactory.java
│   ├── WindowsButton.java
│   ├── WindowsCheckbox.java
│   ├── WindowsFactory.java
│   ├── MacOSButton.java
│   ├── MacOSCheckbox.java
│   └── MacOSFactory.java
│
└── app/
    ├── DeliveryApplication.java
    └── Main.java