/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

/**
 *
 * @author aleja
 */

public class Usuario {

    
    private String nombre;
    private String correo;
    private String contrasena;

    
    public Usuario() {
        this.nombre = "";
        this.correo = "";
        this.contrasena = "";
    }

    
    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Metodo que valida el formato del correo
    //  @ y terminar en .com, .net u .org
    public boolean validarCorreo() {
        return correo.contains("@") &&
               (correo.contains(".com") || correo.contains(".net") || correo.contains(".org"));
    }

    // Al menos 8 caracteres
    public boolean validarContrasena() {
        return contrasena.length() >= 8;
    }

    @Override
    public String toString() {
        return "Datos del Usuario Registrado"
                + "\n\nNombre: " + nombre
                + "\nCorreo: " + correo
                + "\nContraseña: " + contrasena;
    }

}
