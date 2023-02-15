package com.dawes.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.modelo.VentaVO;

@Repository
public interface VentaRepository extends CrudRepository<VentaVO, Integer> {

}
