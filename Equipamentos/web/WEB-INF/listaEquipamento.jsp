<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Equipamentos</title>
    </head>
    <body>
        <h1>Lista de Equipamentos!</h1>
        <p><a href="novo.html">Novo...</a>
            <a href="pesquisa.html">Pesquisa...</a></p>
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
    </body>
</html>
