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
@Table(name="dosen")
public class Dosen {
	
	@Id
	@Column(name="id_dosen", length=10)
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@NotNull
	private int id;
	
	@Column(name="username", length=25)
	@NotNull
	private String username;
	
	@Column(name="password", length=25)
	@NotNull
	private String password;
	
	@Column(name="nama_dosen", length=25)
	@NotNull
	private String nama_dosen;
	
	@OneToMany(mappedBy="dosen", cascade = CascadeType.ALL) 
	 List<PlotMataKuliah> lstPlotMataKuliah = new ArrayList<PlotMataKuliah>();
	
}
