package com.springboot.ejemplo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Persona {
private String nombre;
private String email;
private String password;
private String genero;
private String domicilio;
private boolean matrimonio;
private Date fechaNacimiento;
private String profesion;
private long ingreso;
}
