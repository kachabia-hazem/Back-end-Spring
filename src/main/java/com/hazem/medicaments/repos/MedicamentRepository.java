package com.hazem.medicaments.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hazem.medicaments.entities.Classification;
import com.hazem.medicaments.entities.Medicament;

@RepositoryRestResource(path = "rest")

public interface MedicamentRepository extends JpaRepository<Medicament, Long> {
List<Medicament> findByNomMed(String nom);
List<Medicament> findByNomMedContains(String nom);
//@Query("select m from Medicament m where m.nomMed like %?1 and m.prixMed > ?2")
//List<Medicament> findByNomPrix (String nom, Double prix);
@Query("select m from Medicament m where m.nomMed like %:nom% and m.prixMed > :prix")
List<Medicament> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);
@Query("select m from Medicament m where m.classification = ?1")
List<Medicament> findByClassification (Classification classification);
@Query("select m from Medicament m where m.classification.id = :id") // Correct reference to 'id' in Classification
List<Medicament> findByClassificationId(@Param("id") Long id);
List<Medicament> findByOrderByNomMedAsc();
@Query("select m from Medicament m order by m.nomMed ASC, m.prixMed DESC")
List<Medicament> trierMedicamentsNomsPrix ();

}

