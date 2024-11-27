package com.hazem.medicaments.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomMed", types = { Medicament.class })
public interface MedicamentProjection {
	public String getNomMedicament();
	

}
