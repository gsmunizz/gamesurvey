package com.gmdev.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmdev.dspesquisa.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
