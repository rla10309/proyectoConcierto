package com.dawes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="salasconciertos")
public class SalaConciertoVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idsalaconcierto;
	
	@ManyToOne
	@JoinColumn(name="idsala")
	private SalaVO sala;
	@ManyToOne
	@JoinColumn(name="idconcierto")
	private ConciertoVO concierto;
	
	
	public SalaConciertoVO(SalaVO sala, ConciertoVO concierto) {
		super();
		this.sala = sala;
		this.concierto = concierto;
	}
	
	
	
	

}
