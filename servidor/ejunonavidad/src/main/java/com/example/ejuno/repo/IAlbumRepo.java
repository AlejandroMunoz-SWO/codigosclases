package com.example.ejuno.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejuno.model.Album;

@Repository
public interface IAlbumRepo extends JpaRepository<Album,Long> {
  
}
