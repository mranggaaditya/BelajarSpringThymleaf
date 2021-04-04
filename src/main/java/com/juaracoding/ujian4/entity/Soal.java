package com.juaracoding.ujian4.entity;





import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//
//@Entity
//@Table(name="soal")
//public class Soal {
//	
//	@Id
//	@Column(name="id_soal", length=10)
//	@NotNull
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	
//	@Column(name="nama_soal", length=25)
//	@NotNull
//	private String nama_soal;
//	
//	@Column(name="status", length=1)
//	@NotNull
//	private int status;
//	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="id_plot_mata_kuliah")
//	@NotNull
//	private PlotMataKuliah plotmk;
//	
//	
//
//}
