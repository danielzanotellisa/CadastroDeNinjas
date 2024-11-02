package dev.danielzanotelli.CadastroDeNinjas.Ninjas;

import dev.danielzanotelli.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private Integer idade;

    //Muitos ninjas tem somente uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Nossa chave estrangeira
    private MissoesModel missao;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
