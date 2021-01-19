/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busqueda_binaria;
import java.util.Scanner;

public class Principal {

    public static void main(String [] args){
        Scanner leer=new Scanner(System.in);
    
       ordenacion ordenar=new ordenacion();// se inserta un metodo para poder utilizar los datos 
        int vector2[]={55,4,87,22,99,23,56,21};// se declara el vector que se ordenara  poe el dicho metodo
        // se imprime el arreglo que para mostrar los datos  desordenados
        System.out.println("arreglo original :");
        ordenar.mostrarArreglo(vector2); // mandamos a ordenar el metodo de mostrar arreglo
        System.out.println("arreglo ordenado mediante la mezcla directa :");
        ordenar.mezcladirecta(vector2);// se manda a llamar la funcion de metodo mezcla directa con el fin de ordenar los datos
        ordenar.mostrarArreglo(vector2);// con esta accion se ordenan los datos de manera automatica
        // en esste caso se manda al usuario a digitar los datos 
        System.out.println("introdusca en elemento que desea buscar ?");
        int indice=leer.nextInt();// el digito se manda a guardar los datos 
        indice=ordenar.busquedabinaria(vector2, indice);// se manda a guardar los datos y con el metodo de busqueda binaria 
        if (indice!=-1){// si el indice es diferente a -1 se imprime el indice 
            System.out.println("elemento encontrado en el indice :"+ indice);
            
            
        }else{// si el resultado es falso se manda se imprime que el el numero no se encontro 
            System.out.println(" elemento no encontrado");
        }
            
    
}
}
