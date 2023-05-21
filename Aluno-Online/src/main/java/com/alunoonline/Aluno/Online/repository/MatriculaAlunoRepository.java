package com.alunoonline.Aluno.Online.repository;

import com.alunoonline.Aluno.Online.model.MatriculaAluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaAlunoRepository extends JpaRepository<MatriculaAluno, Long> {
}
