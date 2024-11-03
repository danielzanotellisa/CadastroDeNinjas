package dev.danielzanotelli.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    //ADICIONAR MISSÃO (CREATE)
    @PostMapping("/criar")
    public String criarMissao(){
        return "Criar missão";
    }
    //SELECIONAR TODAS AS MISSÕES(READ)
    @GetMapping("/listar")
    public String listarMissoes() {
        return "Selecionar todas as missões";
    }

    //ALTERAR MISSÃO POR ID(UPDATE)
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Alterar missao";
    }
    //DELETAR MISSÃO(DELETE)
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Deletar missão por id";
    }



}
