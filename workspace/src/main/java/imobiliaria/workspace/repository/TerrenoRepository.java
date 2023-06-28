package imobiliaria.workspace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import imobiliaria.workspace.entity.Terreno;
import jakarta.transaction.Transactional;

public interface TerrenoRepository extends JpaRepository<Terreno, Long> {

    @Modifying
    @Transactional
    @Query("update terreno t set t.situacao = 'Vendido', t.valor_venda = ?2 where t.id = ?1")
    public void atualizarVenda(Long id, Float valor_venda);
}

