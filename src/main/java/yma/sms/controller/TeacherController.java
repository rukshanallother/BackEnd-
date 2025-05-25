package yma.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yma.sms.dto.TeacherDto;
import yma.sms.entity.Teacher;
import yma.sms.service.TeacherService;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping
    public void createTeacher(@RequestBody TeacherDto teacherDto){
        teacherService.createTeacher(teacherDto);
    }

    @GetMapping
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

    @PutMapping("/{teacherId}")
    public void updateTeacher(@PathVariable Integer teacherId, @RequestBody TeacherDto updateDto){
        teacherService.updateTeacher(teacherId, updateDto);
    }

    @DeleteMapping("/{teacherId}")
    public void deleteTeacher(@PathVariable Integer teacherId){
        teacherService.deleteTeacher(teacherId);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable Integer id) {
        Teacher teacher = teacherService.getTeacherById(id);
        return ResponseEntity.ok(teacher);
    }
}