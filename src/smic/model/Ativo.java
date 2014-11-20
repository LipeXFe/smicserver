package smic.model;

public class Ativo {

	private int idAtivo;
	public int getdAtvo(){ return idAtivo;	}
	public void setIdAtivo(int idAtivo){this.idAtivo = idAtivo;}
	
	
	/* ---- Informações do sistema operacional ---- */
	
	private String nomePc;
	public String getNomePc(){ return nomePc;	}
	public void setNomePc(String nomePc){this.nomePc = nomePc;}
	
	private String sistemaOp;
	public String getSistemaOp(){ return sistemaOp;	}
	public void setSistemaOp(String sistemaOp){this.sistemaOp = sistemaOp;}
	
	private String versaoOp;
	public String getVersaoOp(){ return versaoOp;	}
	public void setVersaoOp(String versaoOp){this.versaoOp = versaoOp;}
	
	private String dominio;
	public String getDominio(){ return dominio;	}
	public void setDominio(String dominio){this.dominio = dominio;}
	
	/* ---- Processador ---- */
	
	private String fabricanteProcessador;
	public String getFabricante(){ return fabricanteProcessador;	}
	public void setFabricante(String fabricanteProcessador){this.fabricanteProcessador = fabricanteProcessador;}
	
	private String nomeProcessador;
	public String getNomeProcessador(){ return nomeProcessador;	}
	public void setProcessador(String nomeProcessador){this.nomeProcessador = nomeProcessador;}
	
	private String frequenciaProcessador;
	public String getFrequenciaProcessador(){ return frequenciaProcessador;	}
	public void setFrequenciaProcesador(String frequenciaProcessador){this.frequenciaProcessador = frequenciaProcessador;}
	
	private String cores;
	public String getCores(){ return cores;	}
	public void setCores(String cores){this.cores = cores;}
	
	private String arquiteturaProcessador;
	public String getArquiteturaProcessador(){ return arquiteturaProcessador;	}
	public void setArquiteturaProcessador(String arquiteturaProcessador){this.arquiteturaProcessador = arquiteturaProcessador;}
	
	/* ---- Memoria ---- */
	
	private String tipoMemoria;
	public String getTipoMemoria(){ return tipoMemoria;	}
	public void setTipoMemoria(String tipoMemoria){this.tipoMemoria = tipoMemoria;}
	
	private String frequenciaMemoria;
	public String getFrequenciaMemoria(){ return frequenciaMemoria;	}
	public void setFrequenciaMemoria(String frequenciaMemoria){this.frequenciaMemoria = frequenciaMemoria;}
	
	private String capacidadeMemoria;
	public String getCapacidadeMemoria(){ return capacidadeMemoria;	}
	public void setCapacidadeMemoria(String capacidadeMemoria){this.capacidadeMemoria = capacidadeMemoria;}
	
	
	/*  ---- Armazenamento ---- */
	
	private String letraDisco;
	public String getLetraDisco(){ return letraDisco;	}
	public void setLetraDisco(String letraDisco){this.letraDisco = letraDisco;}
	
	private String tipoDisco;
	public String getTipoDisco(){ return tipoDisco;	}
	public void setTipoDisco(String tipoDisco){this.tipoDisco = tipoDisco;}
	
	private String espacoTotal;
	public String getEspacoTotal(){ return espacoTotal;	}
	public void setEspacoTotal(String espacoTotal){this.espacoTotal = espacoTotal;}

	private String espacoLivre;
	public String getEspacoLivre(){ return espacoLivre;	}
	public void setEspacoLivre(String espacoLivre){this.espacoLivre = espacoLivre;}
	
	private String nomeDisco;
	public String getNomeDisco(){ return nomeDisco;	}
	public void setNomeDisco(String nomeDisco){this.nomeDisco = nomeDisco;}
	
	
	/* ---- Video ---- */
	
	private String nomeFabricante;
	public String getNomeFabricante(){ return nomeFabricante;	}
	public void setNomeFabricante(String nomeFabricante){this.nomeFabricante = nomeFabricante;}
	
	private String chipset;
	public String getChipset(){ return chipset;	}
	public void setChipset(String chipset){this.chipset = chipset;}
	
	private String memoriaVideo;
	public String getMemoriaVideo(){ return memoriaVideo;	}
	public void setMemoriaVideo(String memoriaVideo){this.memoriaVideo = memoriaVideo;}
	
	private String resolucao;
	public String getResolucao(){ return resolucao;	}
	public void setResolucao(String resolucao){this.resolucao = resolucao;}
	
	
	/* ---- Audio ----- */
	
	private String descricaoAudio;
	public String getDescricaoAudio(){ return descricaoAudio;	}
	public void setDescricaoAudio(String descricaoAudio){this.descricaoAudio = descricaoAudio;}
	
	private String nomeAudio;
	public String getNomeAudio(){ return nomeAudio;	}
	public void setNomeAudio(String nomeAudio){this.nomeAudio = nomeAudio;}
	

	private String fabricanteAudio;
	public String getFabricanteAudio(){ return fabricanteAudio;	}
	public void setFabricanteAudio(String fabricanteAudio){this.fabricanteAudio = fabricanteAudio;}
	

	/* ---- Bios ---- */
	
	
	private String numeroSerie;
	public String getNumeroSerie(){ return numeroSerie;	}
	public void setNumeroSerie(String numeroSerie){this.numeroSerie = numeroSerie;}
	
	private String fabricanteB;
	public String getFabricanteB(){ return fabricanteB;}
	public void setFabricanteB(String fabricanteB){this.fabricanteB = fabricanteB;}
	
	private String fabricanteBios;
	public String getFabricanteBios(){ return fabricanteBios;	}
	public void setFabricanteBios(String fabricanteBios){this.fabricanteBios = fabricanteBios;}
	

	private String modeloBios;
	public String getModeloBios(){ return modeloBios;	}
	public void setModeloBios(String modeloBios){this.modeloBios = modeloBios;}
	

	private String versaoBios;
	public String getVersaoBios(){ return versaoBios;	}
	public void setVersaoBios(String versaoBios){this.versaoBios = versaoBios;}
	
	
	/* ---- Rede ---- */
	
	private String descricaRede;
	public String getDescricaRede(){ return descricaRede;	}
	public void setDescricaRede(String descricaRede){this.descricaRede = descricaRede;}

	private String endMac;
	public String getEndMac(){ return endMac;	}
	public void setEndMac(String endMac){this.endMac = endMac;}
	
	private String endIp;
	public String getEndIp(){ return endIp;	}
	public void setEndIp(String endIp){this.endIp = endIp;}
	
	private String endMask;
	public String getEndMask(){ return endMask;	}
	public void setEndMask(String endMask){this.endMask = endMask;}

	private String endGatway;
	public String getEndGatway(){ return endGatway;	}
	public void setEndGatway(String endGatway){this.endGatway = endGatway;}
	
}
