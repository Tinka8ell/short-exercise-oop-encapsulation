# A Short Exercise to Explore Object-Oriented Programming - Encapsulation

---
## Overview

This repository is a short exercise designed for you to explore **Encapsulation** which is one of the
four pillars of Object-Oriented Programming (OOP).

---
## 📖 Instructions

- Fork this repository
  

- To run the program, go to the [Main](src/main/java/com/techreturners/encapsulation/bankaccount/app/Main.java) class which 
  is the entry point and run it using IntelliJ
  

- There are two models `DodgyBankAccount` and `SecureBankAccount`, these are located in the 
  [model](src/main/java/com/techreturners/encapsulation/bankaccount/model) directory.

---
## 🤓 Study Prompts

Use the following questions to guide your exploration and learning! 🗺

- Run the `main` method on the `Main` class, what is it doing? What is being outputted to the console?
```
"C:\Program Files\Java\jdk-17.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=64277:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\marki\workspace\short-exercise-oop-encapsulation\target\classes com.techreturners.encapsulation.bankaccount.app.Main
  --- DODGY BANK ACCOUNT ---

Mmm...I spot a dodgy bank account! Let's make one!
What is my current balance?
Your account balance is 0
Let's deposit an amount of 30
Your account balance is 80
Wow! Looks like we get a reward of 50 when we deposit an amount
Let's be naughty and add rewards without depositing!
Your account balance is 230
Wow! We're rich!
Let's make a lot of money right now! Let's change the account balance directly!
Your account balance is 1000000
😻 Weeeeee!!!!

--- SECURE BANK ACCOUNT ---

Mmm...let's make a secure bank account!
What is my current balance?
Your account balance is 0
Let's deposit an amount of 30
Your account balance is 80
Wow! Looks like we get a reward of 50 when we deposit an amount
Let's be naughty and add rewards without depositing!
Oh no :( It looks like we can't do this - it's too secure!
Your account balance is 80
Let's make a lot of money right now! Let's change the account balance directly!
Oh no :( It looks like we can't do this - it's too secure!
Your account balance is 80
😹 Well I guess that's secure!

Process finished with exit code 0
```

- Look at the `DodgyBankAccount`, this class is not well-encapsulated.
  Can you note down the problems with how the class is designed, and the ways it is being misused?
  - Mostly exposing internal fields as public

- Compare and contrast the `DodgyBankAccount` and the `SecureBankAccount`, how is the `SecureBankAccount` different to 
the `DodgyBankAccount`? How is it designed to prevent it from being misused? Are there instances of better method names
  for clearer abstraction?
  - main difference seems to be encapsulating the fields.
---
## 🐸 Extension Challenge

- Now that you've had the chance to explore a well-encapsulated vs. poorly-encapsulated class,
your next challenge is to put your newly minted skills into practice 💪!
  
- Refactor the `WeatherReporter` class located in the [model](src/main/java/com/techreturners/encapsulation/bankaccount/model) directory.
  
- You may want to think about Encapsulation here. Do the methods follow the Single Responsibility Principle (SRP)? Are the method names suitable?
  Are there any magic numbers / hardcoded numbers in the code that needs to be represented by a constant?
  Are there better ways to write the code?
  
- As an added challenge, could you write some unit tests to test the class' methods?
