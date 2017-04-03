<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pesquisa Equipamentos</title>
    </head>
    <body>
        <h1>Pesquisa Equipamentos!</h1>
        <p><a href="novo.html">Novo...</a>
            <a href="lista.html">Lista...</a></p>
        <table>
            <tr>
                <th>Id</th>
                <th>Serie</th>
                <th>Local</th>
                <th>Descricao</th>
                <th>Estado</th>
            </tr>
            <c:forEach var="equipamentos" items="${equipamentos}">
                <tr>
                    <td>${equipamentos.id}</td>
                    <td>${equipamentos.serie}</td>
                    <td>${equipamentos.local}</td>
                    <td>${equipamentos.descricao}</td>
                    <td>${equipamentos.estado}</td>
                </tr>
            </c:forEach>
        </table>
        <input type="radio" name="rdEstado" value="0" checked="checked" />Novo<br>
        <input type="radio" name="rdEstado" value="1" />Em uso <br>
        <input type="radio" name="rdEstado" value="2" />Danificado<br>
        <input type="radio" name="rdEstado" value="3" />Perdido<br>

    </body>
</html>
