/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ncortesd.a09;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPPNCortesDA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb= new Scanner (System.in);
        int suma=0;
        int [][] matrix1 = new int [solicitaTamaño()][solicitaTamaño()];
        for (int i=0; i<matrix1.length; i++){
            for (int j=0; j<matrix1.length; j++){
                matrix1[i][j]=solicitaEntero();
            }
        }
        int [][] matrix2 = new int [solicitaTamaño()][solicitaTamaño()];
        for (int i=0; i<matrix2.length; i++){
            for (int j=0; j<matrix2.length; j++){
                matrix2[i][j]=solicitaEntero();
            }
        }
        
    }
    public static int solicitaTamaño(){
        Scanner kb= new Scanner (System.in);
        int tamaño;
        System.out.println("Introduce el tamaño de la matriz");
        tamaño=kb.nextInt();
        return tamaño;
    }
    public static int solicitaEntero(){
        Scanner kb= new Scanner (System.in);
        boolean flag;
        int n=0;
        do{
            System.out.println("Introduce un número entero");
            try{
                n=kb.nextInt();
                flag=false;
                
            }
            catch(Exception er){
                System.out.println("Lo que introdujo no es un entero, Inténtalo de nuevo");
                flag=true;
                kb.nextLine();
            }
        }while (flag);
        return n;
    }
}