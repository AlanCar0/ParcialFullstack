package com.model;

import jakarta.persistence.*;
import lombok.*;
/* cliente necesita
 * - rut
 * - nombre
 * - apellido
 * - telefono
 * - email
 */
@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class cliente{
    @Id
    private String rut;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String direccion;

    @Column(name = "fecha_nacimiento")
    /* fechas dia/mes/año */
    private String fechaNacimiento;

    private String sexo;
    private String password;
}
