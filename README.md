`<img src="https://github.com/maintekgirl/Bretema/blob/main/frontend/src/assets/logosinfondo.png" width="200" height="200"/>


# Bretema
Brétema by Trece is a small family business that creates earrings and necklaces.
The brand does not have a physical store, only online sales through Instagram and Facebook.

Brétema by Trece needs an inventory platform to manage the stock of its products manually to improve their control.

## Technical requirements
1) Version web and mobile
2) Login page
3) Display of the products list on the main screen
4) Product cards with image.,shown in red if the product is out of stock
5) Pages to insert and to modify product
6) Search products by names
7) Filtering of products with stock and without stock
8) Buttons for modifying the quantity of products
9) Button to delete product

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



