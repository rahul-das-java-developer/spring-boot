package spring.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.List;

import spring.boot.entity.Teacher;
import spring.boot.repository.TeacherRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		System.out.println(run.getClass());
		
		TeacherRepository teacherRepository = run.getBean(TeacherRepository.class);
		
		// INSERT DATA
//		Teacher teacher = new Teacher();
//		teacher.setId(104);
//		teacher.setName("Raveesh");
//		teacher.setAge(44);
//		
//		Teacher save = teacherRepository.save(teacher);
//		if(save!=null) {
//			System.out.println("DATA SAVED!!");
//		}
		
		// INSERT ALL DATA
		Teacher teacher1 = new Teacher();
		teacher1.setId(106);
		teacher1.setName("Sumit");
		teacher1.setAge(29);
		
		Teacher teacher2 = new Teacher();
		teacher2.setId(107);
		teacher2.setName("Virat");
		teacher2.setAge(44);
		
		Teacher teacher3 = new Teacher();
		teacher3.setId(108);
		teacher3.setName("Sambhu");
		teacher2.setAge(26);
		
		Teacher teacher4 = new Teacher();
		teacher4.setId(104);
		teacher4.setName("Raveesh");
		teacher4.setAge(44);
		
		Teacher save = teacherRepository.save(teacher1);
		if(save!=null) {
			System.out.println("DATA SAVED!!");
		}
		
		
//		// FETCH DATA
//		Teacher teacher = teacherRepository.findById(102)
//		.orElseThrow(()-> new RuntimeException("USER NOT FOUND!!!"));
//		
//		System.out.println(teacher.getId()+ " "+teacher.getName()+" "+teacher.getAge());
//		
//		// FETCH ALL
//		List<Teacher> list = teacherRepository.findAll();
//		
//		for (Teacher teacher2 : list) {
//			System.out.println(teacher2.getId()+ " "+teacher2.getName()+" "+teacher2.getAge());
//			
//		}
				
				
		
		
		
		
		
		
		
		
	}

}
