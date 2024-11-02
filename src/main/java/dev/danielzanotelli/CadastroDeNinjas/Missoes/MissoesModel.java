package dev.danielzanotelli.CadastroDeNinjas.Missoes;

import dev.danielzanotelli.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table (name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private RanksEnums rank;

    //Uma missão pode ser dadad a varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(String nomeMissao, RanksEnums rank) {
        this.nome = nomeMissao;
        this.rank = rank;
    }


}
