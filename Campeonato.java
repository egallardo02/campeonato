/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato;
import java.util.Scanner;
/**
 *
 * @author Eddy
 */
public class Campeonato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int golesanotados=0,golesrecibidos=0,golesfavor=0,golescontra=0,partidosganados=0,partidosperdidos=0,partidosempatados=0,puntos=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Partido n° "+(i+1));
            do{
                System.out.println("Ingrese los goles anotados en este partido");
                golesanotados = leer.nextInt();
                if(golesanotados<0){
                    System.out.println("La cantidad ingresada no es válida");
                    System.out.println("Ingrese nuevamente");
                }
            }while(golesanotados<0);
            do{
                System.out.println("Ingrese los goles recibidos en este partido");
                golesrecibidos = leer.nextInt();
                if(golesrecibidos<0){
                    System.out.println("LA cantidad ingresada no es válida");
                    System.out.println("Ingrese nuevamente");
                }
            }while(golesrecibidos<0);    
            
            golesfavor = golesfavor + golesanotados;
            golescontra = golescontra + golesrecibidos;
            
            if(golesanotados>golesrecibidos){
            partidosganados++;
            puntos=puntos+3;
            }else{
                if(golesanotados<golesrecibidos){
                    partidosperdidos++;
                }else{
                    partidosempatados++;
                    puntos++;
                }
            }
        }
        System.out.println("goles a favor");
        System.out.println(golesfavor);
        System.out.println("");
        System.out.println("goles en contra");
        System.out.println(golescontra);
        System.out.println("");
        System.out.println("Los puntos ganados fueron");
        System.out.println(puntos);
        System.out.println("");
        System.out.println("diferencia de goles:");
        System.out.println(golesfavor-golescontra);
        System.out.println("Cantidad de partidos ganados: ");
        System.out.println(partidosganados);
        System.out.println("");
        System.out.println("Cantidad de partidos perdidos: ");
        System.out.println(partidosperdidos);
        System.out.println("");
        System.out.println("Cantidad de partidos empatados: ");
        System.out.println(partidosempatados);
        System.out.println("");
        
        if(puntos<10){
            System.out.println("El equipo quedo en liguilla de promoción");
        }else{
            if(puntos>=10&&puntos<20){
                System.out.println("El equipo no quedó en liguilla");
                }else{
                    System.out.println("El equipo quedó en la liga de campeonato");
                }
            }
        
        
    }
    
}
