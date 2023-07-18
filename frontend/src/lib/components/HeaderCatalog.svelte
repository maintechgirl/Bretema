<link rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,300,0,200"/>

<nav>
    <div>
        <a href="/"><img src="src/assets/logosinfondo.png" alt="Logo" class="img_size1"/></a>
    </div>
    <a href="/AddProduct">
        <img src="src/assets/fondo-bretema-sinfondo.png" alt="Logo" class="img_size2"/>
        <span class="material-symbols-outlined">add_box</span>
    </a>
    <a href="/Welcome">
        <img src="src/assets/fondo-bretema-sinfondo.png" alt="Logo" class="img_size2"/>
        <span class="material-symbols-outlined">logout</span>
    </a>
</nav>


<style>

    a {
        height: 2px;
    }

    .img_size1 {
        width: 150px;
        height: 150px;
    }

    .img_size2 {
        width: 150px;
        height: 113px;
        margin-top: 15px;
    }

    nav {
        display: flex;
        flex-direction: row;
        justify-content: space-evenly;
        padding: 20px 20px 20px 20px;
    }

    .material-symbols-outlined {
        position: relative;
        top: -86px;
        left: 52px;
        font-size: 50px;
        color: #452E0D;
        font-weight: lighter;
    }

    .material-symbols-outlined:hover {
        font-weight: normal;
    }
</style>