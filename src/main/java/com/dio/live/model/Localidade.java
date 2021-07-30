package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;


@Getter //vai gerar automaticamente os Getters(visivel dentro do sistema ou por baixo dos panos)
@Setter //vai gerar automaticamente os Setters(visivel dentro do sistema ou por baixo dos panos)
@AllArgsConstructor
//vai gerar automaticamente o construtor com argumentes(visivel dentro do sistema ou por baixo dos panos)
@NoArgsConstructor
//vai gerar automaticamente o construtor sem argumentes(visivel dentro do sistema ou por baixo dos panos)
@Builder// irá funcionar muito bem para testes de software ou passagem de dados
@Entity

public class Localidade {
    @Id
    private Long id;
 @ManyToOne
    private NivelDeAcesso nivelDeAcesso;
    private String descricao;
}
