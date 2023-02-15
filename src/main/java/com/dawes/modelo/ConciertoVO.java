package com.dawes.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="conciertos")
public class ConciertoVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idconcierto;
	private String grupo;
	private LocalDate fecha;
	private LocalTime hora;
	private double preciotaquilla;
	private double precioanticipada;
	private int plazasdisponibles;
	
	public ConciertoVO(String grupo, LocalDate fecha, LocalTime hora, double preciotaquilla, double precioanticipada,
			int plazasdisponibles) {
		super();
		this.grupo = grupo;
		this.fecha = fecha;
		this.hora = hora;
		this.preciotaquilla = preciotaquilla;
		this.precioanticipada = precioanticipada;
		this.plazasdisponibles = plazasdisponibles;
	}
	
	
	
	

}
