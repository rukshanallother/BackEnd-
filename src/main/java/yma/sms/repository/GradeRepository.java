package yma.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yma.sms.entity.Grade;

public interface GradeRepository extends JpaRepository<Grade, Integer> {
}