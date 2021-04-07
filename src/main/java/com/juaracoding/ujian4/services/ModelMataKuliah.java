package com.juaracoding.ujian4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juaracoding.ujian4.entity.MataKuliah;
import com.juaracoding.ujian4.repository.MataKuliahRepository;


@Service
public class ModelMataKuliah implements ModelMataKuliahInterface{
	
	@Autowired
	MataKuliahRepository matakuliahRepo;

	@Override
	public List<MataKuliah> getAllMataKuliah() {
		// TODO Auto-generated method stub
		return (List<MataKuliah>) this.matakuliahRepo.findAll();
	}

	@Override
	public MataKuliah getMataKuliahByName(String nama) {
		// TODO Auto-generated method stub
		return this.matakuliahRepo.findByNamaMataKuliah(nama);
	}

	@Override
	public MataKuliah addMataKuliah(MataKuliah matakuliah) {
		// TODO Auto-generated method stub
		
		return  this.matakuliahRepo.save(matakuliah);
	
	}

	@Override
	public MataKuliah getMataKuliahById(String id) {
		// TODO Auto-generated method stub
		
		return 	((MataKuliah)this.matakuliahRepo.findByIdMataKuliah(Long.parseLong(id)));
		
		
	}

	@Override
	public void deleteMataKuliah(String id) {
		// TODO Auto-generated method stub
		this.matakuliahRepo.deleteById(Long.parseLong(id));
		
	}

}
