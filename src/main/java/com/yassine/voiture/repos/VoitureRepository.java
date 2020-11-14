package com.yassine.voiture.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yassine.voiture.entities.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {

}
