package org.turtle.practice.api.coupon.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "coupon_id_seq")
    @SequenceGenerator(name = "coupon_id_seq", sequenceName = "coupon_id_seq", allocationSize = 1)
    private Long id;
    String code;
    Long discount;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-ddTHH:mm:ss")
    LocalDateTime expiryDate;

}
