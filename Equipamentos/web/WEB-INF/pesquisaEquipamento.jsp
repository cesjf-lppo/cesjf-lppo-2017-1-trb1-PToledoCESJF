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
        <form action="pesquisa.html" method="GET">
            <select name="ddnEstado">
                <option value="0" ${ddnEstado==0?"selected":""}>novo</option>
                <option value="1" ${ddnEstado==1?"selected":""}>em uso</option>
                <option value="2" ${ddnEstado==2?"selected":""}>danificado</option>
                <option value="3" ${ddnEstado==3?"selected":""}>perdido</option>
                <input type="submit" value="Filtrar" />
            </select>
        </form>
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
