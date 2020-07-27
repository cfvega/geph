package cl.geph.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import cl.geph.api.modelo.Salas;

public interface RepSala extends JpaRepository<Salas, Integer>{

	
	@Query("select sala from Salas sala where sala.id = ?1")
	List<Salas> findBySala(int id);
	

}
