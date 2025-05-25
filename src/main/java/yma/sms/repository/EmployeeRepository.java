package yma.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yma.sms.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
