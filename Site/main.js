//Aprender a anipular DOM
//Definir qual elemento do HTML eu vou pegar, e o
/*

    Localizadores - Id mais comum #id

*/

/*
    CLASSE      .classe
*/

//Pegar um elemento HTML.


const Botao = document.querySelector('#Enviar');

Botao.addEventListener("click", (evento)=>{

    const User = document.getElementById('User').value;
    const Senha = document.querySelector('#Senha').value;    
    
    if(User === User && Senha){
        console.log(User)

    }

});

