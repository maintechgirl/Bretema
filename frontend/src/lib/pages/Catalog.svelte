<script>
    import HeaderCatalog from "$lib/components/HeaderCatalog.svelte";
    import Search from "$lib/components/Search.svelte";
    import SelectMenu from "../components/SelectMenu.svelte";
    import ProductCard from "../components/ProductCard.svelte";
    import {onMount} from "svelte";

    export let productsList = [];

    onMount(() => {
        fetch("http://localhost:8080/catalog")
            .then(response => response.json())
            .then(data => productsList = data)
    })
</script>

<section>
    <HeaderCatalog />
    <div class="menu">
        <SelectMenu/>
        <Search/>
    </div>

    <div class="products">
        {#each productsList as data}
            <ProductCard {...data}/>
        {/each}
    </div>



</section>

<style>
    .menu {
        display: flex;
        justify-content: space-evenly;
        align-items: center;
    }

    .products {
        display: flex;
        justify-content: center;
        flex-wrap: wrap;
        margin: 25px auto 25px auto;
        gap: 10%;
    }

</style>
