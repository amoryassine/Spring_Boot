package com.yassine.voiture.service;

import java.util.List;

import com.yassine.voiture.entities.Voiture;

public interface VoitureService {
	
	static Voiture saveVoiture(Voiture v) {
		// TODO Auto-generated method stub
		return null;
	}
	
	Voiture updateVoiture(Voiture v);
	
	void deleteVoiture(Voiture v);
	
	void deleteVoitureById(Long id);
	
	Voiture getVoiture(Long id);

	
	List<Voiture> getAllVoiture();


	


}
