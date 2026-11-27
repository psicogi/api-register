package dev.psicogi.springboot.Tarefa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TarefaController {
    @GetMapping("/rotaTarefa")
    public String rotaTarefa() {
        return "rota de tarefas";
    }
}
