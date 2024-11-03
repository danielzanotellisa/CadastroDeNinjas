package dev.danielzanotelli.CadastroDeNinjas.Missoes;

import dev.danielzanotelli.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table (name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nome;
    private String dificuldade;

    //Uma missão pode ser dadad a varios ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;



}
