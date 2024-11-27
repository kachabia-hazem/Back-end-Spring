package com.hazem.medicaments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazem.medicaments.entities.Classification;
import com.hazem.medicaments.entities.Medicament;
import com.hazem.medicaments.repos.MedicamentRepository;
@Service
public class MedicamentServiceimpl  implements MedicamentService {
	@Autowired
	

	MedicamentRepository medicamentRepository;
	@Override
	public Medicament saveMedicament(Medicament m) {
		
		return medicamentRepository.save(m);
	}

	@Override
	public Medicament updateMedicament(Medicament m) {
		
		return medicamentRepository.save(m);
	}

	@Override
	public void deleteMedicament(Medicament m) {
		medicamentRepository.delete(m);
		
	}

	@Override
	public void deleteMedicamentById(Long id) {
		medicamentRepository.deleteById(id);
		
		
	}

	@Override
	public Medicament getMedicament(Long id) {
		
		 return medicamentRepository.findById(id).get();
	}

	@Override
	public List<Medicament> getAllMedicament() {
		
		return medicamentRepository.findAll();
	}

	@Override
	public List<Medicament> findByNomMed(String nom) {
		
		return medicamentRepository.findByNomMedContains(nom);
	}

	@Override
	public List<Medicament> findByNomMedContains(String nom) {
	
		return medicamentRepository.findByNomMedContains(nom);
	}

	@Override
	public List<Medicament> findByNomPrix(String nom, Double prix) {
		
		return medicamentRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Medicament> findByClassification(Classification classification) {
		
		return medicamentRepository.findByClassification(classification);
	}

	@Override
	public List<Medicament> findByClassificationId(Long id) {
		
		return medicamentRepository.findByClassificationId(id);
	}

	@Override
	public List<Medicament> findByOrderByNomMedAsc() {
		
		return medicamentRepository.findByOrderByNomMedAsc();
	}

	@Override
	public List<Medicament> trierMedicamentsNomsPrix() {
		//
		return medicamentRepository.trierMedicamentsNomsPrix();
	}

}
