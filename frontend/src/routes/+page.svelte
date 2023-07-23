<script>
    import HeaderCatalog from "$lib/components/HeaderCatalog.svelte";
    import Search from "$lib/components/Search.svelte";


    import {onMount} from "svelte";
    import SelectMenu from "../lib/components/SelectMenu.svelte";
    import ProductCard from "../lib/components/ProductCard.svelte";

    export let productsList = [];
    export let searchResults = [];


    onMount(() => {
        fetch("http://localhost:8080/")
            .then(response => response.json())
            .then(data => productsList = data)
            .catch(error => console.error('Error fetching products:', error));
    });

    let deleteProduct = (id) => {
        fetch(`/${id}`, { method: "DELETE" })
            .then(response => {
                if (response.ok) {
                    console.log(`Product deleted: ${id}`);
                    // Update the local `productsList` by filtering out the deleted product
                    productsList = productsList.filter(product => product.id !== id);
                }
            })
            .catch(error => console.error('Error deleting product:', error));
    };


</script>

<section>
    <HeaderCatalog/>

    <div class="menu">
        <SelectMenu/>
        <Search/>
    </div>

     <div class="products">
        {#if productsList && productsList.length > 0}
            {#each productsList as product}
                <ProductCard {product} onDelete={deleteProduct} />
            {/each}
        {:else}
            <p>No products found.</p>
        {/if}

        <!-- {#if searchResults.length > 0}
             <ul>
                 {#each searchResults as result (result.id)}
                     <li>{result.name}</li>.
                 {/each}
             </ul>
         {:else}
             <p>No products found.</p>
         {/if}
    </div>-->
</section>


<style>
    section{
        display: flex;
        justify-content: center;
        flex-wrap: wrap;
        overflow-x:hidden;
        overflow-y:auto;
        max-width: 500px;
        height: 801px;
    }

    .menu {
        display: flex;
    }

    .products {
        display: flex;
        justify-content: center;
        flex-wrap: wrap;
        margin: 25px auto 25px auto;
    }
</style>




