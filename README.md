# Java Port Scanner

A simple TCP Port Scanner built using Java.

## Features

- Scan a hostname or IP address
- Scan a range of ports
- Detect open TCP por
- Simple command-line interface
- Configurable connection timeout

## Technologies

- Java
- Java Sockets
- VS Code

## Project Structure

PortScanner/
│
├── src/
│   └── PortScanner.java
│
└── README.md

## How to Run

Compile:

```bash
javac src/PortScanner.java
```

## Run:
```
java -cp src PortScanner
```

## Example
Enter host: localhost
Enter starting port: 1
Enter ending port: 100

```
Scanning localhost...

Port 22 → OPEN
Port 80 → OPEN

Scan completed.
```

## How It Works

The program attempts to establish a TCP connection to each port.

If the connection succeeds, the port is considered OPEN.

If the connection fails or times out, the port is considered CLOSED.

## Future Improvements

Multithreaded scanning
Service detection
Banner grabbing
Export results to a file
GUI interface
Disclaimer

This project is for educational purposes and authorized security testing only.

Only scan systems that you own or have permission to test.
