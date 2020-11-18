package com.yassine.voiture;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.yassine.voiture.entities.Voiture;
import com.yassine.voiture.repos.VoitureRepository;
import com.yassine.voiture.service.VoitureService;


@SpringBootTest
class VoitureApplicationTests {

	@Autowired
	private VoitureRepository voitureRepository ;
	@Autowired
	private VoitureService voitureService ;

	@Test
	public void testCreateVoiture() {
		Voiture v =new Voiture("peugeot","partner","120 TN 1258","Rouge","6 CV",5.0 ,new Date());
		voitureRepository.save(v);
		
	}
	@Test
	public void testFindVoiture(){ 
		Voiture v1 = voitureRepository.findById(1L).get();
		System.out.println(v1);
	}
	
	@Test
	public void testUpdateVoiture(){ 
		Voiture v3 = voitureRepository.findById(1L).get();
		v3.setPrix_par_heure(5.500);
		voitureRepository.save(v3);
	}
	
	@Test
	public void testDeleteVoiture() {
		voitureRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousVoiture(){
	List<Voiture> v = voitureRepository.findAll();
	for (Voiture i : v){
		
	System.out.println(i);
		}
	}
	
	@Test
	public void testFindBymarqueVoitureContains()
	{
	Page<Voiture> v = voitureService.getAllVoitureParPage(0,2);
	System.out.println(v.getSize());

	System.out.println(v.getTotalElements());
	System.out.println(v.getTotalPages());
	v.getContent().forEach(p -> {System.out.println(p.toString());
	});

	}
	
	
	
	
	
	
}