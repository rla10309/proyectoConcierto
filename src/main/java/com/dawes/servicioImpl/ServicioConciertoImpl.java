package com.dawes.servicioImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.modelo.ConciertoVO;
import com.dawes.repositorio.ConciertoRepository;
import com.dawes.servicio.ServicioConcierto;

@Service
public class ServicioConciertoImpl implements ServicioConcierto {
	@Autowired
	ConciertoRepository cr;

	@Override
	public Optional<ConciertoVO> findByGrupo(String grupo) {
		return cr.findByGrupo(grupo);
	}

	@Override
	public <S extends ConciertoVO> S save(S entity) {
		return cr.save(entity);
	}

	@Override
	public <S extends ConciertoVO> Iterable<S> saveAll(Iterable<S> entities) {
		return cr.saveAll(entities);
	}

	@Override
	public Optional<ConciertoVO> findById(Integer id) {
		return cr.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return cr.existsById(id);
	}

	@Override
	public Iterable<ConciertoVO> findAll() {
		return cr.findAll();
	}

	@Override
	public Iterable<ConciertoVO> findAllById(Iterable<Integer> ids) {
		return cr.findAllById(ids);
	}

	@Override
	public long count() {
		return cr.count();
	}

	@Override
	public void deleteById(Integer id) {
		cr.deleteById(id);
	}

	@Override
	public void delete(ConciertoVO entity) {
		cr.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		cr.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends ConciertoVO> entities) {
		cr.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		cr.deleteAll();
	}
	
	

}
