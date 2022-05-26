package com.bolsadeideas.spring.boot.backend.apirest.models.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @NotEmpty(message = "no puede estar vacio")
    @Size(min = 4, max = 14)
    @Getter @Setter @Column(nullable = false)
    private String nombre;

    @NotEmpty
    @Getter @Setter
    private String apellido;

    @NotEmpty
    @Email
    @Getter @Setter @Column(nullable = false, unique = true)
    private String email;

    @PrePersist
    public void prePersist(){
        createAt = new Date();
    }

    @Getter @Setter @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    private static final long serialVersionUID = 1L;
}
