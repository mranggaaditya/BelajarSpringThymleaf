 package com.juaracoding.ujian4;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juaracoding.ujian4.entity.Dosen;
import com.juaracoding.ujian4.entity.Mahasiswa;
import com.juaracoding.ujian4.entity.MataKuliah;
import com.juaracoding.ujian4.entity.PlotMataKuliah;
import com.juaracoding.ujian4.repository.DosenRepository;
import com.juaracoding.ujian4.repository.MahasiswaRepository;
import com.juaracoding.ujian4.repository.MataKuliahRepository;
import com.juaracoding.ujian4.repository.PlotMataKuliahRepository;
//import com.juaracoding.ujian4.repository.SoalRepository;

@SpringBootApplication
public class Ujian4Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Ujian4Application.class, args);
	}
	
	@Autowired
	PlotMataKuliahRepository plotmatakuliahrepository;
	
	@Autowired
	MataKuliahRepository matakuliahrepository;
	
	@Autowired
	DosenRepository dosenrepository;
	
//	@Autowired
//	SoalRepository soalrepository;
	
	@Autowired
	MahasiswaRepository mahasiswarepository;
	
	@Override
	public void run(String... args) throws Exception{
		
		PlotMataKuliah plotmatakuliah = new PlotMataKuliah();
		
		MataKuliah matakuliah1 = new MataKuliah();
		matakuliah1.setNamaMataKuliah("Kalkulus");
		
		Dosen dosen1 = new Dosen();
		dosen1.setUsername("Dewa");
		dosen1.setPassword("dewa");
		dosen1.setNama_dosen("Dewa Brata");
		
		Mahasiswa mahasiswa1 = new Mahasiswa();
		mahasiswa1.setId(123);
		mahasiswa1.setNama_mahasiswa("Rangga");
		mahasiswa1.setJenis_kelamin("Laki-laki");
		mahasiswa1.setPassword("rangga");
		
		plotmatakuliah.setMatakuliah(matakuliah1);
		plotmatakuliah.setDosen(dosen1);
		plotmatakuliah.setMahasiswa(mahasiswa1);
		
		this.plotmatakuliahrepository.save(plotmatakuliah);
		
		
		//masih belum bisa yang soal dan seterusnya
//		Soal soal1 = new Soal();
//		soal1.setNama_soal("Java");
//		soal1.setStatus(1);
//		
//		soal1.set
//		
//		this.soalrepository.save(soal1);
		
	}

}
