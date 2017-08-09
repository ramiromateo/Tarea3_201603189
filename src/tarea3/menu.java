/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.util.Scanner;

/**
 *
 * @author P
 */
public class menu {
    
    Scanner lector;
    Scanner lector1;
    int opcion;
    String[] usuario;
    int i;
    String up;
    String pu;
    String p;
    public menu() {
        lector = new Scanner(System.in);
          lector1 = new Scanner(System.in);
        opcion = 0;
        up="";
        pu="";
        p="";
        usuario=new String[5]; 
               
        menuPrincipal();
    }

    public void menuPrincipal() {
        do {
            System.out.println("Tarea 3");
            System.out.println("");
            System.out.println("201603189");
            System.out.println("");
            System.out.println("1. Usuarios");
            System.out.println("2. Palabras Palindromas");
            System.out.println("3. Salir");
            try{opcion = lector.nextInt();}
            catch(Exception e){System.out.println("INGRESE UNA UN NUMERO DEL 1 AL 3");
                System.out.println("");
                    
            new menu();
            }
            
            System.out.println("");
            switch (opcion) {
                case 1:
                       usuarios();
                    break;
                case 2:
                       palabraspali();
                    break;
                
            }
        } while (opcion != 3);
    } 
    
    public void usuarios(){
     do {
            System.out.println("Menu de Usuarios");
            System.out.println("");
            System.out.println("1. Ingrese Usuarios");
            System.out.println("2. Mostrar todos los usuarios");
            System.out.println("3. Mostrar un Usuario Personalizado");
            System.out.println("4. Menu Principal");
            System.out.println("5. Salir");
            try{opcion = lector.nextInt();}
            catch(Exception e){System.out.println("INGRES UN NUMERO DEL 1 AL 5 en el Menu de usuarios");
            System.out.println("");
            new menu();}
            System.out.println("");
            switch (opcion) {
                case 1:
                       IngreseUsuarios();
                    break;
                case 2:
                       MostrarTodosU();
                    break;
                    case 3:
                       MostrarUP();   
                    break;
                    case 4:
             
                    break;
                    case 5:
                    System.exit(0);
                    break;
                    
            }
        } while (opcion != 4);
    
     
    }
    
     public void palabraspali(){
     System.out.println("Palabras Palindromas");
     System.out.println("");
     System.out.println("Ingresar Palabra");
        up=lector1.nextLine();
        p=up.replace(" ","");
        pu=up.replace(" ","");
        p=new StringBuffer(p).reverse().toString();
        if(p.compareTo(pu)==0){
           System.out.println("Si es Palindroma!!"); 
            System.out.println("");
           
        }
        else{System.out.println("No es Palindroma!!");
            System.out.println("");}
     }   

    private void IngreseUsuarios() {
       
        for (i=0;i<usuario.length;i++){
            System.out.println("Ingrese Usuarios");
            usuario[i]=lector1.nextLine();
            
    }
        System.out.println("");
    }

    private void MostrarTodosU() {
        System.out.println("Mostrar Todos Los Usuarios");
       for (i=0;i<usuario.length;i++){
        System.out.println(i+1+". "+usuario[i]);
    }
       System.out.println("");
    }

    private void MostrarUP() {
        System.out.println("Mostrar un Usuario Personalizado");
        System.out.println("");
        System.out.println("Ingresar Usuario");
        System.out.println("");
        up = lector1.nextLine();
        System.out.println("");
        
       if(up.compareToIgnoreCase(usuario[0])==0){
           System.out.println("Usuario"); 
           System.out.println("");
           System.out.println(usuario[0]);
            System.out.println("");
        }
       else if(up.compareToIgnoreCase(usuario[1])==0){
           System.out.println("Usuario"); 
           System.out.println("");
           System.out.println(usuario[1]);
            System.out.println("");
        }
       else if(up.compareToIgnoreCase(usuario[2])==0){
           System.out.println("Usuario");
           System.out.println("");
           System.out.println(usuario[2]);
            System.out.println("");
        }
       else if(up.compareToIgnoreCase(usuario[3])==0){
           System.out.println("Usuario"); 
           System.out.println("");
           System.out.println(usuario[3]);
            System.out.println("");
        }
       else if(up.compareToIgnoreCase(usuario[4])==0){
           System.out.println("Usuario"); 
           System.out.println("");
           System.out.println(usuario[4]);
            System.out.println("");
       }
       else {System.out.println("ERROR!! No Existe Ningun Usuario con esa coincidencia");
       System.out.println("");}
       
    }

     
   
}



