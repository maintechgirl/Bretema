<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0"/>

<script>
    export let searchTerm;
</script>


<div>
    <input type="text"
           id="search-field"
           placeholder="Search"
           autocomplete="off"
           bind:value={searchTerm}
           on:input
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