package com.juaracoding.ujian4.repository;

import org.springframework.data.repository.CrudRepository;

import com.juaracoding.ujian4.entity.Mahasiswa;


public interface MahasiswaRepository extends CrudRepository<Mahasiswa, Long> {
	
	public Mahasiswa findByNamaMahasiswa(String nama);
	public Mahasiswa findByIdMahasiswa(Long id);

}
