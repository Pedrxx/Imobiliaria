package imobiliaria.workspace.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import imobiliaria.workspace.entity.Terreno;
import imobiliaria.workspace.service.TerrenoService;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/terreno")
@CrossOrigin
public class TerrenoController {

    @Autowired
    TerrenoService terrenoService;

    @GetMapping
    public List<Terreno> listarTodos(Terreno terreno) {
        return terrenoService.listarTodos();
    }

    @PostMapping
    public Terreno inserir(Terreno terreno) {
        return terrenoService.inserir(terreno);
    }

    @PutMapping
    public Terreno atualizar(Terreno terreno) {
        return terrenoService.inserir(terreno);
    }

@PutMapping("/{id}/atualizarTerreno")
    public ResponseEntity<Object> atualizarVenda(@PathVariable("id") Long id, @PathParam("valor_venda") Float valor_venda){
        try {
        terrenoService.atualizarTerreno(id, valor_venda);
        return ResponseEntity.ok("Terreno atualizado com sucesso");
        } catch (NoSuchElementException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public void deletar(long id) {
        terrenoService.delete(id);
    }

    
    
}
