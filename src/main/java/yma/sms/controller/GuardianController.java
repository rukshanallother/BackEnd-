package yma.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yma.sms.dto.GuardianDto;
import yma.sms.entity.Guardian;
import yma.sms.service.GuardianService;

import java.util.List;

@RestController
@RequestMapping("/api/guardians")
public class GuardianController {
    @Autowired
    private GuardianService guardianService;

    @PostMapping
    public void createGuardian(@RequestBody GuardianDto guardianDto){
        guardianService.createGuardian(guardianDto);
    }

    @GetMapping
    public List<Guardian> getAllGuardians(){
        return guardianService.getAllGuardians();
    }

    @PutMapping("/{guardianId}")
    public void updateGuardian(@PathVariable Integer guardianId, @RequestBody GuardianDto updateDto){
        guardianService.updateGuardian(guardianId, updateDto);
    }

    @DeleteMapping("/{guardianId}")
    public void deleteGuardian(@PathVariable Integer guardianId){
        guardianService.deleteGuardian(guardianId);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Guardian> getGuardianById(@PathVariable Integer id) {
        Guardian guardian = guardianService.getGuardianById(id);
        return ResponseEntity.ok(guardian);
    }
}