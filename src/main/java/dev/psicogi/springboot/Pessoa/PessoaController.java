package dev.psicogi.springboot.Pessoa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PessoaController {
    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "primeira mensagem dessa rota";
    }
}
