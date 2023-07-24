<link rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,200,0,0"/>

<script>
   /* export let id;
    export let name;
    export let color;
    export let quantity;
    export let imageUrl;*/
   export let product;
   export let onDelete;



   let count = product.quantity;

   function plusClick() {
       count += 1;
   }
   function menosClick() {
       count -= 1;
   }

</script>

<article>
    <img src={product.imageUrl} alt="product-image"/>
    <div class="product-info">
        <p>{product.name}</p>
        <p>{product.color} </p>

        <div class="group-icons-quantity">
            <button on:click={menosClick}>-</button>
            <div><p> {count}</p></div>
            <button on:click={plusClick}>+</button>
        </div>

        <div class="group-icons-redact-delete">
            <div class="icon-redact">
                <a href="/ModifyProduct"><span class="material-symbols-outlined">edit_square</span></a>
            </div>

            <div class="icon-delete">
                <button on:click={() => onDelete(product.id)}>
                    <span class="material-symbols-outlined">delete</span>
                </button>
            </div>
        </div>
    </div>
</article>


<style>

    article {
        width: 180px;
        height: 215px;
        background-color: white;
        border: 5px solid #c6b995;
        border-radius: 5px;
        margin: 20px;
        font-weight: normal;
        cursor: pointer;
    }

    article:hover {
        transform: translate(2px, 2px);
    }


    img {
        width: 100%;
        height: 50%;
        object-fit: cover;
        overflow: hidden;
        box-shadow: -1px 1px 7px 0 #F7CA86;
    }

    .product-info {
        padding: 0 0 0 10px;
        height: 20px;
    }

    .product-info p {
        font-size: 12px;
        line-height: 12px;
    }


    .material-symbols-outlined {
        font-weight: lighter;
        color: #452E0D;
    }

    .material-symbols-outlined:hover {
        font-weight: bold;
        color: #452E0D;
    }


    .group-icons-quantity {
        display: flex;
        flex-direction: row;
        gap: 12px;
    }

    .group-icons-quantity p {
        position: relative;
        top: -7px;
    }

    .group-icons-redact-delete {
        display: flex;
        flex-direction: column;
        gap: 12px;
        position: relative;
        top: -90px;
        right: -124px;
        width: 40px;
    }


</style>