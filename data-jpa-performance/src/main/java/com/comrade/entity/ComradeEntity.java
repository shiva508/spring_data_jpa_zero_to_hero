package com.comrade.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ComradeEntity {
    @Id
    //AUTO
    /*
    @GeneratedValue(strategy = GenerationType.AUTO)
    */
    //CUSTOM SEQUENCE with OWNED
    /*
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "shiva_seq")
    @SequenceGenerator(name = "shiva_seq", sequenceName = "shiva_seq",allocationSize = 1)
    */
    //CUSTOM SEQUENCE without OWNED
    /*
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_customer")
    @SequenceGenerator(name = "sequence_customer", sequenceName = "sequence_customer",allocationSize = 1)
    */
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_comrade")
    @SequenceGenerator(name = "sequence_comrade", sequenceName = "sequence_comrade",allocationSize = 1)
    //CUSTOM SEQUENCE with IN BUILD
    /*
    @GenericGenerator(
            name = "sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "user_sequence"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "500"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
            }
    )
    */
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
}
