package com.ponto.acesso.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movimentation {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class MovimentationId implements Serializable{
        private Long IdMovement;
        private Long IdUser;
    }

    @Id
    @EmbeddedId
    private MovimentationId id;
    private LocalDateTime entryDate;
    private LocalDateTime departureDate; //data de saída
    private BigDecimal period;

    @ManyToOne //verificar qual tipo de relacionamento
    private Occurrence occurrence;

    @ManyToOne
    private Calendar calendar;
}
