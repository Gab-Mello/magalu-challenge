# Challenge - Communication Platform Development

## Technologies used
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white) 

## Scenario
Magalu has presented a challenge to begin the development of a **communication platform**. The goal of the **first sprint** is to implement basic functionalities to schedule, query, and delete communication deliveries.

## Features
- Schedule communication deliveries with date, recipient, and message.
- Query the status of scheduled communications.
- Delete scheduled communications.

## Technical Requirements

### 1. Endpoint for Scheduling Communication
- Develop an endpoint to receive scheduling requests.
- The data sent to this endpoint must include:
  - **Date/Time of delivery**
  - **Recipient**
  - **Message**
- Supported communication types:
  - Email
  - SMS
  - Push Notification
  - WhatsApp
- Scheduling requests must be stored in the database. The database structure should be prepared to handle future functionalities, enabling sending the communication and updating its status without requiring structural changes.

### 2. Endpoint to Query the Status of Scheduled Communication
- This endpoint should allow querying the status of a previously scheduled delivery.

### 3. Endpoint to Delete a Scheduled Communication
- Provide functionality to remove a scheduled delivery from the system.

## Scope of This Sprint
At this stage, **developing the communication sending functionality is not required**. The focus is on:
- Creating functional endpoints to manage the scheduling lifecycle.
- Ensuring the database structure is robust enough to support future features.

## Objective
This project aims to showcase your skills in applying software development best practices, organizing code, creating efficient RESTful APIs, and structuring a database to meet current and future system requirements.

---

This README provides an overview of the challenge, ensuring easy navigation through the repository and a clear understanding of the scope.
