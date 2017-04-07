<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/equipamento.css" rel="stylesheet">
        <title>Edita Equipamentos</title>
    </head>
    <body>
        <div id="main">
            <div id="topo">         
                <div id="titulo">  
                    <h1>Edita Equipamentos</h1>
                </div>
            </div>
            <div id="corpo">
                <div id="links">
                    <p><a href="novo.html">Novo...</a>
                        <a href="lista.html">Lista...</a>
                </div>
                <div id="novo">
                    <form action="edita.html" method="POST">
                        <p><label>id : ${equipamentoEdt.id}</label><input type="hidden" name="txtId" size="50" value="${equipamentoEdt.id}" /></p>
                        <p><label>Local : </label><input type="text" name="txtLocal" value="${equipamentoEdt.local}" size="100%" /></p>
                        <p><label>Estado :</label>
                            <select name="ddnEstado">
                                <option value="0" ${equipamentoEdt.estado==0?"selected":""}>novo</option>
                                <option value="1" ${equipamentoEdt.estado==1?"selected":""}>em uso</option>
                                <option value="2" ${equipamentoEdt.estado==2?"selected":""}>danivicado</option>
                                <option value="3" ${equipamentoEdt.estado==3?"selected":""}>perdido</option>
                            </select>&nbsp;
                        <input type="submit" value="Salvar" /></p>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
