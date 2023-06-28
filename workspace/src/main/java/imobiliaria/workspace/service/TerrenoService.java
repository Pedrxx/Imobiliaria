package imobiliaria.workspace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import imobiliaria.workspace.entity.Terreno;
import imobiliaria.workspace.repository.TerrenoRepository;

@Service
public class TerrenoService {

    @Autowired
    TerrenoRepository terrenoRepository;

    public List<Terreno> listarTodos() {
        return terrenoRepository.findAll();
    }

    public Terreno inserir(Terreno terreno) {
        return terrenoRepository.saveAndFlush(terreno);
    }

    public Terreno atualizar(Terreno terreno) {
        return terrenoRepository.saveAndFlush(terreno);
    }

    public void delete(long id) {
        Terreno terreno = terrenoRepository.findById(id).get();
        terrenoRepository.delete(terreno);
    }

    public void atualizarTerreno(Long id, Float valor_venda){
        terrenoRepository.atualizarVenda(id, valor_venda);
    }
    
}
