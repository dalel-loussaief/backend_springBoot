package com.example.vetements.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.vetements.entities.Genre;

@RepositoryRestResource(path = "ge")
@CrossOrigin("*")
public interface GenreRepository  extends JpaRepository<Genre, Long>{

}
