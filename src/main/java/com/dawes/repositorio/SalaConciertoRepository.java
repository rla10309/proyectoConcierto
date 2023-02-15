package com.dawes.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.SalaConciertoVO;

@Repository
public interface SalaConciertoRepository extends CrudRepository<SalaConciertoVO, Integer> {
	
	

}
