package com.dawes.servicio;

import java.util.Optional;

import com.dawes.modelo.SalaConciertoVO;

public interface ServicioSalaConcierto {

	<S extends SalaConciertoVO> S save(S entity);

	<S extends SalaConciertoVO> Iterable<S> saveAll(Iterable<S> entities);

	Optional<SalaConciertoVO> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<SalaConciertoVO> findAll();

	Iterable<SalaConciertoVO> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(SalaConciertoVO entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends SalaConciertoVO> entities);

	void deleteAll();

}