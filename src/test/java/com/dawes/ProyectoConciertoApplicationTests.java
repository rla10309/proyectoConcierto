package com.dawes;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dawes.modelo.ConciertoVO;
import com.dawes.modelo.SalaConciertoVO;
import com.dawes.modelo.SalaVO;
import com.dawes.modelo.VentaVO;
import com.dawes.servicio.ServicioConcierto;
import com.dawes.servicio.ServicioSala;
import com.dawes.servicio.ServicioSalaConcierto;
import com.dawes.servicio.ServicioVenta;

@SpringBootTest
class ProyectoConciertoApplicationTests {
	@Autowired
	ServicioSala ss;
	@Autowired
	ServicioConcierto sc;
	@Autowired
	ServicioSalaConcierto ssc;
	@Autowired
	ServicioVenta sv;
	
	//insertamos una sala
	@Test
	public void test01() {
		assertNotNull(ss.save(new SalaVO("La Salvaje", "C/San Martín, 2", 150)));
	}
	//insertamos un concierto
	@Test
	public void test02() {
		assertNotNull(sc.save(new ConciertoVO("Oasis", LocalDate.of(2023, 8, 15), LocalTime.of(20, 30), 15d, 18d, 150)));
	}
	//insertamos un concierto en una sala
	@Test
	public void test03() {
		assertNotNull(ssc.save(new SalaConciertoVO(ss.findByNombre("La Salvaje").get(), sc.findByGrupo("Oasis").get())));
	}
//	//hacemos una venta
//	@Test
//	public void test04() {
//		assertNotNull(sv.save(new VentaVO(LocalDate.of(2023, 2, 3), LocalTime.now(), "111", sc.findByGrupo("Oasis").get(), 2, ss.findByNombre("La Salvaje").get())));
//	}

}
