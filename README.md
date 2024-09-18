# Lab 1: Basic JUnit 4 - Hybrid Vehicle MPG/MPGe Calculator

## Objective
The objective of this lab is to implement basic unit testing using JUnit 4, calculate the efficiency of hybrid vehicles in terms of MPG (miles per gallon) and MPGe (miles per gallon equivalent), and demonstrate the results in fully gas mode, fully electric mode, and hybrid mode.

## Project Structure
This project consists of several Java classes and interfaces, as well as unit tests for validating calculations. The key files are:

- `Hybrid.java`: Implements both `GasolineInterface` and `ElectricInterface`, containing methods to calculate MPG and MPGe.
- `HybridCar.java`: The main class that demonstrates the use of the `Hybrid` class to calculate MPG, MPGe, and average efficiency in hybrid mode.
- `GasolineInterface.java`: An interface for calculating MPG (gasoline mode).
- `ElectricInterface.java`: An interface for calculating MPGe (electric mode).
- `TestMe.java`: A simple class used for testing basic functionality using JUnit 4.
- `TestMeTests.java`: JUnit 4 test class for unit testing the methods in `TestMe`.

## Prerequisites
- Java Development Kit (JDK)
- JUnit 4.13.2
- Hamcrest 1.3

## Setup Instructions

### 1. Clone the Repository
First, clone the repository from GitHub to your local machine:
git clone <repository-url>
cd Lab-1

### 2. Compile the Java Files
Navigate to the root of the project folder:
cd /workspaces/Lab-1/

Compile the Java files using the following commands:
javac -cp junit-4.13.2.jar "./src/c/TestMe.java" "./src/u/TestMeTests.java"
javac -cp junit-4.13.2.jar "./src/c/HybridCar.java" "./src/c/Hybrid.java"

### 3. Run Unit Tests
Run the JUnit tests using the JUnitCore class:
java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:./src/" org.junit.runner.JUnitCore u.TestMeTests

### 4. Run the Main Program
To run the main program and calculate the efficiency of a hybrid vehicle:
java -cp "./src/" c.HybridCar

## Example Output
When you run the `HybridCar` program, you should see output similar to the following:
```
MPGe: 144.43
MPG: 20.0
Average MPG in hybrid mode: 82.215
```

The program calculates:
1. MPGe in fully electric mode (300 miles with 70 kWh).
2. MPG in fully gas mode (120 miles using 6 gallons).
3. The average efficiency in hybrid mode.

## Unit Tests
The unit tests in `TestMeTests.java` validate the square calculation in the `TestMe` class. Example output when running the tests:
JUnit version 4.13.2
..
Time: 0.005

OK (1 test)

## How to Contribute
1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m "Add feature"`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a pull request.

## License
This project is for academic purposes and does not have a license.
