package yma.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yma.sms.entity.Guardian;

public interface GuardianRepository extends JpaRepository<Guardian, Integer> {
}
