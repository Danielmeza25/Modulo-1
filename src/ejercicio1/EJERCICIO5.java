/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Daniel
 */
public class EJERCICIO5 {
    public static void main(String[] args) {
        String[] nombre={"ARNOL", "AXEL", "JHONY", "WUILLIAMS", "BIANCA"};
        String[] apellido={"AMAYA", "GUTIERREZ", "SANTOS", "BERRIOS", "BONIILLA"};
        String[] carrera={"INDUSTRIAL", "COMPUTACION", "ELECTRONICA", "INDUSTRIAL", "COMPUTACION"};
        String[] lugarTrabajo={"CORTITELAS", "ENEE", "TECHNOS", "TEVISAT", "TIGO"};
        
        System.out.println("NOMBRE      APELLIDO        CARRERA          LUGAR DE TRABAJO");
        for(int i=0;i<5;i++){
            System.out.println(nombre[i] + "         " + apellido[i] + "        " + carrera[i] + "        " + lugarTrabajo[i]);
        }
    }
}

