package dev.danielzanotelli.CadastroDeNinjas.Ninjas;

import dev.danielzanotelli.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "missao")
@Table(name = "tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private Integer idade;

    //Muitos ninjas tem somente uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Nossa chave estrangeira
    private MissoesModel missao;
    @Column(name = "rank")
    private String rank;
}
