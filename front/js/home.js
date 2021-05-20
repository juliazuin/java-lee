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
    fetch("http://localhost:8080/user/login", msg)
        .then(res => retorno(res))

}

function retorno(retorno) {
    retorno.status == 200 ? retorno.json().then(res => acessoPermitido(res)) : alert("Falha no login")
}

function acessoPermitido(user) {
    localStorage.setItem("userLogged", JSON.stringify(user))
    window.location = "agentes.html"
}


function logout() {
    localStorage.removeItem("userLogged")
    window.location = "home.html"
}