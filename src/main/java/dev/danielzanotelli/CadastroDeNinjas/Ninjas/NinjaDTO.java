package dev.danielzanotelli.CadastroDeNinjas.Ninjas;

import dev.danielzanotelli.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    private Long id;
    private String nome;

    private String email;
    private Integer idade;
    private MissoesModel missao;
    private String rank;
}
