<script>
    import Header from "$lib/components/Header.svelte";
    import Search from "$lib/components/Search.svelte";
    import SelectMenu from "../components/SelectMenu.svelte";
</script>

<section>
    <Header />
    <div class="menu">
        <SelectMenu />
        <Search />
    </div>

</section>

<style>
    .menu {
        display: flex;
        justify-content: space-evenly;
        margin-left: -24px;
    }

</style>
