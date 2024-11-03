package dev.danielzanotelli.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é minha primeira rota";
    }

    //ADICIONAR NINJA (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }
    //PROCURAR NINJA POR ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorID() {
        return "Mostrar Ninjas por id";
    }
    //MOSTRAR NINJAS (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Mostrar Ninjas";
    }
    //ALTERAR DADOS DE UM NINJA (UPDATE)
    @PutMapping("/alterarID")

    public String alterarNinjaPorId() {
        return "Alterar ninja por ID";
    }


    //DELETAR UM NINJA (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId() {
        return "Deletar Ninja por ID";
    }

    //TODAS ESSAS ENDPOINTS FORMAM UM CRUD




}
