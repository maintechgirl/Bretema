<script>
    import "../app.css";
</script>

<main>
    <slot/>
</main>

<style>

    :global(body) {
        font-family: 'Inter', sans-serif;
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    main {
        max-width: 500px;
        height: 801px;
        margin: auto;
        background-image: url(src/assets/fondo.png);
        background-position: center;
        background-size: cover;
    }

</style>