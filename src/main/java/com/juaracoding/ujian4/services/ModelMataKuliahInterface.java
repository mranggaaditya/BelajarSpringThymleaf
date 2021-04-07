package com.juaracoding.ujian4.services;

import java.util.List;

import com.juaracoding.ujian4.entity.MataKuliah;

public interface ModelMataKuliahInterface {
	
	public List<MataKuliah> getAllMataKuliah();
	public MataKuliah getMataKuliahByName(String name);
	
	public MataKuliah addMataKuliah(MataKuliah matakuliah);
	public MataKuliah getMataKuliahById(String id);
	public void deleteMataKuliah(String id);

}
