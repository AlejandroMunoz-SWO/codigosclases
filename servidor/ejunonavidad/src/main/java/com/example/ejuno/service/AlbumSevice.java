package com.example.ejuno.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejuno.model.Album;
import com.example.ejuno.repo.IAlbumRepo;

@Service
public class AlbumSevice {

  @Autowired
  private IAlbumRepo albumRepo;

  public Album saveAlbum(Album album){
    return albumRepo.save(album);
  }

  
}
