function login() {
    let user = document.getElementById("user").value
    let password = document.getElementById("password").value

    let userObj = {
        email: user,
        racf: user,
        senha: password
    }

    let msg = {
        method: "POST",
        body: JSON.stringify(userObj),
        headers: {
            "Content-Type": "application/json"
        }
    }
    console.log(msg)
    fetch("http://3.129.63.196:8080/user/login", msg)
        .then(res => retorno(res))
}

function retorno(retorno) {
    retorno.status == 200 ? retorno.json().then(res => acessoPermitido(res)) : 
    $(".alert").show(),setTimeout(function() {
        $(".alert").hide();
    }, 2000);;
}

function acessoPermitido(user) {
    localStorage.setItem("userLogged", JSON.stringify(user))
    window.location = "agentes.html"
}

function logout() {
    localStorage.removeItem("userLogged")
    window.location = "index.html"
}

$(document).ready(function() {
    $(".alert").hide();
});