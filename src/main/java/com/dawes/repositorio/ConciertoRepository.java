package com.dawes.repositorio;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.ConciertoVO;

@Repository
public interface ConciertoRepository extends CrudRepository<ConciertoVO, Integer> {
	Optional<ConciertoVO> findByGrupo(String grupo);

}
