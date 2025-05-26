package yma.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yma.sms.dto.CourseDto;
import yma.sms.entity.Course;
import yma.sms.service.CourseService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody CourseDto courseDto){
        Course course = courseService.createCourse(courseDto);
        URI location = URI.create("/courses" + course.getSlug());
        return ResponseEntity.created(location).body(course);
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

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Integer id) {
        Course course = courseService.getCourseById(id);
        return ResponseEntity.ok(course);
    }


}
