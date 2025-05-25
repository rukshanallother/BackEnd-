package yma.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yma.sms.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
