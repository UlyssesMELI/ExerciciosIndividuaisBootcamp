package br.com.meli.praticahql.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.meli.praticahql.model.Diary;

public class DiaryDAO {

	private EntityManager em;
	
	public DiaryDAO(EntityManager em) {
		this.em = em;
	}
	
	public List<Diary> list() {
		TypedQuery<Diary> qry = this.em.createQuery("select * from Diary", Diary.class);
		return qry.getResultList();
	}
	
}
