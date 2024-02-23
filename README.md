# creating_rest_api

# Overview

The Book Library Management System API provides endpoints to interact with book data. It's built using Kotlin and Retrofit for Android app integration.

# API Endpoints
Get All Books
Endpoint: GET /todos
[
  {
    "id": "1",
    "title": "The Great Gatsby",
    "author": "F. Scott Fitzgerald"
  },
  {
    "id": "2",
    "title": "To Kill a Mockingbird",
    "author": "Harper Lee"
  },
  ...
]

# Add New Book
Endpoint: POST /todos

Request Format:
{
  "title": "New Book",
  "author": "Author Name"
}
# Update Book
Endpoint: PUT /todos/{id}

Request Format:
{
  "title": "Updated Book",
  "author": "New Author"
}


