package com.finedu.shares.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Share {
    @Id
    @SequenceGenerator(
            name = "share_id_sequence",
            sequenceName = "share_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "share_id_sequence"
    )
    private int id;
    private String fullName;
    private String nyse;
    private BigDecimal price;
    private BigDecimal dividend;
}
