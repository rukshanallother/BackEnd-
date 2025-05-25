package yma.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yma.sms.dto.CourseDto;
import yma.sms.entity.Course;
import yma.sms.repository.CourseRepository;

import java.util.List;

// Annotate this class as a service component so Spring can detect and manage it
@Service
public class CourseService {

    // Automatically inject an instance of CourseRepository to perform DB operations
    @Autowired
    private CourseRepository courseRepository;

    // Method createCourse works with data received in CourseDto
    public void createCourse(CourseDto createDto) {
        Course course = new Course();                       // Create a new instance of the Course entity
        course.setName(createDto.getName());                // Set the course name using the value given in the DTO
        courseRepository.save(course);                      // Save the course entity to the database using the repository
    }

    public List<Course> getAllCourse() {

        return courseRepository.findAll();
    }

    public void updateCourse(Integer courseId, CourseDto updateDto) {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course Not Found"));
        course.setName(updateDto.getName());
        courseRepository.save(course);
    }

    public void deleteCourse(Integer courseId) {
        courseRepository.deleteById(courseId);
    }
}




