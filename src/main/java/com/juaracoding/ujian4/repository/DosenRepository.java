package com.juaracoding.ujian4.repository;

import org.springframework.data.repository.CrudRepository;

import com.juaracoding.ujian4.entity.Dosen;


public interface DosenRepository extends CrudRepository<Dosen, Long>{
	
	public Dosen findByNamaDosen(String nama);
	public Dosen findByIdDosen(Long id);

}
