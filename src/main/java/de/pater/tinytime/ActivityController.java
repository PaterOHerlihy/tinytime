package de.pater.tinytime;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.internal.util.compare.CalendarComparator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {
	
	private final ActivityRepository repository;
	
	public ActivityController(ActivityRepository repository) {
		// TODO Auto-generated constructor stub
		this.repository = repository;
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500") //do right later
	@GetMapping("/activities")
	List<Activity> all(){
			return repository.findAll();
		}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@PostMapping(value = "/activity", consumes = "application/json")
	public ResponseEntity<Activity> createNewActivity(@RequestBody Activity entity){
		return new ResponseEntity<Activity>(repository.save(entity), HttpStatus.CREATED);
	}
	

	
	@GetMapping("/activity/{id}")
	Activity one(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(() -> new ActivityNotFoundException(id));
	}

}
