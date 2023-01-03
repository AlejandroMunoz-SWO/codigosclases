package com.example.ejuno.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ejuno.model.Band;
import com.example.ejuno.repo.IBandRepo;

@Service
public class BandService {

  @Autowired
  private IBandRepo bandRepo;

  public Band saveBand(Band band){
    return bandRepo.save(band);
  }

  public List<Band> bandsList(){
    return bandRepo.findAll();
  }

}
