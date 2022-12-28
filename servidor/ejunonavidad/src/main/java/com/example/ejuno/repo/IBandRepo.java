package com.example.ejuno.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejuno.model.Band;

@Repository
public interface IBandRepo extends JpaRepository<Band,Long> {
  
}
