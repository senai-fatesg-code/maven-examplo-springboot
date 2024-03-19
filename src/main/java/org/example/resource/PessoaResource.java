package org.example.resource;

import lombok.extern.slf4j.Slf4j;
import org.example.model.Pessoa;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j //escrever logging (logar sout)
@RestController //mapeamento para spring webmvc
@RequestMapping(value = "/api/v1/pessoa") //endereco de acesso da api
public class PessoaResource {


    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE}
    )
    public Pessoa listarPessoa(){
        log.info("Método GET");
        return new Pessoa();
    }

    /*@GetMapping(
            name = "/{dados}",
            produces = {
                    MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE
            }
    )
    public Pessoa getPessoa(@RequestParam String dados){
        log.info("Iniciando método getPessoa()");
        log.warn("TExto de aviso");
        log.error("Texto de erro");
        log.debug("TExto de debug: {}", dados);
        return new Pessoa();
    }

    @GetMapping(
            name = "/{id}",
            produces = {
                    MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE
            }
    )
    //GET http://localhost:8081/api/v1/pessoa/{id}
    //GET http://localhost:8081/api/v1/pessoa/10
    public Pessoa getPessoaUnica(@PathVariable Integer id){
        log.info("Iniciando método getPessoa()");
        log.warn("TExto de aviso");
        log.error("Texto de erro");
        log.debug("TExto de debug: {}", id);
        return new Pessoa();
    }

    @GetMapping(
            name = "/xxxx",
            produces = {
                    MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE
            }
    )
    //GET api/v1/pessoa?variavel=1&variavel2=2&variavel3=3&variavel4=4
    public Pessoa getPessoaUnicaP(@RequestParam String dados){
        log.info("Iniciando método getPessoa()");
        log.warn("TExto de aviso");
        log.error("Texto de erro");
        log.debug("TExto de debug: {}", dados);
        return new Pessoa();
    }
*/
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE}, //recebo
            produces = {MediaType.APPLICATION_JSON_VALUE}//devolvo
    )
    public Pessoa qualquercoisa(@RequestBody Pessoa pessoa){
        log.info("Método POST");
        log.debug("Objeto recebido: {}", pessoa);

        return pessoa;
    }

}
