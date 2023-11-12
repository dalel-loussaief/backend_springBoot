package com.example.vetements;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.vetements.entities.Genre;
import com.example.vetements.entities.Vetement;
import com.example.vetements.repo.VetementRepository;

@SpringBootTest
class VetementsApplicationTests {

	@Autowired
	private VetementRepository vetementRepository;
	@Test
	public void testCreateVetement() {
		Vetement vet = new Vetement("robe",220.500,new Date());
		vetementRepository.save(vet);
	}
	 @Test
	 public void testFindVetement()
	 {
		 Vetement v = vetementRepository.findById(1L).get(); 
	 System.out.println(v);
	 }
	 @Test
	 public void testUpdateVetement()
	 {
		 Vetement v= vetementRepository.findById(1L).get();
		 v.setPrixVetement(100.0);
		 vetementRepository.save(v);
	 }
	 @Test
	 public void testDeleteVetement()
	 {
		 vetementRepository.deleteById(1L);;
	 }
	 @Test
	 public void testListerTousVetement()
	 {
	 List<Vetement> vet = vetementRepository.findAll();
	 for (Vetement v : vet)
	 {
	 System.out.println(v);
	 }
	 }
	 @Test
	 public void testFindByNomVetement()
	 {
	 List<Vetement> vet = vetementRepository.findByNomVetement("robe blanche");
	 for (Vetement v : vet)
	 {
	 System.out.println(v);
	 }
	 }
	 @Test
	 public void testFindByNomProduitContains ()
	 {
	 List<Vetement> vet=vetementRepository.findByNomVetementContains("robe");
	 for (Vetement v : vet)
	 {
	 System.out.println(v);
	 } }
	 @Test
	 public void testfindByNomPrix()
	 {
	 List<Vetement> vet = vetementRepository.findByNomPrix("robe blanche", 220.5);
	 for (Vetement v : vet)
	 {
	 System.out.println(v);
	 }
	 }
		@Test
		public void testfindByGenre()
		{
			Genre cat = new Genre();
			cat.setIdG(1L);
			List<Vetement> prods = vetementRepository.findByGenre(cat);
			for (Vetement p : prods){
				System.out.println(p);
		}
		}
		@Test
		public void findByGenreIdG()
		{
		List<Vetement> vet =  vetementRepository.findByGenreIdG(1L);
		for (Vetement v : vet)
		{
		System.out.println(v);
		}
		 }
		@Test
		public void testfindByOrderByNomvetementAsc()
		{
		List<Vetement> vet = vetementRepository.findByOrderByNomVetementAsc();
		for (Vetement v : vet)
		{
		System.out.println(v);
		}
		}
		@Test
		public void  trierVetementNomsPrix()
		{
		List<Vetement> prods =vetementRepository.trierVetementNomsPrix();
		for (Vetement p : prods)
		{
		System.out.println(p);
		}
		}

}
