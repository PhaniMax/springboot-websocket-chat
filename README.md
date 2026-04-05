# Real-Time Chat Application using Spring Boot and WebSocket

## Overview

This project is a real-time chat application developed using **Spring Boot**, **Spring Web**, and **WebSocket**.
It enables multiple users to communicate instantly through persistent two-way communication over a WebSocket connection.

Unlike traditional REST-based communication, this application uses a full-duplex communication channel that allows messages to be sent and received in real time without refreshing the page.

---

## Features

* Real-time messaging between multiple users
* Persistent two-way communication using WebSocket
* Instant message broadcast to all connected users
* Join and disconnect event handling
* Clean frontend interface using HTML, CSS, and JavaScript
* Scalable backend architecture using Spring Boot

---

## Technologies Used

* Java
* Spring Boot
* Spring Web
* Spring WebSocket
* STOMP Protocol
* HTML
* CSS
* JavaScript
* Maven

---

## Project Structure

```text
RealTimechatApp
└── chat
    ├── src
    │   └── main
    │       ├── java
    │       │   └── com.phanimax.chat
    │       │       ├── chat
    │       │       │   ├── ChatController.java
    │       │       │   ├── ChatMessage.java
    │       │       │   └── MessageType.java
    │       │       ├── config
    │       │       │   ├── WebSocketConfig.java
    │       │       │   └── WebSocketEventListener.java
    │       │       └── ChatApplication.java
    │       └── resources
    │           ├── static
    │           │   ├── css
    │           │   │   └── main.css
    │           │   ├── js
    │           │   │   └── main.js
    │           │   └── index.html
    │           └── application.properties
    └── pom.xml
```

---

## Working Principle

1. The client establishes a WebSocket connection with the server.
2. Once connected, users can send messages through the frontend interface.
3. Messages are transmitted to the Spring Boot backend through WebSocket endpoints.
4. The server broadcasts the message to all active connected users.
5. All connected clients receive the message instantly in real time.

---

## Dependencies

The project primarily uses the following Spring Boot starters:

* `spring-boot-starter-web`
* `spring-boot-starter-websocket`

---

## How to Run

### Clone the repository

```bash
git clone https://github.com/PhaniMax/realtime-chatapp-websocket.git
```

### Navigate to the project

```bash
cd realtime-chatapp-websocket
```

### Run the application

```bash
mvn spring-boot:run
```

Alternatively, run `ChatApplication.java` directly from IntelliJ IDEA.

---

## Access the Application

Open the application in the browser using:

```text
http://localhost:8080
```

---

## Use Cases

This project can be extended for:

* Team collaboration platforms
* Customer support chat systems
* Live discussion forums
* Notification systems
* Enterprise communication tools

---

## Skills Demonstrated

* Backend development using Spring Boot
* Real-time communication using WebSocket
* Event-driven application architecture
* Frontend and backend integration
* Persistent client-server communication

---

## Author

**Phanindra Mekala**
