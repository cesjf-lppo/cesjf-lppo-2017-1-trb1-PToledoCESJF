<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/equipamento.css" rel="stylesheet">
        <title>Lista de Equipamentos</title>
    </head>
    <body>
        <div id="main">
            <div id="topo">
                <div id="titulo">
                    <h1>Lista de Equipamentos</h1>
                </div>
            </div>
            <div id="corpo">
                <div id="links">
                    <p><a href="novo.html">Novo...</a>
                </div>
                <div id="busca">
                    <form action="pesquisa.html" method="GET">
                        <select name="ddnEstado">
                            <option value="9" ${ddnEstado==9?"selected":""}>Todos</option>
                            <option value="0" ${ddnEstado==0?"selected":""}>Novo</option>
                            <option value="1" ${ddnEstado==1?"selected":""}>Em uso</option>
                            <option value="2" ${ddnEstado==2?"selected":""}>Danificado</option>
                            <option value="3" ${ddnEstado==3?"selected":""}>Perdido</option>
                        </select>&nbsp;
                        <input type="submit" value="Filtrar" />
                    </form>
                </div>
                <div id="lista">
                    <table>
                        <tr>
                            <th>Id</th>
                            <th>Serie</th>
                            <th>Local</th>
                            <th>Descricao</th>
                            <th>Estado</th>
                            <th>Editar</th>
                            <th>Excluir</th>
                        </tr>
                        <c:forEach var="equipamentos" items="${equipamentos}">
                            <tr>
                                <td>${equipamentos.id}</td>
                                <td>${equipamentos.serie}</td>
                                <td>${equipamentos.local}</td>
                                <td>${equipamentos.descricao}</td>
                                <td>${equipamentos.estado}</td>
                                <td><a href="edita.html?id=${equipamentos.id}"><img src="Images/lapis.jpg" width="32" height="24"/></a></td>
                                <td><a href="exclui.html?id=${equipamentos.id}"><img src="Images/Lixeira.jpg" width="32" height="32"/></a></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
