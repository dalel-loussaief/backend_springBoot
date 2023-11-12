package com.example.vetements.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vetements.entities.Image;


@Repository
public interface ImageRepository extends JpaRepository<Image , Long> {
}
