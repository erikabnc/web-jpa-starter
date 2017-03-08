<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="newalunno" method="POST">
Nome
<input type="text" name="nome" value=>
Cognome
<input type="text" name="cognome" value="${alunno.cognome}">

<input type="submit" value="Via!">
</form>

</body>
</html>