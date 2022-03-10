package com.project.professor.allocation.repository;

import com.project.professor.allocation.entity.Department;
import com.project.professor.allocation.entity.Questao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestaotRepository extends JpaRepository<Questao, Long> {

    List<Questao> findByEnunciadoContainingIgnoreCase(String enunciado);
}
