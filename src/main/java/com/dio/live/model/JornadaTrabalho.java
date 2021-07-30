package com.dio.live.model;

import lombok.*;// para inserir notaçoes,automatizar minhas classes, deixar codigo mais enxuto
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


// a seguir iserir as NOTAÇÕES para deixar o codigo mais enxuto, menor(visivel dentro do sistema ou por baixo dos panos)
@Getter //vai gerar automaticamente os Getters(visivel dentro do sistema ou por baixo dos panos)
@Setter //vai gerar automaticamente os Setters(visivel dentro do sistema ou por baixo dos panos)
@AllArgsConstructor //vai gerar automaticamente o construtor com argumentes(visivel dentro do sistema ou por baixo dos panos)
@NoArgsConstructor//vai gerar automaticamente o construtor sem argumentes(visivel dentro do sistema ou por baixo dos panos)
@Builder// irá funcionar muito bem para testes de software ou passagem de dados
@Entity
@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private long id;
    private String descricao;



}
