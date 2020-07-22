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

import cl.geph.api.modelo.Pabellon;
import cl.geph.api.repository.Rep;



@CrossOrigin
@RestController
@RequestMapping("/pabellon")
public class Rest {
	@Autowired
	private Rep pabellon;
	
	
	@CrossOrigin
	@GetMapping()
	public List<Pabellon> getAllPabellon() {
		return pabellon.findAll();
	}
	@CrossOrigin
	@GetMapping("sala/{id}")
	public List<Pabellon> getPabellonBySala(@PathVariable int id) {
		return pabellon.findBySala(id);
	}
	@CrossOrigin
	@GetMapping("/{id}")
	public Pabellon getPabellonById(@PathVariable int id) {
		return pabellon.findById(id);
	}
	
	
	
	@CrossOrigin
	@PostMapping("/add")
	public boolean newPabellon(@RequestBody Pabellon r) {
		if(r.getDescripcion() != null) {
			Pabellon tmp = new Pabellon();
			tmp.setNew(r.getSala(),r.getDescripcion(),r.getEstado());
			pabellon.save(tmp);
			return true;
			
		} else {
			return false;
		}
	}
	
	@CrossOrigin
	@DeleteMapping("/delete/{id}")
	public boolean deletePlanner(@PathVariable int id) {
		pabellon.deleteById(id);
		return true;
	}
	
	@CrossOrigin
	@PutMapping("/estado/{id}")
	public boolean updateEstado(@PathVariable int id, @RequestBody Pabellon r) {
		pabellon.deleteById(id);
		if(newPabellon(r)) {
			return true;
		}
		return false;
	}
	
	
	
	
	
}
