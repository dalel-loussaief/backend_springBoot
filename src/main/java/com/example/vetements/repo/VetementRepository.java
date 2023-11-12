package com.example.vetements.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.vetements.dto.VetementDTO;
import com.example.vetements.entities.Genre;
import com.example.vetements.entities.Vetement;

@RepositoryRestResource(path = "rest")
public interface VetementRepository extends JpaRepository<Vetement, Long> {
	List<Vetement> findByNomVetement(String nomVetement);
	 List<Vetement> findByNomVetementContains(String nomVetement);
	 /*@Query("select v from Vetement v where v.nomVetement like %?1 and v.prixVetement > ?2")
	List<Vetement> findByNomPrix (String nom, Double prix);*/
	 
	 @Query("select v from Vetement v where v.nomVetement like %:nom and v.prixVetement > :prix")
		List<Vetement> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	 
	 @Query("select v from Vetement v where v.genre = ?1")
	List<Vetement> findByGenre (Genre genre);
	 
	 List<Vetement> findByGenreIdG(Long id);
	 List<Vetement> findByOrderByNomVetementAsc();
		
	@Query("select v from Vetement v order by v.nomVetement ASC, v.prixVetement DESC")
	List<Vetement> trierVetementNomsPrix ();
	Vetement save(VetementDTO v);
}
