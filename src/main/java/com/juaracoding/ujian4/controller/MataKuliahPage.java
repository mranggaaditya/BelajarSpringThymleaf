package com.juaracoding.ujian4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.juaracoding.ujian4.entity.MataKuliah;
import com.juaracoding.ujian4.services.ModelMataKuliah;


@Controller
public class MataKuliahPage {
	
	@Autowired
	ModelMataKuliah modelmatakuliah;
	
	
	@GetMapping("/matakuliah/view")
	public String viewIndexMataKuliah(Model model) {
		
		model.addAttribute("listMataKuliah",modelmatakuliah.getAllMataKuliah());
		
		return "view_matakuliah";
	}
	
	
	@GetMapping("/matakuliah/add")
	public String viewAddMataKuliah(Model model) {
		
		// buat penampung data matakuliah di halaman htmlnya
		model.addAttribute("matakuliah",new MataKuliah());
		
		return "add_matakuliah";
	}
	
	@PostMapping("/matakuliah/view")
	  public String addMataKuliah(@ModelAttribute MataKuliah matakuliah, Model model) {
		
		// buat penampung data matakuliah di halaman htmlnya
		this.modelmatakuliah.addMataKuliah(matakuliah);
		model.addAttribute("listMataKuliah",modelmatakuliah.getAllMataKuliah());
		
		
		return "view_matakuliah";
	}
	
	
	@GetMapping("/matakuliah/update/{id}")
	public String viewUpdateMataKuliah(@PathVariable String id, Model model) {
		
		MataKuliah matakuliah = modelmatakuliah.getMataKuliahById(id);
		// buat penampung data matakuliah di halaman htmlnya
		model.addAttribute("matakuliah",matakuliah);
		
		return "add_matakuliah";
	}
	
	@GetMapping("/matakuliah/delete/{id}")
	public String deleteMataKuliah(@PathVariable String id, Model model) {
		
		this.modelmatakuliah.deleteMataKuliah(id);
		model.addAttribute("listMataKuliah",modelmatakuliah.getAllMataKuliah());
		
		
		return "view_matakuliah";
	}

}
