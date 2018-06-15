package service;

import java.util.List;

import dados.Dados;
import dao.GolDAO;
import dao.InscricoesDAO;
import models.Inscricao;

public class InscricaoService {

		public List <Inscricao> inscricoes = Dados.inscricoes;
		private InscricoesDAO dao = new InscricoesDAO();
				
		public InscricaoService(){
		}
		
		public void salvar(Inscricao inscricao){
			inscricoes.add(inscricao);
			dao.save(inscricao);
			dao.closeEntityManager();
		}
		
		public void remove(Inscricao inscricao){
			inscricoes.remove(inscricao);
		}

		public List <Inscricao> getInscricoes(){
			return inscricoes;
		}
		
		public int getQuantidaInscritos(){
			return inscricoes.size();
		}
		
}

