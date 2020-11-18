package com.yassine.voiture.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yassine.voiture.entities.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
	
	
	List<Voiture> findBymarqueVoiture(String marque);
	List<Voiture> findBymarqueVoitureContains(String marque);

}
