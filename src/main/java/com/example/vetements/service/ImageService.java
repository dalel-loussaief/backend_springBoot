package com.example.vetements.service;
import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.example.vetements.entities.Image;

public interface ImageService {
	Image uplaodImage(MultipartFile file) throws IOException;
	 Image getImageDetails(Long id) throws IOException;
	 ResponseEntity<byte[]> getImage(Long id) throws IOException;
	 void deleteImage(Long id) ;
	 
	 Image uplaodImageVet(MultipartFile file,Long idvet) throws IOException;
	 List<Image> getImagesParVet(Long vetId);

	 
	 
}
