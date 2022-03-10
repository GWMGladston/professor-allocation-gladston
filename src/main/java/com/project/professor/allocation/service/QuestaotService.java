package com.project.professor.allocation.service;

import com.project.professor.allocation.entity.Department;
import com.project.professor.allocation.entity.Professor;
import com.project.professor.allocation.entity.Questao;
import com.project.professor.allocation.repository.DepartmentRepository;
import com.project.professor.allocation.repository.ProfessorRepository;
import com.project.professor.allocation.repository.QuestaotRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestaotService {

    private final QuestaotRepository questaotRepository;
    
    public QuestaotService(QuestaotRepository questaotRepository) {
        super();
        this.questaotRepository = questaotRepository;
    }

//    public List<Department> findAll(String name) {
//        if (name == null) {
//            return departmentRepository.findAll();
//        } else {
//            return departmentRepository.findByNameContainingIgnoreCase(name);
//        }
//    }
//
//    public Department findById(Long id) {
//        return departmentRepository.findById(id).orElse(null);
//    }

    public Questao save(Questao questao) {
        questao.setId(null);
        return questaotRepository.save(questao);
    }

//    public Department update(Department department) {
//        Long id = department.getId();
//        if (id != null && departmentRepository.existsById(id)) {
//            return saveInternal(department);
//        } else {
//            return null;
//        }
//    }
//
//    public void deleteById(Long id) {
//        if (id != null && departmentRepository.existsById(id)) {
//            departmentRepository.deleteById(id);
//        }
//    }
//
//    public void deleteAll() {
//        departmentRepository.deleteAllInBatch();
//    }
//
//    private Department saveInternal(Department department) {
//        department = departmentRepository.save(department);
//
//        List<Professor> professors = professorRepository.findByDepartmentId(department.getId());
//        department.setProfessors(professors);
//
//        return department;
//    }
}
