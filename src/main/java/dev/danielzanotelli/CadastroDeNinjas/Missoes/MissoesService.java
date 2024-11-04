package dev.danielzanotelli.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    private final MissoesRepository missoesRepository;
    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    //Listar missoes

    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }
}
