package yma.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yma.sms.dto.GuardianDto;
import yma.sms.entity.Guardian;
import yma.sms.repository.GuardianRepository;

import java.util.List;

@Service
public class GuardianService {
    @Autowired
    private GuardianRepository guardianRepository;

    public void createGuardian(GuardianDto dto) {
        Guardian guardian = new Guardian();
        guardian.setFirstName(dto.getFirstName());
        guardian.setLastName(dto.getLastName());
        guardian.setNic(dto.getNic());
        guardian.setGender(dto.getGender());
        guardian.setAddress(dto.getAddress());
        guardian.setEmail(dto.getEmail());
        guardian.setPosition(dto.getRelationship());
        guardian.setDob(dto.getDob());
        guardian.setMobile(dto.getMobile());
        guardian.setCode(dto.getCode());
        guardianRepository.save(guardian);
    }

    public List<Guardian> getAllGuardians() {
        return guardianRepository.findAll();
    }

    public void updateGuardian(Integer id, GuardianDto dto) {
        Guardian guardian = guardianRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Guardian not found"));
        guardian.setFirstName(dto.getFirstName());
        guardian.setLastName(dto.getLastName());
        guardian.setNic(dto.getNic());
        guardian.setGender(dto.getGender());
        guardian.setAddress(dto.getAddress());
        guardian.setEmail(dto.getEmail());
        guardian.setPosition(dto.getRelationship());
        guardian.setDob(dto.getDob());
        guardian.setMobile(dto.getMobile());
        guardian.setCode(dto.getCode());
        guardianRepository.save(guardian);
    }

    public void deleteGuardian(Integer id) {
        guardianRepository.deleteById(id);
    }

    public Guardian getGuardianById(Integer id) {
        return guardianRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Guardian not found"));
    }
}
