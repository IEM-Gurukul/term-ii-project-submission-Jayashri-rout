[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
Multithreaded Chat Application using Observer Pattern
---

## Problem Statement (max 150 words)
In modern communication systems, multiple users need to interact in real-time. Traditional single-threaded systems cannot efficiently handle multiple clients simultaneously. This project aims to develop a chat application that supports multiple users communicating at the same time. The system uses multithreading to handle multiple clients and the Observer Design Pattern to broadcast messages to all connected users efficiently.

---

## Target User
Students and individuals who want to communicate in real-time over a local network.

---

## Core Features
- Multithreading support
- Multiple clients can connect simultaneously
- Real-time message broadcasting
- User join and leave notifications
- Observer pattern implementation
---

## OOP Concepts Used

- Abstraction: Interfaces (Observer, Subject)
- Inheritance:  Class implementations
- Polymorphism: Method overriding (update method)
- Exception Handling: Try-catch blocks for socket operations
- Collections / Threads: ArrayList and multithreading

---

## Proposed Architecture Description
The system follows a client-server architecture. The server handles multiple clients using threads. Each client acts as an observer, and the server notifies all clients when a message is received from any user.

---

## How to Run
### Step 1: Compile the code
Open terminal inside the `src` folder and run:
### Step 2: Run the server
### Step 3: Run client(s)
Open a new terminal and run
### Step 4: Multiple users
open multiple terminals and run
---

## Git Discipline Notes
Minimum 10 meaningful commits required.
