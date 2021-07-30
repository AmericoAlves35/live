package com.dio.live.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Id;
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

public class BancoDeHoras {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class BancoDeHorasId implements Serializable {
        private  long idBancoDeHoras ;
        private  long idMovimentacao;
        private  long idUsuario;
    }
    @Id
    @EmbeddedId
    private  BancoDeHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeDeHoras;
    private BigDecimal saldoHoras;
}
