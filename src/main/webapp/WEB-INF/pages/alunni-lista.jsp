<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista alunni</title>
</head>
<body>
	<h1>Lista alunni</h1>

	<table border="1" cellspacing="1" cellpadding="5" width="100%">
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Cognome</th>
			<th>Elimina</th>
			<th>Modifica</th>
		</tr>
		<c:forEach items="${list}" var="alunno">
			<tr>
				<td>${alunno.id}</td>
				<td>${alunno.nome}</td>
				<td>${alunno.cognome}</td>
				<td><a href="deleteAlunni?id=${alunno.id}">
						<button>X</button>
				</a></td>
				<td><a href="newalunni
							?id=${alunno.id}">
						<button>+</button>
				</a></td>
			</tr>
		</c:forEach>

	</table>

	<a href="newalunno">
		<button>Aggiungi</button>
	</a>


</body>
</html>