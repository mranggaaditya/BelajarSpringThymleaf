package com.juaracoding.ujian4.services;

import java.util.List;

import com.juaracoding.ujian4.entity.Mahasiswa;


public interface ModelMahasiswaInterface {
	
	public List<Mahasiswa> getAllMahasiswa();
	public Mahasiswa getMahasiwaByName(String name);
	
	public Mahasiswa addMahasiswa(Mahasiswa mahasiswa);
	public Mahasiswa getMahasiswaById(String id);
	public void deleteMahasiswa(String id);

}
