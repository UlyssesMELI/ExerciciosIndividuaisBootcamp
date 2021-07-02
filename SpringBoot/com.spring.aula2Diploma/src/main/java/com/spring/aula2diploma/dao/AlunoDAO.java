package com.spring.aula2diploma.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.spring.aula2diploma.models.Aluno;

public class AlunoDAO {

	private List<Aluno> lstAluno;
	
	public AlunoDAO() {
		lstAluno = new ArrayList<Aluno>();
	}
	
	public void add(Aluno aluno) {
		lstAluno.add(aluno);
	}
	
	public long getNextID() {
		return lstAluno.size()+1;
	}
	
	public Aluno get(long id) {
		Optional<Aluno> anuncioOpt = lstAluno.stream().filter(a -> a.getId() == id).findFirst();
		if(anuncioOpt.isPresent()) {
			return anuncioOpt.get();
		}
		return null;
	}
}
