<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0"/>

<script>
    import { onMount } from 'svelte';
   export let searchTerm = '';
   export let searchResults = [];

    async function fetchSearchResults() {
        try {
            const response = await fetch(`http://localhost:8080/search?term=${searchTerm}`);
            const data = await response.json();
            // Actualizar los resultados de búsqueda con la respuesta de la API
            searchResults = data.results;
        } catch (error) {
            console.error('Error al realizar la búsqueda:', error);
        }
    }
   function handleInput(event) {
       searchTerm = event.target.value;
       fetchSearchResults();
   }
   onMount(fetchSearchResults);

</script>


<div>
    <input type="text"
           id="search-field"
           placeholder="Search"
           autocomplete="off"
           bind:value={searchTerm}
           on:input={handleInput}
    />
    <span class="material-symbols-outlined">search</span>
</div>


<style>

    #search-field {
        width: 179px;
        height: 25px;
        font-size: 12px;
        border: 1px solid gray;
        border-radius: 20px;
        padding: 8px;
        background: #FDDED4;
        outline: none;
        cursor: pointer;
        margin-right: -21px;
        margin-left: 30px;
    }

    .material-symbols-outlined {
        position: relative;
        right: 18px;
        top: 7px;
        font-size: 22px;
        color: #452E0D;
    }

</style>