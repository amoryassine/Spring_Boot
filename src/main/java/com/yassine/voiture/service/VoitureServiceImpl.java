package com.yassine.voiture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


import com.yassine.voiture.entities.Voiture;
import com.yassine.voiture.repos.VoitureRepository;


@Service
public class VoitureServiceImpl implements VoitureService {
	
	@Autowired
	private VoitureRepository voitureRepository ;
	
	public Voiture saveVoiture(Voiture v) {
		return voitureRepository.save(v);
	}
	
	@Override
	public Voiture updateVoiture(Voiture v) {
		return voitureRepository.save(v);
	}
	
	@Override
	public void deleteVoiture(Voiture v) {
		voitureRepository.delete(v);
	}
	
	@Override
	public void deleteVoitureById(Long id) {
		voitureRepository.deleteById(id);
	}
	
	@Override
	public Voiture getVoiture(Long id) {
		return voitureRepository.findById(id).get();
	}
	
	@Override
	public List<Voiture> getAllVoiture() {
		return voitureRepository.findAll();
	}
	@Override
	public Page<Voiture> getAllVoitureParPage(int page, int size) {
	return voitureRepository.findAll(PageRequest.of(page, size));
	}
	
	
	

	

}