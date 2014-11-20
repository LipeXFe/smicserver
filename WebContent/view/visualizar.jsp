<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="smic.model.Ativo"%>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="format-detection" content="telephone=no" />
        <meta name="viewport" content="user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width, height=device-height, target-densitydpi=device-dpi" />
        <title>SMIC- SERVER</title>
        
        <link rel="stylesheet" href="js/jquery.mobile-1.4.2.min.css" />
		<script src="js/jquery-1.9.1.min.js"></script>
		<script src="js/jquery.mobile-1.4.2.min.js"></script>
		<link rel="stylesheet" type="text/css" href="js/style.css" />

<style type="text/css"> 
	#desc{
	width:100px;}
	 </style>
    </head>
    <body>
    
   <div id="titulo">
   
   	
	<%
		List<Ativo> listPC = (List<Ativo>) request.getAttribute("listPC"); // CAST -- PESQUISAR
		for (Ativo ativoPC : listPC) {
	%>
	
	
     <p style="background:#444; color:white;">Informações Sistema Operacional </p>
     
    
    <table border="0px" >
    	
    	<tr>
    		<td id="desc">Nome do PC:	</td>
    		<td><%= ativoPC.getNomePc() %></td>
    	</tr>
    
    	<tr>
    		<td id="desc">Sistema Operacional:</td>
    		<td><%= ativoPC.getSistemaOp() %></td>
    	</tr>
    	
    	<tr>
    		<td id="desc">Versão do Sistema Operacional:</td>
    		<td><%= ativoPC.getVersaoOp() %></td>
    	</tr>
  
    	<tr>
    		<td id="desc">Domínio:	</td>
    		<td><%= ativoPC.getDominio() %></td>
    	
    		
    	</tr>
    	</table>
    	
    	<p style="background:#444; color:white;">Processador</p>
    	
    	<table>
    	<tr>
    		<td id="desc">Fabricante</td>
    		<td><%= ativoPC.getFabricante() %> </td>
    	</tr>
    	<tr>
    		<td id="desc">Nome</td>
    		<td><%= ativoPC.getNomeProcessador() %></td>
    	</tr>
    	<tr>
    		<td id="desc">Frequência</td>
    		<td><%= ativoPC.getFrequenciaProcessador() %></td>
    	</tr>
    	<tr>
    		<td id="desc">Número de Cores</td>
    		<td><%= ativoPC.getCores() %></td>
    	</tr>
    	<tr>
    		<td id="desc">Arquitetura</td>
    		<td><%= ativoPC.getArquiteturaProcessador() %></td>
    	</tr>
    	</table>
    	
    	<p style="background:#444; color:white;">Bios</p>
    	
    	<table>
    	<tr>
    		<td id="desc">Número de Série:	</td>
    		<td><%= ativoPC.getNumeroSerie() %>	</td>
    	</tr>
    	<tr>
    		<td id="desc">Fabricante:</td>
    		<td><%= ativoPC.getFabricanteB() %></td>
    	</tr>
    	<tr>
    		<td id="desc">Modelo</td>
    		<td><%= ativoPC.getModeloBios() %></td>
    	</tr>
    	<tr>
    		<td id="desc">Fabricante da Bios:</td>
    		<td><%= ativoPC.getFabricanteBios() %></td>
    	</tr>
    	<tr>
    		<td id="desc">Versão da Bios:</td>
    		<td><%= ativoPC.getVersaoBios() %></td>
    	</tr>
    	
    	</table>
      	   <%
		} // fim pc
	%>
    		
    		<p style="background:#444; color:white;">Memoria</p>
    		
	<%
		List<Ativo> listMemoria = (List<Ativo>) request.getAttribute("listMemoria"); // CAST -- PESQUISAR
		for (Ativo ativoMemoria : listMemoria) {
	%>   		
    	<table>
    	<tr>
    		<td id="desc">Tipo de Memória	</td>
    		<td><%= ativoMemoria.getTipoMemoria() %></td>
    	</tr>
    	<tr>
    		<td id="desc">Frequência: </td>
    		<td> <%= ativoMemoria.getFrequenciaMemoria() %></td>
    	</tr>
    	<tr>
    		<td id="desc">Capacidade:</td>
    		<td> <%= ativoMemoria.getCapacidadeMemoria() %> mb</td>
    	</tr>
    	</table>
    	
    	   	   <%
		} // fim memoria
	%>
    	
    		<p style="background:#444; color:white;">Armazenamento </p></td>
 
    			<%
		List<Ativo> listArmazenamento = (List<Ativo>) request.getAttribute("listArmazenamento"); // CAST -- PESQUISAR
		for (Ativo ativoArmazenamento : listArmazenamento) {
	%>  
    		
      	<table>
    	<tr>
    	<td id="desc">Tipo: </td>
    		<td><%= ativoArmazenamento.getLetraDisco() %>  <%= ativoArmazenamento.getTipoDisco() %></td>
    		
    		
    	</tr>
    	<tr>
   			<td id="desc">Espaço:</td>
    		<td> <%= ativoArmazenamento.getEspacoTotal() %>  mb</td>
    		<td id="desc">Livre:</td>
    		<td> <%= ativoArmazenamento.getEspacoLivre() %>   mb</td>
    	</tr>
    	<tr>
    	<td id="desc"> Hardware:  </td>
    	<td> <%= ativoArmazenamento.getNomeDisco() %> </td>
    	</tr>
    	</table>
    	   	   <%
		} // fim armazenamento
	%>
    		<p  style="background:#444; color:white;">Vídeo</p>
    		
    			<%
		List<Ativo> listVideo = (List<Ativo>) request.getAttribute("listVideo"); // CAST -- PESQUISAR
		for (Ativo ativoVideo : listVideo) {
	%>   
    	<table>
    	<tr>
    		<td id="desc"> Nome: </td>
    		<td> <%= ativoVideo.getNomeFabricante() %>	</td>
    	</tr>
    	<tr>
    		<td id="desc">Chipset:</td>
    		<td id="desc">  <%= ativoVideo.getChipset() %>	</td>
    	</tr>
    	<tr>
    	<td id="desc"> Memória:   </td>
    		<td > <%= ativoVideo.getMemoriaVideo() %></td>
    		<td id="desc"> Resolução:   </td>
    		<td><%= ativoVideo.getResolucao() %></td>
    	</tr>
    	</table>
    	
    	 	   	   <%
		} // fim armazenamento
	%>
	
    		<p  style="background:#444; color:white;">Audio</p>
    		
    					<%
		List<Ativo> listAudio = (List<Ativo>) request.getAttribute("listAudio"); // CAST -- PESQUISAR
		for (Ativo ativoAudio : listAudio) {
	%>
    		<table>
    	</tr>
    	<tr>
    		<td id="desc">Nome:</td>
    		<td> <%= ativoAudio.getNomeAudio() %></td>
    		
    	</tr>
    	<tr>
    		<td id="desc">Fabricante:	</td>
    		<td> <%= ativoAudio.getFabricanteAudio() %> </td>
    	</tr>
    	<tr>
    		<td id="desc">Descrição:</td>
    		<td> <%= ativoAudio.getDescricaoAudio() %></td>
    	</tr>
    	</table>
    		
    	
    		 	   	   <%
		} // fim audio
	%>
	
    	<p  style="background:#444; color:white;"> Rede</p>
    	
    						<%
		List<Ativo> listRede = (List<Ativo>) request.getAttribute("listRede"); // CAST -- PESQUISAR
		for (Ativo ativoRede : listRede) {
	%>
    	<table>
    	<tr>
    		<td id="desc">Descrição:	</td>
    		<td> <%= ativoRede.getDescricaRede() %></td>
    	</tr>
    	<tr>
    		<td id="desc">Endereço MAC: </td>
    		<td> <%= ativoRede.getEndMac() %></td>
    	</tr>
    	<tr>
    		<td id="desc">Endereço Ip:</td>
    		<td> <%= ativoRede.getEndIp() %></td>
    	</tr>
    	<tr>
    		<td id="desc">Mascara:	</td>
    		<td> <%= ativoRede.getEndMask() %></td>
    	</tr>
    	<tr>
    		<td id="desc">Gataway:	</td>
    		<td><%= ativoRede.getEndGatway() %></td>
    	</tr>
    	
    </table>
    		 	   	   <%
		} // fim rede
	%>
  
 		</div><!--  Titulo -->
    </body>
</html>

