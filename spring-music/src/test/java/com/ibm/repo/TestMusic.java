package com.ibm.repo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ibm.entity.Music;

import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="classpath:appctx1.xml")
public class TestMusic {
	
	@Autowired
	private MusicRepository repo;
	
	@Test
	public void testSave() {
		Music m = new Music();
		m.setId(4);
		m.setArtist("TXT");
		m.setGenre("Rock");
		m.setRating(5);
		repo.save(m);
		
	}
	
	@Test
	public void testFetchById() {
		Music m = repo.fetch(2);
		System.out.println(m.getArtist()+" "+m.getGenre()+" "+m.getRating());
	}
	
	
	@Test
	public void testFetchAll() {
		List<Music> music = repo.fetchAll();
		music.forEach(System.out::println);
		
	}
	
	@Test
	public void testFetchByGenre() {
		List<Music> music = repo.fetchByGenre("Ballad");
		music.forEach(System.out::println);
	}

	@Test
	public void testUpdate() {
		Music m1 = new Music();
		m1.setId(6);
		m1.setArtist("StrayKids");
		m1.setGenre("KPOP");
		m1.setRating(5);
		repo.update(m1);
	}
}