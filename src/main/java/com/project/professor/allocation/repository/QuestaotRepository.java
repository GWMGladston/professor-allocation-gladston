package com.project.professor.allocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professor.allocation.entity.Questao;

@Repository
public interface QuestaotRepository extends JpaRepository<Questao, Long> {

    List<Questao> findByEnunciadoContainingIgnoreCase(String enunciado);
}
