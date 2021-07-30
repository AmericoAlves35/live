package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter //vai gerar automaticamente os Getters(visivel dentro do sistema ou por baixo dos panos)
@Setter //vai gerar automaticamente os Setters(visivel dentro do sistema ou por baixo dos panos)
@AllArgsConstructor
//vai gerar automaticamente o construtor com argumentes(visivel dentro do sistema ou por baixo dos panos)
@NoArgsConstructor
//vai gerar automaticamente o construtor sem argumentes(visivel dentro do sistema ou por baixo dos panos)
@Builder// irá funcionar
@Entity
@Audited
public class Usuario {
    @Id
    private Long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nome ;
    @ManyToOne
    private Empresa empresa ;
    @ManyToOne
    private NivelDeAcesso nivelDeAcesso ;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho ;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada ;
    private LocalDateTime finalJornada ;
}
