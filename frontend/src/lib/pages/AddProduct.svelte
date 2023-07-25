<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,300,0,0"/>


<script>
    import HeaderProduct from "../components/HeaderProduct.svelte";

    let products = "";
    let error;
    let name = "";
    let color = "";
    let quantity = "";

    //let url = "";
    let id = "";

    function createID() {
        return crypto.randomUUID()
    }

    function createProduct() {

        let info = {
            name: name,
            color: color,
            quantity: quantity,
            // imageUrl: url,
            id: createID()
        }

        fetch("http://localhost:8080/", {method: "POST", body: JSON.stringify(info)})
            .then(response => response.json())
            .then(data => products = data)
        alert("producto añadido")
    }


</script>

<section>
    <HeaderProduct/>

    <form on:submit|preventDefault={createProduct}>
        <a href="/" class="btn-close"><span class="material-symbols-outlined">close</span></a>
        <p>Añadir Producto</p>
        <img src="src/assets/missingProductImage.png" alt="missingProductImage"/>
        <ul>
            <li>
                <label for="name">Nombre*</label>
                <input type="text" id="name" name="name" bind:value={name} required/>
            </li>
            <li>
                <label for="color">Color</label>
                <input type="text" id="color" name="color" bind:value={color} required/>
            </li>
            <li>
                <label for="cantidad">Cantidad*</label>
                <input type="text" id="cantidad" name="cantidad" bind:value={quantity} required/>
            </li>
        </ul>
        <!--<div class="btn_add-file">
       <label for="file"></label>
        <input
                type="file"
                id="file"
                name="fileToUpload"
                required
        />
        </div>-->
        <div>
            <button class="btn_submit" type="submit"><span class="material-symbols-outlined">check_box</span></button>
        </div>
    </form>
</section>


<style>

    form {
        margin: 0 auto;
        padding: 1em;
        max-width: 400px;
        display: flex;
        flex-direction: column;
        align-items: center;
        border-radius: 2em;
        font-weight: bold;
        color: #452E0D;
        background-color: #FDDED4;
    }

    p {
        text-transform: uppercase;
        font-size: 20px;
    }

    ul {
        list-style: none;
        padding: 0;
        margin: 0;
    }

    form li {
        margin: 1em 3em;
    }

    label {
        display: inline-block;
        width: 90px;
        margin-right: 200px;
    }

    input,
    textarea {
        width: 300px;
        box-sizing: border-box;
        border-radius: 4px;
        padding: 5px 5px;
        margin: 5px 0;
        outline: none;
        display: inline-block;
        font: 1em sans-serif;
        cursor: pointer;
        border: none;
    }

    input:focus,
    textarea:focus {
        border: 1px solid #000;
    }

    .btn-close {
        display: flex;
        align-self: end;
        font-size: 30px;
        cursor: pointer;
        outline: none;
        text-decoration: none;
        color: #452E0D;
    }

    .btn_submit {
        cursor: pointer;
        color: #452E0D;
        border: none;
        background-color: #FDDED4;
        margin: 5px;
    }

    .btn_add-file {
        cursor: pointer;
        border: none;
        margin: 10px;
        width: 308px;
        display: contents;
    }

    .material-symbols-outlined {
        font-size: 40px;
    }

    .btn_submit .material-symbols-outlined {
        font-size: 60px;
    }

    .material-symbols-outlined:hover {
        font-weight: bold;
    }

    img {
        width: 135px;
        height: 135px;
        margin: 10px 0 10px 0;
        border: 1px solid black;
    }

</style>