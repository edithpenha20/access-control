package com.ponto.acesso.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Occurrence {

    @Id
    private Long id;
    private String name;
    private String description;
}
