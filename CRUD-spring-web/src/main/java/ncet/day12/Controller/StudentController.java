package ncet.day12.Controller;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ncet.day12.Entity.Student;

@RestController
@RequestMapping("/students")
public class StudentController {
	private List<Student> students = new ArrayList<>();
//	students.add(new Student("Samarth", 153, "sam153@gmail.com"));
	

	//Adding a user - Post request
	@PostMapping("/newstudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student stud){
		students.add(stud);
		return new ResponseEntity<>(stud, HttpStatus.CREATED);
	}
	
	//Getting a user - get request
	@GetMapping("{id}")
	public ResponseEntity<Student> getStudent(@PathVariable int id){
		for(Student stud : students) {
			if(stud.getId()==id) {
				return new ResponseEntity<>(stud, HttpStatus.FOUND);
			}
		}
		
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
	//Updating a user - PUT method
	
}
