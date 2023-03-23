<%-- 
    Document   : newjsp
    Created on : 22/03/2023, 8:08:36 p. m.
    Author     : jdcan
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Resultados</title>
</head>
<body>
    <form action="MiServlet" method="post">
	<h1>Resultados</h1>
	<p>Los valores ingresados son:</p>
	<ul>
		<li>A: <%= request.getParameter("a") %></li>
		<li>B: <%= request.getParameter("b") %></li>
		<li>C: <%= request.getParameter("c") %></li>
		<li>Tipo de nave seleccionado: <%= request.getParameter("naveselegidas") %></li>
	</ul>
        </form>
</body>
</html>
