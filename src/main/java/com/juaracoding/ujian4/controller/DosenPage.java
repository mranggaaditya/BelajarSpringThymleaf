package com.juaracoding.ujian4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.juaracoding.ujian4.entity.Dosen;
import com.juaracoding.ujian4.services.ModelDosen;


@Controller
public class DosenPage {
	
	@Autowired
	ModelDosen modeldosen;
	
	
	@GetMapping("/dosen/view")
	public String viewIndexDosen(Model model) {
		
		model.addAttribute("listDosen",modeldosen.getAllDosen());
		
		return "view_dosen";
	}
	
	
	@GetMapping("/dosen/add")
	public String viewAddDosen(Model model) {
		
		// buat penampung data dosen di halaman htmlnya
		model.addAttribute("dosen",new Dosen());
		
		return "add_dosen";
	}
	
	@PostMapping("/dosen/view")
	  public String addDosen(@ModelAttribute Dosen dosen, Model model) {
		
		// buat penampung data dosen di halaman htmlnya
		this.modeldosen.addDosen(dosen);
		model.addAttribute("listDosen",modeldosen.getAllDosen());
		
		
		return "view_dosen";
	}
	
	
	@GetMapping("/dosen/update/{id}")
	public String viewUpdateDosen(@PathVariable String id, Model model) {
		
		Dosen dosen = modeldosen.getDosenById(id);
		// buat penampung data dosen di halaman htmlnya
		model.addAttribute("dosen",dosen);
		
		return "add_dosen";
	}
	
	@GetMapping("/dosen/delete/{id}")
	public String deleteDosen(@PathVariable String id, Model model) {
		
		this.modeldosen.deleteDosen(id);
		model.addAttribute("listDosen",modeldosen.getAllDosen());
		
		
		return "view_dosen";
	}

}
