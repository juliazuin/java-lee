$(document).ready(function () {

    let user = localStorage.getItem("userLogged")

    if (!user) {
        window.location = "home.html"
    }

    const userOBj = JSON.parse(user)
    console.log(userOBj.linkfoto)
    //document.getElementById("user").innerHTML = "Nome: " + userOBj.nome + " CPF: " + userOBj.cpf                         
    document.getElementById("id_user").innerHTML = `${userOBj.nome} (${userOBj.racf})`
    document.getElementById("img_user").src = `${userOBj.linkfoto}`

    fetch("http://localhost:8080/AgenteFinanceiro/agentes")
        .then(res => tratarRetorno(res))

});

function tratarRetorno(resposta) {
    resposta.status == 200 ? resposta.json().then(res => getListaUser(res)) : alert("Falha ao carregar")
}

function getListaUser(res) {
    let dropdownMap = res.map(function (item) {
        return `<a class="dropdown-item" onclick=setParceiroValue(event) id=${item.idAgente} href="#">${item.nomeAgente}</a>`
    })
    $("#selecaoAgentes").append(dropdownMap)

    let tableMap = res.map(function (item) {
        tabela = `<tr>
            <td> ${item.nomeAgente} </td>
            <td> ${item.volumeTransacional.toLocaleString('pt-br', { style: 'currency', currency: 'BRL' })} </td>
        </tr>`
        return tabela
    })
    $("#tblDados tbody").append(tableMap)

}

function setParceiroValue(valor) {
    localStorage.removeItem("idParceiro")
    localStorage.setItem("idParceiro", valor.target.id)
    window.location = "dashboard.html"
}

function logout() {
    localStorage.removeItem("userLogged")
    window.location = "home.html"
}
