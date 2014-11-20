smicserver
==========

SOFTWARE MANAGEMENT INFORMATION COMPUTING
*** Felipe Augusto ***

Pré-requisito:
- Servidor Tomcat
- OCS Inventory NG Instalado no máquina

Modo de utilização:

Para utilizar o sistema você só precisa exportar para o servidor tomcat e trocar o endereço 
de conexão de banco de dados, o login e senha do servidor no arquivo:

\smicserver\src\smic\model\db\connection\ConnectionFactory.java


	public Connection createConnection(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://ENDEREÇO DO SERVIDOR/ocsweb?" + "user=USUARIO&password=SENHA");

			return con;
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
	
