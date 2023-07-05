<main>
        <slot />
</main>

<style>
        :global(body)  {
        font-family: 'Inter', sans-serif;
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

       main{
               width: 480px;
               height: 800px;

               background-image:  url(/images/fondo.png);
               background-position: center;
               background-size: cover;
       }
</style>