package yma.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yma.sms.dto.StudentDto;
import yma.sms.entity.Student;
import yma.sms.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void createStudent(StudentDto dto) {
        Student student = new Student();
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setNic(dto.getNic());
        student.setGender(dto.getGender());
        student.setAddress(dto.getAddress());
        student.setDob(dto.getDob());
        student.setCode(dto.getCode());
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void updateStudent(Integer id, StudentDto dto) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setNic(dto.getNic());
        student.setGender(dto.getGender());
        student.setAddress(dto.getAddress());
        student.setDob(dto.getDob());
        student.setCode(dto.getCode());
        studentRepository.save(student);
    }

    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }
}
