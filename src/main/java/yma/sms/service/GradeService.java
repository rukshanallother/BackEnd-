package yma.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yma.sms.dto.GradeDto;
import yma.sms.entity.Grade;
import yma.sms.repository.GradeRepository;

import java.util.List;

@Service
public class GradeService {
    @Autowired
    private GradeRepository gradeRepository;

    public void createGrade(GradeDto dto) {
        Grade grade = new Grade();
        grade.setGrade(dto.getGrade());
        grade.setCode(dto.getCode());
        gradeRepository.save(grade);
    }

    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }

    public void updateGrade(Integer id, GradeDto dto) {
        Grade grade = gradeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Grade not found"));
        grade.setGrade(dto.getGrade());
        grade.setCode(dto.getCode());
        gradeRepository.save(grade);
    }

    public void deleteGrade(Integer id) {
        gradeRepository.deleteById(id);
    }

    public Grade getGradeById(Integer id) {
        return gradeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Grade not found"));
    }
}
