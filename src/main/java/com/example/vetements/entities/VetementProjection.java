package com.example.vetements.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomvet", types = { Vetement.class })
public interface VetementProjection {
	public String getNomVetement();
}
