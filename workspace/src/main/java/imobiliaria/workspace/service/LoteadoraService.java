package imobiliaria.workspace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import imobiliaria.workspace.entity.Loteadora;
import imobiliaria.workspace.repository.LoteadoraRepository;

@Service
public class LoteadoraService {
    
    @Autowired
    private LoteadoraRepository loteadoraRepository;

    public List<Loteadora> listarTodos() {
        return loteadoraRepository.findAll();
    }

    public Loteadora inserir(Loteadora loteadora) {
        Loteadora loteadoraNovo = loteadoraRepository.saveAndFlush(loteadora);
        return loteadoraNovo;
    }

    public Loteadora atualizar(Loteadora loteadora) {
    Loteadora loteadoraNovo = loteadoraRepository.saveAndFlush(loteadora);
    return loteadoraNovo;
    }   

    public void excluir(Long id){
        Loteadora loteadora = loteadoraRepository.findById(id).get();
        loteadoraRepository.delete(loteadora);
    }
}
