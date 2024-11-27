package com.hazem.medicaments.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hazem.medicaments.entities.Medicament;
import com.hazem.medicaments.service.MedicamentService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MedicamentRestController {
	@Autowired
	MedicamentService medicamentService;
	@RequestMapping(method=RequestMethod.GET)
	public List<Medicament> getAllMedicament(){
		return medicamentService.getAllMedicament();
		
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Medicament getMedicamentById(@PathVariable("id") Long id) {
	return medicamentService.getMedicament(id);
	 }
	@RequestMapping(method = RequestMethod.POST)
	public Medicament createMedicament(@RequestBody Medicament medicament) {
	return medicamentService.saveMedicament(medicament);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Medicament updateMedicament(@RequestBody Medicament medicament) {
	return medicamentService.updateMedicament(medicament);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteMedicament(@PathVariable("id") Long id)
	{
	medicamentService.deleteMedicamentById(id);
	}
	@RequestMapping(value="/medsnom/{nom}",method = RequestMethod.GET)
	public List<Medicament> getProduitsByNome(@PathVariable("nom") String nom) {
	return medicamentService.findByNomMed(nom);
	}
	@RequestMapping(value="/medscat/{idCat}",method = RequestMethod.GET)
	public List<Medicament> getByClassificationIdClass(@PathVariable("idCat") Long idClass) {
	return medicamentService.findByClassificationId(idClass);
	}

}
