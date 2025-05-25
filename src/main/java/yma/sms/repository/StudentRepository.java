package yma.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yma.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
