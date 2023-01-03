package com.example.ejuno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejuno.model.Album;
import com.example.ejuno.service.AlbumSevice;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/api/album")
public class AlbumController {

  @Autowired
  private AlbumSevice albumSevice;


  @PostMapping("/save")  //  http://localhost:8080/api/album/save
  public Album save(@RequestBody Album album){
    return albumSevice.saveAlbum(album);

  }
  
}
