<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="smic.model.Ativo"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Visualizando</title>


</head>
<body>

<br>
	
	<%
		List<Ativo> list = (List<Ativo>) request.getAttribute("listAtivo"); // CAST -- PESQUISAR
		for (Ativo ativo : list) {
	%>
	
	
	<table style="boder: 1px;">
			
			<tr>
				<td>
					<p> Informações do sistema operacional <p>			
			
			
			
				<td>			
			</tr>	
	
	
			<tr>
				<td>
				<p> Processador </p>
				<p>Fabricante:  <b><%= ativo.getFabricante() %> </b></p>
				<p>Nome:  <%= ativo.getNomeProcessador() %> </p>
				<p>Frequencia: <%= ativo.getFrequenciaProcessador() %> </p>
				<p>Nº Cores: <%= ativo.getCores() %> </p>
				<p>Arquitetura: <%= ativo.getArquiteturaProcessador() %> </p>
				</td>
			</tr>
			<br>
			
			
		 <tr>
		<!-- %=  %>	<td><a href="editar.do?idPonto=%=ponto.getId() %>"> Editar </a>
				&nbsp;&nbsp;&nbsp;</td>
			<td><a href="delete.do?idPonto= Excluir </a></td> -->
		</tr> 
	</table>
	<hr>
	 <%
		}
	%>


</body>
</html>