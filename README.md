# Banking Client-Server System

## Overview
This project implements a client-server system for processing banking transactions such as withdrawals and deposits. The system consists of three main components: the client application, the server application, and the network infrastructure.

## Components

### Client Class
- Reads transactions from a file (`transaction.txt`) and stores them in an array.
- Utilizes the `send()` method of the Network class to transfer transactions to the network input buffer.
- Retrieves updated transactions from the network output buffer using the `receive()` method.
- Runs two threads for sending and receiving transactions concurrently.

### Server Class
- Reads accounts from a file (`account.txt`) and stores them in an array.
- Retrieves transactions from the network input buffer using the `transferIn()` method.
- Performs operations (withdraw, deposit, query) on specific accounts.
- Transmits updated transactions to the network output buffer using the `transferOut()` method.
- Runs a single thread to handle transaction processing.

### Network Class
- Provides infrastructure for client-server communication.
- Implements input and output buffers for receiving and transmitting transactions.
- Buffers have a capacity of 10 elements.
- Handles connection and disconnection requests.
- Runs a thread to manage network operations.

## Implementation
The project consists of the following Java files:
1. `Client.java`
2. `Server.java`
3. `Network.java`
4. `Transactions.java`
5. `Accounts.java`
6. `Main.java`

## Usage
1. Compile all Java files using the Java compiler.
2. Run the `Main` class to start the client-server system.
3. Monitor the console for transaction processing updates and running times.

## Testing
To test the system:
- Provide input files (`transaction.txt` and `account.txt`) with sample transactions and accounts.
- Vary the size of the network buffers and analyze the impact on running times.
- Record running times using the `System.currentTimeMillis()` method.

## Contributors
- [Kristofe Kessler & Harun Slahaldin Omar]
