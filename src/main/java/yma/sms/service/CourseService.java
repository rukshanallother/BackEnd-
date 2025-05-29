package yma.sms.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yma.sms.dto.CourseDto;
import yma.sms.entity.Course;
import yma.sms.exception.BadRequestException;
import yma.sms.repository.CourseRepository;

import java.util.List;

// Annotate this class as a service component so Spring can detect and manage it
@Service
public class CourseService {

    // Automatically inject an instance of CourseRepository to perform DB operations
    @Autowired
    private CourseRepository courseRepository;

    // Method createCourse works with data received in CourseDto
    public Course createCourse(CourseDto createDto) {
        if (courseRepository.existsBySlug(createDto.getSlug())) {
            throw new BadRequestException("Course with slug '" + createDto.getSlug() + "' already exists.");
        }
        Course course = new Course();                       // Create a new instance of the Course entity

        course.setName(createDto.getName());                // Set the course name using the value given in the DTO
        course.setSlug(createDto.getSlug());
        course.setCode(createDto.getCode());

        return courseRepository.save(course);                      // Save the course entity to the database using the repository
    }

    public List<Course> getAllCourse() {

        return courseRepository.findAll();
    }

    public void updateCourse(Integer courseId, CourseDto updateDto) {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course Not Found"));
        course.setName(updateDto.getName());
        course.setCode(updateDto.getCode());
        courseRepository.save(course);
    }

    public void deleteCourse(Integer courseId) {
        courseRepository.deleteById(courseId);
    }

    public Course getCourseById(Integer id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found"));
}
}




