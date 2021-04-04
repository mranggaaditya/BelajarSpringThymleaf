package com.juaracoding.ujian4.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="mahasiswa")
public class Mahasiswa {
	
	@Id
	@Column(name="nim", length=8)
	@NotNull
	private int id;
	
	@Column(name="nama_mahasiswa", length=25)
	@NotNull
	private String nama_mahasiswa;
	
	@Column(name="jenis_kelamin", length=10)
	@NotNull
	private String jenis_kelamin;
	
	@Column(name="password", length=25)
	@NotNull
	private String password;
	
	@OneToMany(mappedBy="mahasiswa", cascade = CascadeType.ALL) 
	 List<PlotMataKuliah> lstPlotMataKuliah = new ArrayList<PlotMataKuliah>();

}
