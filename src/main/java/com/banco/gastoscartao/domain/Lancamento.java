package com.banco.gastoscartao.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Entity
    @Builder
    public class Lancamento implements Serializable {
        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private UUID id;
        private String name;
        private String description;
        private LocalDateTime registerDate;
        private BigDecimal value;
        private String tags;


        /*Criado to string para testar imprimindo no console*/
        @Override
        public String toString() {
            return "Lancamento{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", registerDate=" + registerDate +
                    ", value=" + value +
                    ", tags='" + tags + '\'' +
                    '}';
        }
    }
