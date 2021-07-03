package com.ponto.acesso.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnnualLeave {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class AnnualLeaveId implements Serializable {
        private Long IdAnnualLeave;
        private Long IdMovimentation;
        private Long IdUser;
    }

    @EmbeddedId
    private AnnualLeaveId id;
    private LocalDateTime dateWorked;
    private BigDecimal quantityHours; //quantidadeHoras
    private BigDecimal balanceHours; //saldoHoras
}
