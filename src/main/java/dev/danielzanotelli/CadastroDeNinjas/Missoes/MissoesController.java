package dev.danielzanotelli.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    private final MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    //ADICIONAR MISSÃO (CREATE)
    @PostMapping("/criar")
    public MissoesDTO criarMissao(@RequestBody MissoesDTO missao){
        return missoesService.criarMissao(missao);
    }
    //SELECIONAR TODAS AS MISSÕES(READ)
    @GetMapping("/listar")
    public List<MissoesDTO> listarMissoes() {
        return missoesService.listarMissoes();
    }

    //ALTERAR MISSÃO POR ID(UPDATE)
    @PutMapping("/alterar/{id}")
    public MissoesDTO alterarMissao(@PathVariable Long id, @RequestBody MissoesDTO missaoAlterada){
        return missoesService.alterarMissao(id,missaoAlterada);
    }
    //DELETAR MISSÃO(DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id){
        missoesService.deletarMissao(id);
    }



}
