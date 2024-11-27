package com.hazem.medicaments.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hazem.medicaments.entities.Classification;

public interface ClassificationRepository extends JpaRepository<Classification, Long> {
	

}
