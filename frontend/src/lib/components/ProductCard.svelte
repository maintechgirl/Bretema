<link rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,200,0,0"/>

<script>
    export let id;
    export let name;
    export let color;
    export let quantity;
    export let imageUrl;
</script>


<article>
    <img src="src/assets/missingProductImage.png" alt="product-image"/>
    <div class="product-info">
        <p>{name} </p>
        <p>{color} </p>


        <div class="icon-redact">
            <span class="material-symbols-outlined">edit_square</span>
        </div>
        <div class="icon-delete">
            <span class="material-symbols-outlined">delete</span>
        </div>

        <div class="icon-quantity">
            <span class="material-symbols-outlined">add_box</span>
            <p>2</p>
            <span class="material-symbols-outlined">indeterminate_check_box</span>
        </div>

    </div>
</article>


<style>

    article {
        background-color: #FDDED4;
        width: 180px;
        height: 215px;
        border: 5px solid #F7CA86;
        border-radius: 5px;
        cursor: pointer;
        margin-bottom: 25px;
    }


    article:hover {
        transform: translate(2px, 2px);
    }

    img {
        width: 100%;
        height: 50%;
        object-fit: cover;
        overflow: hidden;
        box-shadow: -1px 1px 5px 0px #F7CA86;
    }

    .product-info {
        padding: 0 0 0 10px;
    }

    .product-info p {
        font-size: 14px;
       line-height: 12px;
    }

    .material-symbols-outlined {
        font-weight: lighter;
        color: #452E0D;
    }

    .icon-redact {
        position: relative;
        left: 131px;
        bottom: 56px;
    }

    .icon-delete {
        position: relative;
        left: 131px;
        bottom: 27px;
    }

    .icon-quantity{
        position: relative;
        bottom: 54px;

        display: flex;
        flex-direction: row;
    }

    .icon-quantity p{
        width: 20px;
        position: relative;
        bottom: 7px;
        left: 6px;
    }


</style>