<script>
    import HeaderCatalog from "$lib/components/HeaderCatalog.svelte";
    import Search from "$lib/components/Search.svelte";


    import {onMount} from "svelte";
    import SelectMenu from "../lib/components/SelectMenu.svelte";
    import ProductCard from "../lib/components/ProductCard.svelte";


   export let productsList = [];
    onMount(() => {
        fetch("http://localhost:8080/")
            .then(response => response.json())
            .then(data => productsList = data)
    })
    let deleteProduct = (id) => {
        fetch("/${id}", {method: "DELETE"})
            .then(response => {
                if (response.ok) {
                    console.log(`product deleted ${id}`);
                }
            })
            .then(productsList)
    }

</script>

<section>
    <HeaderCatalog/>

    <div class="menu">
        <SelectMenu/>
        <Search/>
    </div>

    <div class="products">
        {#each productsList as productsList}
            <ProductCard {...productsList} onDelete={deleteProduct}/>
        {/each}
    </div>
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




