# Bretema
Brétema by Trece es una pequeña empresa familiar que crea aretes y collares.
La marca no cuenta con tienda física, solo venta online a través de Instagram y Facebook.

## Tech Stack

**Front:** SvelteKit 

**Back:** SpringBoot, Kotlin

**Tools in Back:** Postman

**Server:** Local Postgre

**Organization**

Trello - SCRUM method
[BretemaTrello](https://trello.com/b/grEpGzJK/inventario-de-bretema)

Figma - Prototype design
[BretemaFigma](https://www.figma.com/file/8F1DKp6iKbGdbRFINrfsVq/Amunt-p1---Bretema?type=design&node-id=0-1&mode=design&t=t2TwdQ1hTgZSV9Vg-0)

**Communication**

Zoom - Online Reunions 


## How to start

### Run frontend only (development mode)
From within the `frontend` folder, run the `npm install` command to install dependencies and then `npm run dev`.

### Run backend only (development mode)
From within the `backend` folder, open the main application file, and run it as Java Application

#### Database
The application requires a postgre database running on port 5432. See `src/main/resources/application.properties` for 
details.`


## Bretema API

| Method | Path                         | Description                                      |
|--------|------------------------------|--------------------------------------------------|
| GET    | `/`                          | Returns all products in the store                |
| GET    | `/{id}`                      | Returns product data (name, color, quantity, etc)|
| POST   | `/`                          | Creates a new product                            |
| PUT    | `/{id}`                      | Updates an existing product                      |
| DELETE | `/{id}`                      | Deletes an existing product                      |

