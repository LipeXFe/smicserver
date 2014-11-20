package smic.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import smic.model.Ativo;
import smic.model.db.dao.AtivoDaoJDBC;
import smic.model.db.dao.AtivoDao;

public class BuscarAtivo extends HttpServlet{
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		//Integer.parseInt();
		  String  idAtivo = req.getParameter("IdAtivo");
		 
		  List<Ativo> listPC;
		  List<Ativo> listMemoria;
		  List<Ativo> listArmazenamento;
		  List<Ativo> listVideo;
		  List<Ativo> listAudio;
		  List<Ativo> listRede;
		 
		  
		AtivoDao dao = new AtivoDaoJDBC();
		
		listPC = dao.listPC(idAtivo);
		listMemoria = dao.listMemoria(idAtivo);
		listArmazenamento = dao.listArmazenamento(idAtivo);
		listVideo = dao.listVideo(idAtivo);
		listAudio = dao.listAudio(idAtivo);
		listRede = dao.listRede(idAtivo);
		
		req.setAttribute("listPC", listPC);
		req.setAttribute("listMemoria", listMemoria);
		req.setAttribute("listArmazenamento", listArmazenamento);
		req.setAttribute("listVideo", listVideo);
		req.setAttribute("listAudio", listAudio);
		req.setAttribute("listRede", listRede);
		
		
		//System.out.println(listPC.size()); //
		//System.out.println(listMemoria.size()); //
		
		RequestDispatcher d = req.getRequestDispatcher("../visualizar.jsp");
		d.forward(req, resp);
		
		
		
	}
	}

