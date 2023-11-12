package com.example.vetements.dto;

import java.util.Date;
import java.util.List;

import com.example.vetements.entities.Genre;
import com.example.vetements.entities.Image;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VetementDTO {
	private Long idVetement;
	private String nomVetement;
	private Double prixVetement;
	private Date dateprod;
	private Genre genre;
	private List<Image> images;
	//private String nom;
	//private String imagePath;
	//private Image image;

	
}
