package spring.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import spring.boot.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
	
	@Query("Select s from Teacher s where s.age=:age")
	List<Teacher> findByAge(Integer age);
	
	List<Teacher> findByName(String name);
}


