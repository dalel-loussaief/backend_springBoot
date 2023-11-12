package com.example.vetements.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.vetements.entities.Genre;
import com.example.vetements.repo.GenreRepository;

@RestController
@RequestMapping("/api/ge")
@CrossOrigin("*")
public class GenreRESTController {
	@Autowired
	GenreRepository genreRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Genre> getAllGenre()
	{
	return genreRepository.findAll();
	}
	@RequestMapping(value="/{idG}",method = RequestMethod.GET)
	public Genre getGenreById(@PathVariable("id") Long id) {
	return genreRepository.findById(id).get();
	}

}
