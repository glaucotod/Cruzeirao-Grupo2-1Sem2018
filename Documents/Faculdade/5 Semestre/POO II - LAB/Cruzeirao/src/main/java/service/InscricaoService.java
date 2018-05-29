package service;

import java.util.List;

import dados.Dados;
import models.Inscricao;

public class InscricaoService {

		public List <Inscricao> inscricoes = Dados.inscricoes;
				
		public InscricaoService(){
		}
		
		public void salvar(Inscricao inscricao){
			inscricoes.add(inscricao);
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

