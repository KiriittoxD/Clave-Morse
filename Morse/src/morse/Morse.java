/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.util.Scanner; //importacion de la clase scanner

/**
 *
 * @author moral
 */
public class Morse {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String vec_mor[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",/**a-j**/
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-",/**k-u**/
            "...-",".--","-..-","-.--","--..", /**v-z**/
            "-----",".----","..---","...--","....-",".....","-....","--...","---..","----."/**0-9**/};
        String abe = "abcdefghijklmnopqrstuvwxyz0123456789"; 
        String blanck = "   ";
        int op , f;
        char z;
        String morse, mor="",texto="";
        System.out.println("Programa Conversion");
        System.out.println("1.-Morse" + " \n" + "2.-Texto" + " \n" + "3.-Salir" + " \n" + "Seleccione una opcion: ");
        Scanner entradaEscaner = new Scanner (System.in);//creacion del metodo scanne
        op = Integer.parseInt(entradaEscaner.nextLine());//introduccion de datos a la variable op
        if (op==1){
            System.out.println("Introduzca clave morse:");
            Scanner entrada = new Scanner (System.in);//creacion del metodo scanner
            morse = entrada.nextLine();//introduccion de datos a la variable morse
            String text[]= morse.split(" ");
            f = text.length;//tamaño de la cadena
            for  (int i = 0; i < f; i++){
                    for (int j = 0; j < 60; j++)
                        if(text[i].equals(vec_mor[j])){
                            texto = texto + abe.charAt(j);
                            break;      
                        }
            }
            System.out.println(texto);
        
        }else if(op==2){
            System.out.println("Texto");
            Scanner entrada = new Scanner (System.in);//creacion del metodo scanner
            texto = entrada.nextLine();//introduccion de datos a la variable morse
            texto.toLowerCase();//conversion cadena a minusculas
            f = texto.length();//tamaño de la cadena
            for  (int i = 0; i < f ; i++){ 
		if (texto.charAt(i)==' ') mor = mor +  "   ";//comprobr si es un es un espacio, de ser asi colocar 3 espacios
		else {
                    for  (int j = 0; j < abe.length() ; j++) {
			if (texto.charAt(i) == abe.charAt(j))
                            mor = mor + vec_mor[j]+' ';	// Poner el if si no hay letras
                    }
		}
            }
            System.out.println(mor);
        }else if (op==3){
            System.exit(0);
        }
    
    }
    
}
