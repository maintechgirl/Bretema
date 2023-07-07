<link rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0"/>

<script>
    export let searchTerm;
</script>

<div>
    <div id="search-input-cont">
        <input type="text"
               id="search-field"
               placeholder=""
               autocomplete="off"
               bind:value={searchTerm}
               on:input
        />
        <span class="material-symbols-outlined">search</span></div>
</div>


<style>

    #search-input-cont {
        width: 180px;
        height: 25px;
        display: flex;
        align-items: center;
        margin: 8px 0 0 10px;
    }

    #search-field {
        width: 180px;
        height: 25px;
        font-size: 1rem;
        border: 1px solid gray;
        border-radius: 20px;
        padding: 8px;
        background: #F7CA86;
        outline: none;
    }

    .material-symbols-outlined {
        position: relative;
        right: 45px;
        font-size: 22px;
        color: #452E0D;
    }

</style>