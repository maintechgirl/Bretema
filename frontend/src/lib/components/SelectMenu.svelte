<script>
    import Select from 'svelte-select';

    let collection = [
        {value: 'VER TODO', label: 'VER TODO'},
        {value: 'CON STOCK', label: 'CON STOCK'},
        {value: 'SIN STOCK', label: 'SIN STOCK'},
    ];

    let value;
</script>


<div>
    <Select items={collection} bind:value showChevron/>
</div>

<!--<p>{value?.label || ''}</p>-->


<style>

    div {
        --width: 200px;
        --height: 43px;
        --chevron-icon-width: 16px;
        --background: #FDDED4;
        --placeholder-color: grey;

        --border: 1px solid gray;
        --border-radius: 20px;
        --list-border: 14px solid #c7ba93;
        --list-border-radius: 20px;
        --border-focused: 1px solid gray;
        --border-hover: 1px solid gray;

        --item-hover-bg: #FDDED4;
        --item-is-active-bg: rgba(253, 214, 160, 0.88);
        --item-is-active-color: black;

        --font-size: 12px;
        --font-weight: bold;
        --icons-color: #452E0D;
        --cursor: pointer;
        --chevron-pointer-events: pointer;
    }

</style>