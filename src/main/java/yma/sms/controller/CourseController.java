package yma.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yma.sms.dto.CourseDto;
import yma.sms.entity.Course;
import yma.sms.service.CourseService;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public void createCourse(@RequestBody CourseDto courseDto){
        courseService.createCourse(courseDto);

    }
    @GetMapping
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }
    @PutMapping("/{courseId}")
    public void updateCourse(@PathVariable Integer courseId, @RequestBody CourseDto updateDto){
        courseService.updateCourse(courseId,updateDto);
    }
    @DeleteMapping("/{courseId}")
    public void deleteCourse(@PathVariable Integer courseId){
        courseService.deleteCourse(courseId);
    }


}
