<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edita Equipamentos</title>
    </head>
    <body>
        <h1>Edita Equipamentos!</h1>
        <p><a href="novo.html">Novo...</a>
            <a href="lista.html">Lista...</a>
            <a href="pesquisa.html">Pesquisa...</a></p>
        <form action="novo.html" method="POST">
            <p><label>Local : </label><input type="text" name="txtLocal" value="" size="50" /></p>
            </textarea></p>
            <p><select name="ddnEstado">
                <option value="0">novo</option>
                <option value="1">em uso</option>
                <option value="2">danivicado</option>
                <option value="3">perdido</option>
            </select></p>
            <input type="submit" value="Salvar" />
        </form>
    </body>
</html>
