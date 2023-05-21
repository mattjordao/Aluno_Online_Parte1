package com.alunoonline.Aluno.Online.service;

import com.alunoonline.Aluno.Online.model.MatriculaAluno;
import com.alunoonline.Aluno.Online.repository.MatriculaAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaAlunoService {

    @Autowired
    MatriculaAlunoRepository repository;

    public MatriculaAluno create(MatriculaAluno matriculaAluno){
        matriculaAluno.setStatus("Matriculado");
       return repository.save(matriculaAluno);
    }
}
