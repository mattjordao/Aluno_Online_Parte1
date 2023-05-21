package com.alunoonline.Aluno.Online.repository;

import com.alunoonline.Aluno.Online.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}
