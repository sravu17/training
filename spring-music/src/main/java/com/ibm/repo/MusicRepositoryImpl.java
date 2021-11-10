package com.ibm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;

import com.ibm.entity.Music;

@Repository("repo")
public class MusicRepositoryImpl implements MusicRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Transactional
	@Override
	public void save(Music music) {
		em.persist(music);
	}

	@Override
	public Music fetch(int id) {	
		return em.find(Music.class, id);
	}

	@Override
	public List<Music> fetchAll() { 
		return em.createQuery("from Music").getResultList();
	}

	@Override
	public List<Music> fetchByGenre(String genre) {
		Query query = em.createNamedQuery("byGenre");
		query.setParameter("gnr", genre);
		return query.getResultList();
	}

	@Transactional
		public void update(Music m) {
		em.merge(m);
		
	}
	

}
