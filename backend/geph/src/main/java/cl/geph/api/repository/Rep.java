package cl.geph.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import cl.geph.api.modelo.Pabellon;


public interface Rep extends JpaRepository<Pabellon, Integer>{
	
	@Query("select pabellon from Pabellon pabellon where pabellon.sala = ?1")
	List<Pabellon> findBySala(int sala);
	
	@Query("select pabellon from Pabellon pabellon where pabellon.id = ?1")
	Pabellon findById(int id);
	

}