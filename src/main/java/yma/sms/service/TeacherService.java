package yma.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yma.sms.dto.TeacherDto;
import yma.sms.entity.Teacher;
import yma.sms.repository.TeacherRepository;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public void createTeacher(TeacherDto dto) {
        Teacher teacher = new Teacher();
        teacher.setFirstName(dto.getFirstName());
        teacher.setLastName(dto.getLastName());
        teacher.setNic(dto.getNic());
        teacher.setGender(dto.getGender());
        teacher.setAddress(dto.getAddress());
        teacher.setEmail(dto.getEmail());
        teacher.setPosition(dto.getPosition());
        teacher.setDob(dto.getDob());
        teacher.setMobile(dto.getMobile());
        teacher.setCode(dto.getCode());
        teacher.setQualification(dto.setQualification());
        teacherRepository.save(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public void updateTeacher(Integer id, TeacherDto dto) {
        Teacher teacher = teacherRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Teacher not found"));
        teacher.setFirstName(dto.getFirstName());
        teacher.setLastName(dto.getLastName());
        teacher.setNic(dto.getNic());
        teacher.setGender(dto.getGender());
        teacher.setAddress(dto.getAddress());
        teacher.setEmail(dto.getEmail());
        teacher.setPosition(dto.getPosition());
        teacher.setDob(dto.getDob());
        teacher.setMobile(dto.getMobile());
        teacher.setCode(dto.getCode());
        teacher.setQualification(dto.setQualification());
        teacherRepository.save(teacher);
    }

    public void deleteTeacher(Integer id) {
        teacherRepository.deleteById(id);
    }

    public Teacher getTeacherById(Integer id) {
        return teacherRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Teacher not found"));
    }
}
