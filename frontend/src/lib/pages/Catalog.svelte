<script>
    import Header from "$lib/components/Header.svelte";
    import Search from "$lib/components/Search.svelte";
    import SelectMenu from "../components/SelectMenu.svelte";
    import ProductCard from "../components/ProductCard.svelte";

    let productList = [];
</script>

<section>
    <Header/>
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
    }

    .products {
        display: flex;
        justify-content: center;
        flex-wrap: wrap;
        margin: 25px 0 25px 0;
        gap: 10%;
    }

</style>
