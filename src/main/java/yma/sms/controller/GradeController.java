package yma.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yma.sms.dto.GradeDto;
import yma.sms.entity.Grade;
import yma.sms.service.GradeService;

import java.util.List;

@RestController
@RequestMapping("/api/grades")
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @PostMapping
    public void createGrade(@RequestBody GradeDto gradeDto){
        gradeService.createGrade(gradeDto);
    }

    @GetMapping
    public List<Grade> getAllGrades(){
        return gradeService.getAllGrades();
    }

    @PutMapping("/{gradeId}")
    public void updateGrade(@PathVariable Integer gradeId, @RequestBody GradeDto updateDto){
        gradeService.updateGrade(gradeId, updateDto);
    }

    @DeleteMapping("/{gradeId}")
    public void deleteGrade(@PathVariable Integer gradeId){
        gradeService.deleteGrade(gradeId);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grade> getGradeById(@PathVariable Integer id) {
        Grade grade = gradeService.getGradeById(id);
        return ResponseEntity.ok(grade);
    }
}
