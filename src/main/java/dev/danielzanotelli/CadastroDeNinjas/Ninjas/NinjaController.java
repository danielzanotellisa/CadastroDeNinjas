package dev.danielzanotelli.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    private final NinjaService ninjaService;
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é minha primeira rota";
    }

    //ADICIONAR NINJA (CREATE)
    @PostMapping("/criar")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja) {
        return ninjaService.criarNinja(ninja);
    }
    //PROCURAR NINJA POR ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaDTO listarNinjasPorID(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }
    //MOSTRAR NINJAS (READ)
    @GetMapping("/listar")
    public List<NinjaDTO> listarNinja() {
        return ninjaService.listarNinjas();
    }
    //ALTERAR DADOS DE UM NINJA (UPDATE)
    @PutMapping("/alterar/{id}")
    public NinjaDTO alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado) {
        return ninjaService.alterarNinja(id,ninjaAtualizado);
    }


    //DELETAR UM NINJA (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id) {
        ninjaService.deletarNinjaPorId(id);
    }

    //TODAS ESSAS ENDPOINTS FORMAM UM CRUD




}
