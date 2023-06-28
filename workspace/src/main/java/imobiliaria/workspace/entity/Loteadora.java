package imobiliaria.workspace.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Data
@Table(name = "loteadora")
public class Loteadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome_fantasia")
    private String nome_fantasia;

    @NotNull
    @Column(name = "razao_social")
    private String razao_social;
    
    // @Pattern(regexp = "\\(d{2})\\d{5}-\\d{4}", message = "Formato de CEP inválido")
    @Column(name = "telefone")
    private String telefone;

    @NotNull
    @Column(name = "porcentagem_venda")
    private float porcentagem_venda;

}
