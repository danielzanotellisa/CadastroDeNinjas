package dev.danielzanotelli.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MissoesController {

    //ADICIONAR MISSÃO (CREATE)
    @PostMapping("/cria_missao")
    public String criarMissao(){
        return "Criar missão";
    }
    //SELECIONAR TODAS AS MISSÕES(READ)
    @GetMapping("/todas_missoes")
    public String selecionarTodasAsMissoes() {
        return "Selecionar todas as missões";
    }
    //SELECIONAR MISSÃO POR ID(READ)
    @GetMapping("/missaoID")
    public String selecionarMissaoPorId(){
        return "Selecionar missão por id";
    }
    //ALTERAR MISSÃO POR ID(UPDATE)
    @PutMapping("/alterar_missaoID")
    public String alterarMissaoPorId(){
        return "Alterar missao por id";
    }
    //DELETAR MISSÃO(DELETE)
    @DeleteMapping("/deletar_missaoID")
    public String deletarMissaoPorId(){
        return "Deletar missão por id";
    }

}
