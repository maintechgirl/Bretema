<link rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,300,0,0"/>


<div class="container">
    <form method="POST" action="/login">
        <label for="uname">Usario</label>
        <input type="text" placeholder="Enter Username" name="uname" required>

        <label for="psw">Contraseña</label>
        <input type="password" placeholder="Enter Password" name="psw" required>
        <a href="/"><div class="btn"><span class="material-symbols-outlined">priority</span></div></a>
    </form>
</div>

<style>
    .container {
        position: fixed;
        width: 340px;
        height: 290px;
        top: 50%;
        left: 50%;
        margin-top: -245px;
        margin-left: -170px;

        background: #FDDED4;
        border-radius: 20px;
    }

    form {
        margin-top: 40px;
    }

    label {
        display: inline-block;
        margin-left: 32px;
        padding-top: 13px;
        font-size: 14px;
        color: #452E0D;
        font-weight: bold;
    }

    input {
        font-family: 'Inter', sans-serif;
        font-size: 12px;
        outline: none;
    }

    input[type=text],
    input[type=password] {
        color: #777;
        padding-left: 10px;
        margin-top: 12px;
        margin-left: 25px;
        width: 269px;
        height: 35px;
        border-radius: 10px;
        background: white;
    }

    .btn {
        margin-top: 14px;
        display: flex;
        justify-content: center;
    }

    .material-symbols-outlined {
        font-size: 50px;
        color: #452E0D;
    }

    a{
        text-decoration: none;
    }

</style>