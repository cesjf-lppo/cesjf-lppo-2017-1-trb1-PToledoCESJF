<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo Equipamento</title>
    </head>
    <body>
        <h1>Novo Equipamento!</h1>
        <p><a href="lista.html">Lista...</a></p>
        <form action="novo.html" method="POST">
            <p><label>Série : </label><input type="text" name="txtSerie" value="" size="50" /></p>
            <p><label>Local : </label><input type="text" name="txtLocal" value="" size="50" /></p>
            <p><label>Descrição : </label><br><textarea name="txtDescricao" rows="4" cols="45">
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
