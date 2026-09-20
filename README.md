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
```

## How to Run

### IntelliJ IDEA

1. Open the project in IntelliJ IDEA.
2. Make sure the project uses JDK 17.
3. Open `Main.java`.
4. Run the `main()` method.
5. Enter the delivery mode.
6. Enter the UI platform.

### Run from Terminal

Compile the project:

```bash
mkdir -p out
javac -d out src/factorymethod/*.java src/abstractfactory/*.java src/app/*.java
```

Run the application:

```bash
java -cp out app.Main
```

## Supported Input

Delivery mode:

```text
ROAD
SEA
```

UI platform:

```text
WINDOWS
MACOS
```

## Sample Run

Input:

```text
ROAD
WINDOWS
```

Output:

```text
Delivery mode: ROAD
UI platform: WINDOWS
Rendering Windows button
Rendering Windows checkbox
Truck delivers laboratory equipment to Aktau warehouse
```

## Invalid Input

Example:

```text
AIR
```

Output:

```text
Unsupported delivery mode: AIR
```

The application also handles unsupported UI platforms and missing input.

## Design Patterns

### Factory Method

The `Logistics` class declares the `createTransport()` factory method.

`RoadLogistics` creates a `Truck`.

`SeaLogistics` creates a `Ship`.

The shared `planDelivery()` method works through the `Transport` interface.

### Abstract Factory

The `GUIFactory` interface defines:

- `createButton()`
- `createCheckbox()`

`WindowsFactory` creates Windows UI components.

`MacOSFactory` creates macOS UI components.

The `DeliveryApplication` uses the `GUIFactory` interface without depending directly on concrete UI classes.

## UML Diagrams

The UML diagrams are located in the `uml` directory:

- `factory-method.puml`
- `abstract-factory.puml`

## Author

Ismail Shargazin

## GitHub Repository

https://github.com/IsmailShargazin/Assignment2-SDP