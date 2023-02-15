package com.dawes.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="salas")
public class SalaVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idsala;
	private String nombre;
	private String direccion;
	private int aforo;
	@OneToMany(mappedBy="sala")
	private List<SalaConciertoVO> conciertos = new ArrayList<SalaConciertoVO>();
	
	@OneToMany(mappedBy="sala")
	private List<VentaVO> ventas;
	
	
	public SalaVO(String nombre, String direccion, int aforo) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.aforo = aforo;
	}
	
	

}
