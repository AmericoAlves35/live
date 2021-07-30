package com.dio.live.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter //vai gerar automaticamente os Getters(visivel dentro do sistema ou por baixo dos panos)
@Setter //vai gerar automaticamente os Setters(visivel dentro do sistema ou por baixo dos panos)
@AllArgsConstructor
//vai gerar automaticamente o construtor com argumentes(visivel dentro do sistema ou por baixo dos panos)
@NoArgsConstructor
//vai gerar automaticamente o construtor sem argumentes(visivel dentro do sistema ou por baixo dos panos)
@Builder// irá funcionar muito bem para testes de software ou passagem de dados
@Entity

public class Movimentacao {
    @AllArgsConstructor
//vai gerar automaticamente o construtor com argumentes(visivel dentro do sistema ou por baixo dos panos)
    @NoArgsConstructor
//vai gerar automaticamente o construtor sem argumentes(visivel dentro do sistema ou por baixo dos panos)
    @EqualsAndHashCode
@Embeddable
    public static class MovimentacaoID implements Serializable { //implementação da INTERFACE "Serializable", para envolver transferência de dados (objetos) em rede, operações com banco de dados e comunicação entre diferentes JVM
        private Long idMovimento;
        private Long idUsuario;
    }
    @Id
    @EmbeddedId
    private  MovimentacaoID id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne
    private  Ocorrencia ocorrencia;
    @ManyToOne
    private  Calendario calendario;


}
