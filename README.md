# 💳 Java ATM System

A simple ATM system built using Java with object-oriented programming principles. This project includes separate classes for user authentication, account balance management, and ATM interface, all organized under a clean package structure.

## 📁 Project Structure

atm/
├── ATM.java # Handles user interactions
├── ATMMain.java # Entry point of the program
├── BankAccount.java # Manages account balance, deposit, withdraw
└── User.java # Stores user credentials and validates PIN


## 🛠️ Features

- 🔐 PIN-based user authentication
- 💰 Balance checking
- ➕ Deposit money
- ➖ Withdraw money with balance check
- 🧱 Modular class-based structure for easy extension

## ▶️ How to Run

### 💡 Option 1: Using Terminal (Command Line)

1. Clone the repository or download the files.
2. Open a terminal and navigate to the project directory.
3. Compile the project:
   ```bash
   javac atm/*.java
Run the program:

java atm.ATMMain
💡 Option 2: Using an IDE (IntelliJ / Eclipse / NetBeans)
Create a new Java project.

Create a package named atm.

Add all .java files under this package.

Run ATMMain.java.

🔐 Default User Credentials
Card Number: 1234567890

PIN: 1234

You can change these in ATMMain.java.
