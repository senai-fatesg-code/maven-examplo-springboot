package org.example.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController //mapeamento para spring webmvc
@RequestMapping(value = "/api/v1/pessoa") //endereco de acesso da api
public class PessoaResource {


    @GetMapping
    public String listarPessoa(){
        log.info("Método GET");
        return "FAculdade senai fatesg";
    }

    @PostMapping
    public String qualquercoisa(@RequestBody String corpoDaMensagem){
        log.info("Método POST");
        log.debug("Objeto recebido: {}", corpoDaMensagem);
        return "objeto recebido";
    }

}
