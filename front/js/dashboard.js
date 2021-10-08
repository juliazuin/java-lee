$(document).ready(function () {
    let user = localStorage.getItem("userLogged")

    if (!user) {
        window.location = "home.html"
    }

    const userOBj = JSON.parse(user)

    //document.getElementById("user").innerHTML = "Nome: " + userOBj.nome + " CPF: " + userOBj.cpf                         
    document.getElementById("id_user").innerHTML = `${userOBj.nome} (${userOBj.racf})`
    document.getElementById("img_user").src = `${userOBj.linkfoto}`
    let parceiro = localStorage.getItem("idParceiro")

    fetch(`http://localhost:8080/transacao/consulta/${parceiro}`)
        .then(res => retornoTransacao(res))

});

function retornoTransacao(resposta) {
    resposta.status == 200 ? resposta.json().then(res => getListaStatus(res)) : alert("Falha ao carregar")
}

function getListaStatus(res) {
    document.getElementById("nomeParceiro").innerHTML = res[0].nomeAgente + ' / ' + res[0].volumeTransacional.toLocaleString('pt-br',{style: 'currency', currency: 'BRL'})
    document.getElementsByClassName("status")[0].innerHTML = res[0].count;
    document.getElementsByClassName("status")[1].innerHTML = res[1].count;
    document.getElementsByClassName("status")[2].innerHTML = res[2].count;
}

function logout() {
    localStorage.removeItem("userLogged")
    window.location = "home.html"
}