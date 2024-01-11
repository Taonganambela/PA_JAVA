package com.zmltd.pending.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "PA")

public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String msisdn;

    // @Test
    // public void when_deleted ( ) {

    // PhoneNumber.deleteById(PhoneNumber.getId("taonga"));
    // assertThat(PhoneNumber.count()).isEqual(1);
    // }

}
