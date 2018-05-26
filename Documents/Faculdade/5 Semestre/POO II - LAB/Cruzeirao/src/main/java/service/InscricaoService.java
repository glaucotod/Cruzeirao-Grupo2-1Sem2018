package service;

import java.util.ArrayList;
import java.util.List;

import dados.Dados;
import dao.InscricaoDAO;
import models.Inscricao;

public class InscricaoService {

		public ArrayList <Inscricao> inscricoes = Dados.inscricoes;
				//02
		private InscricaoDAO dao = new InscricaoDAO();
	
		public InscricaoService(){
		}
		
		public void salvar(Inscricao inscricao){
			inscricoes.add(inscricao);
			dao.save(inscricao);
		}
		
		public void remove(Inscricao inscricao){
			inscricoes.remove(inscricao);
			dao.remove(inscricao);
		}

		public List <Inscricao> getInscricoes(){
			return inscricoes;
		}
}
