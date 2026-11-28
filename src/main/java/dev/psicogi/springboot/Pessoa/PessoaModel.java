package dev.psicogi.springboot.Pessoa;

import dev.psicogi.springboot.Tarefa.TarefaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String email;

    @ManyToOne
    @JoinColumn(name = "tarefa_id")
    private TarefaModel task;
}
