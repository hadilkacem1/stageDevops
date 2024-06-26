package com.Telnet.volet.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Table(name = "volets")
@Entity
public class Volet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Enumerated(EnumType.STRING)
    private EAxe axe;

    @OneToMany(mappedBy = "volet", cascade = CascadeType.ALL)
    private List<Cadran> cadrans;

    public Volet() {
    }


    public Volet(@NotBlank String name, EAxe axe) {
        this.name = name;
        this.axe = axe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EAxe getAxe() {
        return axe;
    }

    public void setAxe(EAxe axe) {
        this.axe = axe;
    }


}