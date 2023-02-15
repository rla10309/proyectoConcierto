package com.dawes.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ventas", uniqueConstraints = @UniqueConstraint(columnNames = "idconcierto"))
public class VentaVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idventa;
	private LocalDate fechaventa;
	private LocalTime horaventa;
	private String dnicomprador;
	@ManyToOne
	@JoinColumn(name="idconcierto")
	private ConciertoVO concierto;
	private int numentradas;
	@ManyToOne
	@JoinColumn(name="idsala")
	private SalaVO sala;
	public VentaVO(LocalDate fechaventa, LocalTime horaventa, String dnicomprador, ConciertoVO concierto,
			int numentradas, SalaVO sala) {
		super();
		this.fechaventa = fechaventa;
		this.horaventa = horaventa;
		this.dnicomprador = dnicomprador;
		this.concierto = concierto;
		this.numentradas = numentradas;
		this.sala = sala;
	}
	
	
	

}
