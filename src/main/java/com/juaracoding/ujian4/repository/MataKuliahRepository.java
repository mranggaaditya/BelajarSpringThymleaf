package com.juaracoding.ujian4.repository;

import org.springframework.data.repository.CrudRepository;

import com.juaracoding.ujian4.entity.MataKuliah;


public interface MataKuliahRepository extends CrudRepository<MataKuliah, Long> {
	
	public MataKuliah findByNamaMataKuliah(String nama);
	public MataKuliah findByIdMataKuliah(Long id);

}
