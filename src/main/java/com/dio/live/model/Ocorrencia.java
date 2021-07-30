package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter //vai gerar automaticamente os Getters(visivel dentro do sistema ou por baixo dos panos)
@Setter //vai gerar automaticamente os Setters(visivel dentro do sistema ou por baixo dos panos)
@AllArgsConstructor
//vai gerar automaticamente o construtor com argumentes(visivel dentro do sistema ou por baixo dos panos)
@NoArgsConstructor
//vai gerar automaticamente o construtor sem argumentes(visivel dentro do sistema ou por baixo dos panos)
@Builder// irá funcionar muito bem para testes de software ou passagem de dados
@Entity

public class Ocorrencia {
    @Id
    private Long id;
    private String nome;
    private String descricao;


}
