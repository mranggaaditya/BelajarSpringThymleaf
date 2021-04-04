package com.juaracoding.ujian4.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="mata_kuliah")

public class MataKuliah {
	
	@Id
	@Column(name="id_mata_kuliah", length=10)
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	
	@Column(name="nama_mata_kuliah", length= 25)
	@NotNull
	private String namaMataKuliah;
	
	@OneToMany(mappedBy="matakuliah", cascade = CascadeType.ALL) 
	 List<PlotMataKuliah> lstPlotMataKuliah = new ArrayList<PlotMataKuliah>();
	
	
}
