package cl.geph.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.geph.api.modelo.Salas;
import cl.geph.api.repository.RepSala;

@CrossOrigin
@RestController
@RequestMapping("/salas")
public class SalasRest {
	
	@Autowired
	private RepSala sala;
	
	@CrossOrigin
	@GetMapping()
	public List<Salas> getAllSalas() {
		return sala.findAll();
	}
	
	@CrossOrigin
	@GetMapping("/{id}")
	public List<Salas> getCamasbySala(@PathVariable int id) {
		return sala.findBySala(id);
	}
	
	
	@CrossOrigin
	@PostMapping("/add")
	public boolean newSala(@RequestBody Salas r) {
		if(r.getDescripcion() != null) {
			Salas tmp = new Salas();
			tmp.setNew(r.getSala(),r.getCama(),r.getDescripcion(),r.getEstado());
			sala.save(tmp);
			return true;
			
		} else {
			return false;
		}
	}
	
	
	@CrossOrigin
	@DeleteMapping("/delete/{id}")
	public boolean deletePlanner(@PathVariable int id) {
		sala.deleteById(id);
		return true;
	}
	
	@CrossOrigin
	@PutMapping("/estado/{id}")
	public boolean updateEstado(@PathVariable int id, @RequestBody Salas r) {
		sala.deleteById(id);
		if(newSala(r)) {
			return true;
		}
		return false;
	}
	
	
	
	

}
