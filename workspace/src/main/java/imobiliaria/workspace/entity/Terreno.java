package imobiliaria.workspace.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "terreno")
public class Terreno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "endereco")
    private String endereco;

    @Column(name = "medidas")
    private String medidas;

    @NotNull
    @Column(name = "valor_pedida")
    private float valor_pedida;
    
    @Column(name = "valor_venda")
    private float valor_venda;

    @Column(name = "situacao")
    private String situacao;

    @ManyToOne
    @JoinColumn(name = "loteadora_id")
    private Loteadora loteadora;

}
