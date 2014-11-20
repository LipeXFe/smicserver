package smic.model.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




import smic.model.Ativo;
import smic.model.db.connection.ConnectionFactory;

public class AtivoDaoJDBC implements AtivoDao {
	
		
		private ConnectionFactory factory;
		
		public AtivoDaoJDBC(){
			factory = new ConnectionFactory();
		}
		
		//----------------------------- informações PC ---------------------------

		public List<Ativo> listPC(String idAtivo) {
			
			List<Ativo> ativo = new ArrayList<Ativo>();

		

			Connection con = factory.createConnection();
			//String idBusca = idAtivo;		

			if (con != null) {
				try {

					
						
					String sql = " select h.id, h.name, h.osname, h.osversion, h.workgroup, "
								+	     "c.manufacturer, c.type, c.speed, c.CORES, c.CPUARCH, "
								+	     "b.ssn, b.SMANUFACTURER, b.smodel, b.bMANUFACTURER, b.bversion " 
								+   "from hardware h, cpus c, bios b " 
								+  "where b.ssn = ? and  c.id = h.id and h.id = b.hardware_id"; // 
					
					
					System.out.println(idAtivo);
					PreparedStatement st = con.prepareStatement(sql);
					st.setString(1, idAtivo);
					
				//	Statement st = con.createStatement();
					ResultSet rs = st.executeQuery();

					while (rs.next()) {
						
						 int idProcessador = rs.getInt("id");
						 
						//informações do sistema operacional
						String nomePC = rs.getString("name");
						String nomeOS = rs.getString("osname");
						String  versaoOS  = rs.getString("osversion");
						String dominio = rs.getString("workgroup");
						//processador
						String fabricante = rs.getString("MANUFACTURER");
						String processador = rs.getString("TYPE");
						String frequenciaProcessador = rs.getString("SPEED");
						String cores = rs.getString("CORES");
						String arquiteturaProcssador = rs.getString("CPUARCH");
						//bios
						String nbios = rs.getString("ssn");
						String fbBios = rs.getString("SMANUFACTURER");
						String modeloBios = rs.getString("smodel");
						String fbDaBios = rs.getString("bMANUFACTURER");
						String versBios = rs.getString("bversion");
												
						Ativo p = new Ativo();
						
						p.setNomePc(nomePC);
						p.setSistemaOp(nomeOS);
						p.setVersaoOp(versaoOS);
						p.setDominio(dominio);
											
						p.setIdAtivo(idProcessador);
						p.setFabricante(fabricante);
						p.setProcessador(processador);
						p.setFrequenciaProcesador(frequenciaProcessador);
						p.setCores(cores);
						p.setArquiteturaProcessador(arquiteturaProcssador);

						p.setNumeroSerie(nbios);
						p.setFabricanteB(fbBios);
						p.setModeloBios(modeloBios);
						p.setFabricanteBios(fbDaBios);
						p.setVersaoBios(versBios);
				
						ativo.add(p);

					}
				} catch (Exception e) {
					
					e.printStackTrace();
				} finally {
					factory.closeConnection(con);

				}	
			}
			return ativo;
		}
	
 // -------------------------- informações Memoria -----------------
		
		public List<Ativo> listMemoria(String idAtivo) {
			
			List<Ativo> ativoMemoria = new ArrayList<Ativo>();
			
			Connection con = factory.createConnection();
			String idBusca = idAtivo;		

			if (con != null) {
				try {

					// 2. statement - sql
						
					String sql = "select m.type, m.speed, m.capacity from memories m, bios b where "
							+ " m.hardware_id = b.hardware_id and  b.ssn = 'BRG217F42C' ";
					
					PreparedStatement st = con.prepareStatement(sql);
				//	st.setString(1, idBusca);
					
					//Statement st = con.createStatement();
					ResultSet rs = st.executeQuery(sql);

					while (rs.next()) {  // tratar erro caso retorne nulo
						
						String tipoMemoria = rs.getString("type");
						String frequencia = rs.getString("speed");
						String capacidade = rs.getString("capacity");
																
						Ativo p = new Ativo();
						
						p.setTipoMemoria(tipoMemoria);
						p.setFrequenciaMemoria(frequencia);
						p.setCapacidadeMemoria(capacidade);
					
						ativoMemoria.add(p);

					}
				} catch (Exception e) {
					
					e.printStackTrace();
				} finally {
					factory.closeConnection(con);

				}	
			}
			return ativoMemoria;
		}
		
		
// -------------------------- informações Armazenamento -----------------
		
