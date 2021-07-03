package com.ponto.acesso.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Calendar {

    @Id
    private Long id;

    @ManyToOne
    private DateType dateType;

    private String description;

    private LocalDateTime specialDate;
}
