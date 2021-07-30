package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter //vai gerar automaticamente os Getters(visivel dentro do sistema ou por baixo dos panos)
@Setter //vai gerar automaticamente os Setters(visivel dentro do sistema ou por baixo dos panos)
@AllArgsConstructor
//vai gerar automaticamente o construtor com argumentes(visivel dentro do sistema ou por baixo dos panos)
@NoArgsConstructor
//vai gerar automaticamente o construtor sem argumentes(visivel dentro do sistema ou por baixo dos panos)
@Builder// irá funcionar muito bem para testes de software ou passagem de dados
@Entity

public class Calendario {
    @Id
private Long id;
@ManyToOne
@JoinColumn(name = "tipo_data_id")
private TipoData tipoData;
private String descricao;
private LocalDateTime dataEspecial;

}
