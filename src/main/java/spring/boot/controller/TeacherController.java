package spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.entity.Teacher;
import spring.boot.repository.TeacherRepository;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@PostMapping("/save")
	public String save(@RequestBody Teacher tch) {
		System.out.println("User Name: "+tch.getName());
		Teacher save = teacherRepository.save(tch);
		if(save.getId()!=0) {
			return "Data saved for "+save.getName();
		}
		else {
			return "Data not saved!!";
		}
		
	}
	
	@GetMapping("/getAll")
	public List<Teacher> getAll() {
		List<Teacher> list = teacherRepository.findAll();
		return list;
		
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam Integer id) {
		System.out.println("ID to be deleted: "+id);
		teacherRepository.deleteById(id);
				
		return "Data deleted!!";
	}

	@DeleteMapping("/deleteById")
	public String deleteById(@RequestParam Integer id) {
		System.out.println("ID to be deleted: "+id);
		
		Teacher tch = teacherRepository.findById(id).orElseThrow(()-> new RuntimeException());
		teacherRepository.delete(tch);
		
		
		return "Data deleted!!";
	}


//	@PutMapping("/cart")
//	public String cartPage() {
//		String str = "WELCOME TO OUR WEBPAGE(PutMapping)";
//		System.out.println(str);
//		return str;
//	}
	
	
	
	
	
	
	
	
	
	
	

}
