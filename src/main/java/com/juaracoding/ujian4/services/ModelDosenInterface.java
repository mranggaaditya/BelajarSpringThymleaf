package com.juaracoding.ujian4.services;

import java.util.List;

import com.juaracoding.ujian4.entity.Dosen;

public interface ModelDosenInterface {
	
	public List<Dosen> getAllDosen();
	public Dosen getDosenByName(String name);
	
	public Dosen addDosen(Dosen dosen);
	public Dosen getDosenById(String id);
	public void deleteDosen(String id);

}
