package com.northcoders.recordshop.api.repository;

import com.northcoders.recordshop.api.model.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreEntity extends CrudRepository<GenreEntity, Genre> {
}
