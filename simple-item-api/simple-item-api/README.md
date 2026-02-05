Simple Item API

A lightweight Spring Boot REST API to manage items(movies).
The Application uses in-memory storage for simplicity.

Tech Stack

Java 21
Spring Boot
Spring Web
Lombok

API Endpoints

1. Add a new Item
POST /api/items
Description: Add a new item

Request Body:

{
 "name: "Ratchasan",
 "description": "Thriller"
} 
 
2. Fetch Item by ID:
 GET /api/items/{id}
Description: Fetch item by ID

3. Fetch all items
GET /api/items

[
    {
        "description": "Action",
        "id": 1,
        "name": "Ratchasan"
    },
    {
        "description": "Sci-fi",
        "id": 2,
        "name": "Interstellar"
    }
]

Notes: 
Returns a list of all items currently stored in memory.
If no ites are available, returns an empty array[]. 

Validation
Name field is mandatory
Invalid requests return HTTP 400



How to Run
1. Import Project as Maven Project
2. Run SimpleItemApiApplication
3. Application runs on http://localhost:8080

Note
This project uses in-memory storage. Data will reset on restart