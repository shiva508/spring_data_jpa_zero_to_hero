package com.comrade.domine;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Contact")
public class ContactEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    private Name name;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "WEB_SITE")
    private String website;

    @Column(name = "STARED")
    private boolean starred;
}
