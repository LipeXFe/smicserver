package smic.model.db.dao;

import java.util.List;

import smic.model.Ativo;


public interface AtivoDao {
	
    List<Ativo> listPC(String idAtivo);
    List<Ativo> listMemoria(String idAtivo);
    List<Ativo> listArmazenamento(String idAtivo);
    List<Ativo> listVideo(String idAtivo);
    List<Ativo> listAudio(String idAtivo);
    List<Ativo> listRede(String idAtivo);

}







