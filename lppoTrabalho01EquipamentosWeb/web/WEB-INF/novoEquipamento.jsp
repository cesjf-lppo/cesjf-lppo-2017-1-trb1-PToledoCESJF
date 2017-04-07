<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/equipamento.css" rel="stylesheet">
        <title>Novo Equipamento</title>
    </head>
    <body>
        <div id="main">
            <div id="topo">         
                <div id="titulo">         
                    <h1>Novo Equipamento</h1>
                </div>
            </div>
            <div id="corpo">
                <div id="links">
                    <p><a href="lista.html">Lista...</a></p>
                </div>
                <div id="novo">
                    <form action="novo.html" method="POST">
                        <p><label>Série : </label><input type="text" name="txtSerie" value="" size="100%" /></p>
                        <p><label>Local : </label><input type="text" name="txtLocal" value="" size="100%" /></p>
                        <p><label>Descrição : </label><br><textarea name="txtDescricao" rows="4" cols="88%"></textarea></p>
                        <p><label>Estado : </label><select name="ddnEstado">
                                <option value="0">novo</option>
                                <option value="1">em uso</option>
                                <option value="2">danivicado</option>
                                <option value="3">perdido</option>
                            </select>&nbsp;
                        <input type="submit" value="Salvar" /></p>
                </div>
            </div>
        </form>
    </div>
</body>
</html>
