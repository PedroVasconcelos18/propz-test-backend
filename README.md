# Propz Technical Test: Perfect Number Checker

This project serves as a technical test for Propz, aimed at building a Java Web Application with a graphical interface that includes two essential functionalities: 

- Determine if the number entered by the user qualifies as a **PERFECT NUMBER**
- Identify all **PERFECT NUMBERS** between two numbers specified by the user in the interface

### Quick explanations about the problem

  A Perfect Number is defined as a positive integer that equals the sum of its proper divisors. 
  In the case of 6, its proper divisors are 1, 2, and 3 and their sum is 1 + 2 + 3 = 6. 
  Since this sum equals the number itself, 6 qualifies as a Perfect Number.

## Tech Stack

Java 17, SpringBoot, JUnit, Mockito

## Installation

Clone the project

```bash
  git clone https://github.com/PedroVasconcelos18/propz-test-backend
```

After, open the terminal and run the command below to install all dependencies that are necessary to run this project

```bash
  ./gradlew clean build
```
    
## Run Locally

To start the server, execute the command below.

```bash
   ./gradlew bootRun
```

## Running unit test

These tests verify the functionality of both services and controllers.

```bash
  ./gradlew test
```
