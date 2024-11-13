package dev.danielzanotelli.CadastroDeNinjas.Ninjas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    private final NinjaService ninjaService;
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    //ADICIONAR NINJA (CREATE)
    @PostMapping("/criar")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja) {

        NinjaDTO ninjaDTO = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado com sucesso: " + ninjaDTO.getNome() + "(ID): " + ninjaDTO.getId());

    }
    //PROCURAR NINJA POR ID (READ)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarNinjasPorID(@PathVariable Long id) {
        if(ninjaService.listarNinjasPorId(id) == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja não encontrado");
        }

        NinjaDTO ninjaEncontrado =ninjaService.listarNinjasPorId(id);
        return ResponseEntity.ok(ninjaEncontrado);
    }
    //MOSTRAR NINJAS (READ)
    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>> listarNinja() {
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        return  ResponseEntity.ok(ninjas);
    }
    //ALTERAR DADOS DE UM NINJA (UPDATE)
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado) {
        if(ninjaService.listarNinjasPorId(id) != null) {
            NinjaDTO ninja = ninjaService.alterarNinja(id, ninjaAtualizado);
            return ResponseEntity.ok(ninja);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja não encontrado");
        }
    }


    //DELETAR UM NINJA (DELETE)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinjaPorId(@PathVariable Long id) {

        if(ninjaService.listarNinjasPorId(id) != null) {
            ninjaService.deletarNinjaPorId(id);
            return ResponseEntity.ok("Ninja deletado com sucesso") ;
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja não encontrado");
        }

    }

    //TODAS ESSAS ENDPOINTS FORMAM UM CRUD




}
