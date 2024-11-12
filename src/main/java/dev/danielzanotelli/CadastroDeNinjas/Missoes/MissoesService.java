package dev.danielzanotelli.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    //Criar missao

    public MissoesModel criarMissao(MissoesModel missao) {
        return missoesRepository.save(missao);
    }

    //deletar missao

    public void deletarMissao(Long id){
        missoesRepository.deleteById(id);
    }

    //Alterar missao
    public MissoesModel alterarMissao(Long id, MissoesModel missaoAlterada) {
        if(missoesRepository.existsById(id)) {
            missaoAlterada.setId(id);
            missoesRepository.save(missaoAlterada);
        }

        return null;
    }
}
