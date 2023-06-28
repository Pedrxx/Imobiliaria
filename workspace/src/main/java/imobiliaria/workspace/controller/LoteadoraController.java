package imobiliaria.workspace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import imobiliaria.workspace.entity.Loteadora;
import imobiliaria.workspace.service.LoteadoraService;

@RestController
@RequestMapping("/loteadora")
@CrossOrigin
public class LoteadoraController {

    @Autowired
    LoteadoraService loteadoraService;

    @GetMapping
    public List<Loteadora> listarTodos() {
        return loteadoraService.listarTodos();
    }

    @PostMapping
    public Loteadora inserir(@RequestBody Loteadora loteadora) {
        return loteadoraService.inserir(loteadora);
    }

    @PutMapping
    public Loteadora atualizar(@RequestBody Loteadora loteadora) {
        return loteadoraService.atualizar(loteadora);
    }

        @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Long id){
        loteadoraService.excluir(id);
    }
    
}
