package com.esoft.teste_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esoft.teste_spring.models.Jutsu;

@Repository
public interface JutsuRepository extends JpaRepository<Jutsu, Long>{

}
