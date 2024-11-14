package dev.danielzanotelli.CadastroDeNinjas.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.danielzanotelli.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table (name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nome;
    private String dificuldade;

    //Uma missão pode ser dadad a varios ninjas
    @JsonIgnore
    @OneToMany(mappedBy = "missao")
    private List<NinjaModel> ninjas;



}