		public List<Ativo> listArmazenamento(String idAtivo) {
					
					List<Ativo> ativoArmazenamento = new ArrayList<Ativo>();
					
					Connection con = factory.createConnection();
					String idBusca = idAtivo;		

					if (con != null) {
						try {

							// 2. statement - sql
								
							String sql = "select  d.letter, d.type, d.total, d.free, s.name from drives d,"
									+ " storages  s, bios b "
									+ "	where d.hardware_id =  s.hardware_id  and d.hardware_id= b.hardware_id"
									+ " and b.ssn = 'BRG217F42C'";
							
						PreparedStatement st = con.prepareStatement(sql);
							//st.setString(1, idBusca);
							
							//Statement st = con.createStatement();
							ResultSet rs = st.executeQuery(sql);

							while (rs.next()) {  // tratar erro caso retorne nulo
								
								String letraHD = rs.getString("letter");
								String tipoHD = rs.getString("type");
								String espacoTotal = rs.getString("total");
								String espacoLivre = rs.getString("free");
								String nomeHD = rs.getString("name");
								
																		
								Ativo p = new Ativo();
								
								p.setLetraDisco(letraHD);
								p.setTipoDisco(tipoHD);
								p.setEspacoTotal(espacoTotal);
								p.setEspacoLivre(espacoLivre);
								p.setNomeDisco(nomeHD);
							
								ativoArmazenamento.add(p);

							}
						} catch (Exception e) {
							
							e.printStackTrace();
						} finally {
							factory.closeConnection(con);

						}	
					}
					return ativoArmazenamento;
				}
	 // -------------------------- informações Video -----------------
				
		public List<Ativo> listVideo(String idAtivo) {
					
					List<Ativo> ativoVideo = new ArrayList<Ativo>();
					
					Connection con = factory.createConnection();
					String idBusca = idAtivo;		

					if (con != null) {
						try {

							// 2. statement - sql
								
							String sql = "select v.name, v.chipset, v.memory, v.resolution "
									+ " from videos v,  bios b"
									+ " where v.hardware_id = b.hardware_id and b.ssn = 'BRG217F42C'";
							
							PreparedStatement st = con.prepareStatement(sql);
						//	st.setString(1, idBusca);
							
							//Statement st = con.createStatement();
							ResultSet rs = st.executeQuery(sql);

							while (rs.next()) {  // tratar erro caso retorne nulo
								
								String nomeVideo = rs.getString("name");
								String chipsetVideo = rs.getString("chipset");
								String memoriaVideo = rs.getString("memory");
								String resolucaoVideo = rs.getString("resolution");
																		
								Ativo p = new Ativo();
								
								p.setNomeFabricante(nomeVideo);
								p.setChipset(chipsetVideo);
								p.setMemoriaVideo(memoriaVideo);
								p.setResolucao(resolucaoVideo);
							
								ativoVideo.add(p);

							}
						} catch (Exception e) {
							
							e.printStackTrace();
						} finally {
							factory.closeConnection(con);

						}	
					}
					return ativoVideo;
				}
				
				 // -------------------------- informações Audio -----------------
				
		public List<Ativo> listAudio(String idAtivo) {
					
					List<Ativo> ativoAudio = new ArrayList<Ativo>();
					
					Connection con = factory.createConnection();
					String idBusca = idAtivo;		

					if (con != null) {
						try {

							// 2. statement - sql
								
							String sql = "select s.name, s.manufacturer, s.description from sounds s, bios b "
									+ "where s.hardware_id = b.hardware_id and b.ssn = 'BRG217F42C'";
							
							PreparedStatement st = con.prepareStatement(sql);
						//	st.setString(1, idBusca);
							
							//Statement st = con.createStatement();
							ResultSet rs = st.executeQuery(sql);
							System.out.println(rs);

							while (rs.next()) {  // tratar erro caso retorne nulo
								
								String nomeAudio = rs.getString("name");
								String nomeFabricante = rs.getString("manufacturer");
								String descricao = rs.getString("description");
																		
								Ativo p = new Ativo();
								
								p.setNomeAudio(nomeAudio);
								p.setFabricanteAudio(nomeFabricante);
								p.setDescricaoAudio(descricao);
							
								ativoAudio.add(p);

							}
						} catch (Exception e) {
							
							e.printStackTrace();
						} finally {
							factory.closeConnection(con);

						}	
					}
					return ativoAudio;
				}
					
				
				 // -------------------------- informações Rede -----------------
				
		public List<Ativo> listRede(String idAtivo) {
					
					List<Ativo> ativoRede = new ArrayList<Ativo>();
					
					Connection con = factory.createConnection();
					String idBusca = idAtivo;		

					if (con != null) {
						try {

							// 2. statement - sql
								
							String sql = "select n.description, n.macaddr, n.ipaddress, n.ipmask, n.ipgateway"
									+ " from networks n, bios b "
									+ " where n.hardware_id = b.hardware_id and b.ssn = 'BRG217F42C'";
							
							PreparedStatement st = con.prepareStatement(sql);
						//	st.setString(1, idBusca);
							
							//statement st = con.createStatement();
							ResultSet rs = st.executeQuery(sql);

							while (rs.next()) {  // tratar erro caso retorne nulo
								
								String descricaoRede = rs.getString("description");
								String addrMAC = rs.getString("macaddr");
								String addrIP = rs.getString("ipaddress");
								String mask = rs.getString("ipmask");
								String gtw = rs.getString("ipgateway");
																		
								Ativo p = new Ativo();
								
								p.setDescricaRede(descricaoRede);
								p.setEndMac(addrMAC);
								p.setEndIp(addrIP);
								p.setEndMask(mask);
								p.setEndGatway(gtw);
								
							
								ativoRede.add(p);

							}
						} catch (Exception e) {
							
							e.printStackTrace();
						} finally {
							factory.closeConnection(con);

						}	
					}
					return ativoRede;
				}
				

}
