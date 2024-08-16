/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

public class clasePadre {

    public class PersonaPadre {
        // atributos de la clase y los que se van heredar

        protected String nombre;
        protected String cedula;
        protected String profesion;
        protected String estadoCivil;
        protected String direccion;
        protected String telefono;

        /**
         * constructor de la clase, Inicializa los atributos
         * @param nombre
         * @param cedula
         * @param profesion
         * @param estadoCivil
         * @param direccion
         * @param telefono
         */
        public PersonaPadre(String nombre, String cedula, String profesion, String estadoCivil, String direccion,
                String telefono) {
            this.nombre = nombre;
            this.cedula = cedula;
            this.profesion = profesion;
            this.estadoCivil = estadoCivil;
            this.direccion = direccion;
            this.telefono = telefono;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCedula() {
            return cedula;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public String getProfesion() {
            return profesion;
        }

        public void setProfesion(String profesion) {
            this.profesion = profesion;
        }

        public String getEstadoCivil() {
            return estadoCivil;
        }

        public void setEstadoCivil(String estadoCivil) {
            this.estadoCivil = estadoCivil;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        @Override
        public String toString() {
            return "PersonaPadre [nombre=" + nombre + ", cedula=" + cedula + ", profesion=" + profesion + ", estadoCivil="
                    + estadoCivil + ", direccion=" + direccion + ", telefono=" + telefono + "]";
        }

    }

}
