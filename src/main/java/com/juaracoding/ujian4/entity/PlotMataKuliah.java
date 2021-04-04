package com.juaracoding.ujian4.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="plot_mata_kuliah")

public class PlotMataKuliah {
	
	@Id
	@Column(name="id_plot_mata_kuliah", length=10)
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_mata_kuliah")
	@NotNull
	private MataKuliah matakuliah;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_dosen")
	@NotNull
	private Dosen dosen;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="nim")
	@NotNull
	private Mahasiswa mahasiswa;
	
//	@OneToMany(mappedBy="plotmk", cascade = CascadeType.ALL)
//	List<Soal> lstSoal = new ArrayList <Soal>();
	
}
