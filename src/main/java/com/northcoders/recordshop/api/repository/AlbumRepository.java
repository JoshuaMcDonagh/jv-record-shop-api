package com.northcoders.recordshop.api.repository;

import com.northcoders.recordshop.api.model.Album;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Long> {
}
