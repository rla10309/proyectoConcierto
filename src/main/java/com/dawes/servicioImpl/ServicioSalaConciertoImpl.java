package com.dawes.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.SalaConciertoVO;
import com.dawes.repositorio.SalaConciertoRepository;
import com.dawes.servicio.ServicioSalaConcierto;

@Service
public class ServicioSalaConciertoImpl implements ServicioSalaConcierto {
	@Autowired
	SalaConciertoRepository scr;

	@Override
	public <S extends SalaConciertoVO> S save(S entity) {
		return scr.save(entity);
	}

	@Override
	public <S extends SalaConciertoVO> Iterable<S> saveAll(Iterable<S> entities) {
		return scr.saveAll(entities);
	}

	@Override
	public Optional<SalaConciertoVO> findById(Integer id) {
		return scr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return scr.existsById(id);
	}

	@Override
	public Iterable<SalaConciertoVO> findAll() {
		return scr.findAll();
	}

	@Override
	public Iterable<SalaConciertoVO> findAllById(Iterable<Integer> ids) {
		return scr.findAllById(ids);
	}

	@Override
	public long count() {
		return scr.count();
	}

	@Override
	public void deleteById(Integer id) {
		scr.deleteById(id);
	}

	@Override
	public void delete(SalaConciertoVO entity) {
		scr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		scr.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends SalaConciertoVO> entities) {
		scr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		scr.deleteAll();
	}
	
	

}
