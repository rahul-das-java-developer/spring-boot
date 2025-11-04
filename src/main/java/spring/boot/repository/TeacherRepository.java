package spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
