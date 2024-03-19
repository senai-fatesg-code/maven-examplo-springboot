package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.interfaces.IService;
import org.example.model.Aluno;
import org.example.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service //indica camada de serviço/negócio
public class AlunoService implements IService<Aluno, Integer> {

    @Autowired //injeção de dependência
    private AlunoRepository alunoRepository;

    @Override
    @Transactional
    public Aluno create(Aluno entity) {
        log.info("Acessando método AlunoService.create");
        log.debug("Valores recebidos: {}", entity);

        return alunoRepository.save(entity);
    }

    @Override
    public List<Aluno> read() {
        log.info("Acessando método AlunoResource.read()");

        List<Aluno> lista = alunoRepository.findAll();

        log.debug("Resultado da consulta: {} registros", lista.size());

        return lista;
    }

    @Override
    public Aluno read(Integer id) {
        log.info("Acessando método AlunoResource.read(id)");
        log.debug("Valores recebidos: id = {}", id);
        //Aluno alunoEncontrado = alunoRepository.findById(id);
        log.debug("Resultado da consulta: {} registros", 0);
        return null;
    }

    @Override
    @Transactional
    public Aluno update(Integer id, Aluno entity) {
        log.info("Acessando método AlunoService.update");
        log.debug("Valores recebidos - id: {}, entity: {}", id, entity);


        Optional<Aluno> alunoEncontrado = alunoRepository.findById(id);
        if(alunoEncontrado.isPresent()){
            alunoRepository.save(entity);
        }

        return null;
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        log.info("Acessando método delete");
        log.info("Valor recebido: {id}", id);

    }
}
