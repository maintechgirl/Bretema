<script>
    import HeaderCatalog from "$lib/components/HeaderCatalog.svelte";
    import Search from "$lib/components/Search.svelte";
    import SelectMenu from "../components/SelectMenu.svelte";
    import ProductCard from "../components/ProductCard.svelte";

    let productList = [];
</script>

<section>
    <HeaderCatalog />
    <div class="menu">
        <SelectMenu/>
        <Search/>
    </div>

    <div class="products">
        {#each productList as data}
            <ProductCard {...data}/>
        {/each}
    </div>

    <div class="products">
        <ProductCard/>
        <ProductCard/>
        <ProductCard/>
        <ProductCard/>
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
