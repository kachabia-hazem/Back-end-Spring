package com.hazem.medicaments.service;

import java.util.List;

import com.hazem.medicaments.entities.Classification;
import com.hazem.medicaments.entities.Medicament;

public interface MedicamentService {
	Medicament saveMedicament(Medicament m);
	Medicament updateMedicament(Medicament m);
	void deleteMedicament(Medicament m);
	 void deleteMedicamentById(Long id);
	Medicament getMedicament(Long id);
	List<Medicament> getAllMedicament();
	List<Medicament> findByNomMed(String nom);
	List<Medicament> findByNomMedContains(String nom);
	List<Medicament> findByNomPrix (String nom, Double prix);
	List<Medicament> findByClassification (Classification classification);
	List<Medicament> findByClassificationId(Long id);
	List<Medicament> findByOrderByNomMedAsc();
	List<Medicament> trierMedicamentsNomsPrix ();

	

}
