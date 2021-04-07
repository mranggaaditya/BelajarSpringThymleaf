package com.juaracoding.ujian4.repository;

import org.springframework.data.repository.CrudRepository;

import com.juaracoding.ujian4.entity.Soal;


public interface SoalRepository extends CrudRepository<Soal, Long>{
	
	public Soal findByNamaSoal(String nama);

}
