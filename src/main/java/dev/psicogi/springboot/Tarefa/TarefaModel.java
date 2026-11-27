package dev.psicogi.springboot.Tarefa;

import dev.psicogi.springboot.Pessoa.PessoaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_tarefa")
public class TarefaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String task;
    private String difficulty;

    @OneToMany(mappedBy = "task")
    private List<PessoaModel> helpers;

    public TarefaModel() {
    }

    public TarefaModel(Long id, String task, String difficulty, List<PessoaModel> helpers) {
        this.id = id;
        this.task = task;
        this.difficulty = difficulty;
        this.helpers = helpers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public List<PessoaModel> getHelpers() {
        return helpers;
    }

    public void setHelpers(List<PessoaModel> helpers) {
        this.helpers = helpers;
    }
}
