/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busqueda_binaria;
public class ordenacion {
    
    public int [] mezcladirecta(int [] arreglo){// se crea un metodo con un parametro de arreglo
        int i,j,k;// se declara tres variables
         
        if(arreglo.length>1){// si el arreglo es mayor a uno tiene que ordenar
            int nElementosizq=arreglo.length/2;// para saber de que tamaño es la izquierda
           // se crea para saber si los elementos de la izquierda son divisibles 
           //y los de derecha se quedan con el resto de numero divididos
            int nElementosder=arreglo.length-nElementosizq;
            // se crea dos arreglos adicionales para saber el tamaño del arreglo izquierdo y derecho
            int arregloizq[]=new int[nElementosizq];
            int arreglosder[]=new int[nElementosder];
            // copiando los elementos de la parte primera al arreglo izq
            for(i=0;i<nElementosizq;i++){
                arregloizq[i]=arreglo[i];
                
            }
             // copiando los elementos de la parte segunda al arreglo der
            for(i=nElementosizq;i<nElementosizq+nElementosder;i++){
                arreglosder[i-nElementosizq]=arreglo[i];
                
            }
           
            // recursividad
            arregloizq=mezcladirecta(arregloizq);
            arreglosder=mezcladirecta(arreglosder);
            // se ordenan los datos y se inicializan los indices
            i=0;
            j=0;
            k=0;
            // mientra arregloizq es diferentes a j y arreglosder son diferentes, va ser repetidos
            while(arregloizq.length!=j && arreglosder.length!=k){
                if(arregloizq[j]<arreglosder[k]){// si arregloizq en su indice j es menor al arreglo al indice k
                    arreglo[i]=arregloizq[j];// va ser igual arregloizq en su posicion j
                    i++;// se incrementan los valores
                    j++;
                }else{ // de lo contrario 
                    arreglo[i]=arreglosder[k];// arreglo i va ser igual al arreglo k
                    i++;// se incrementan los valores
                    k++;
                }
            }
            // arreglo final
            while(arregloizq.length!=j){/// arregloizq sea diferente a j 
                arreglo[i]=arregloizq[j];// arreglo en la pocicion j 
                i++;// se incrementan los valores
                j++;
            }
            while(arreglosder.length!=k){// mientras arreglo der sea diferente k
                arreglo[i]=arreglosder[k];// arreglo en el indice i va ser igual al indice k
                i++;// se incrementa los valores
                k++;
            }
             
        }// fin del if
        return arreglo;// se retorna el arreglo ya en teoria debe estar ordenado 
        
    }
   
// metodo de busqueda binaria
    public int busquedabinaria(int arreglo[], int elemento){// se crea un metodo con dos parametros
        int centro,primero,ultimo,valorcentro;// declaramos las variables 
        primero=0;// inicializamos la variable primero a cero 
         ultimo=arreglo.length-1;// le damos indicaciones que el ultimo dato se reste -1
         while(primero<=ultimo){// se ocupa un while para dar la indicaion que el primero es igual ultimo
             centro=(primero+ultimo)/2; // se suman los datos y se dividen con el fin de encontrar los datos mas rapidos
             valorcentro=arreglo[centro];//el resultado de la suma se pone en el centro 
             System.out.println("comparando a "+elemento+" con "+arreglo[centro]);// se introduce un mensaje de la accion realizada
             if(elemento==valorcentro){//  se inicia la comparacion si los datos son iguales 
                 return centro;// se retorna el valor central
                 
             }else if(elemento<valorcentro){ // si el valor central en mayor 
                 ultimo=centro-1;// dezplazamos al izquierda
                 
             }else{
                 primero=centro+1;// dezplazarnos hacia la deredcha
             }
             
         }
         return-1; // se retorna -1 porque no se encuentra el elemnto 
    }
    
    public void mostrarArreglo(int[]arreglo){// se inserta un metodo para mostrar los datos
        int k; 
        for(k=0;k<arreglo.length;k++){// se utiliza un for cuando k vale 0 cuando sea menor que el arreglo que se incremente
            System.out.print("["+arreglo[k]+"]");
            }
        System.out.println();
        
    }
    
}




