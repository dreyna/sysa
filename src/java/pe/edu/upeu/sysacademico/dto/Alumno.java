/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.sysacademico.dto;

/**
 *
 * @author alum.fial1
 */
public class Alumno {
    private int idalumno;
    private String nombres;
    private String apellidos;

    public Alumno() {
    }

    public Alumno(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Alumno(int idalumno, String nombres, String apellidos) {
        this.idalumno = idalumno;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
}
