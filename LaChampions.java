/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab2, Arrays y excepciones
 * 22-09-2323
 * @return La Champions
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LaChampions {
    public static void main(String[] args){

        //definir menu
        int top = 3;
        String menu = "La Champions League"+"\n"+
        "1. Mostar todos los jugadores"+"\n"+
        "2. Top "+top+" mejores porteros"+"\n"+
        "3. Numero de extremos mas efectivos"+"\n"+
        "4. Salir";
        
        //arrays
        ArrayList<Goalkeeper> GKs = new ArrayList<Goalkeeper>();
        ArrayList<Extremo> Exs = new ArrayList<Extremo>();
        ArrayList<Float> Top3 = new ArrayList<Float>();
        
        //instanica de objetos
        Goalkeeper GK1 = new Goalkeeper("Iker Casillas", "Spain", 0, 2,5,15,4); 
        Goalkeeper GK2 = new Goalkeeper("Marc-André ter Stegen ", "Germany", 0, 1,1,60,16);
        Goalkeeper GK3 = new Goalkeeper("Gianluigi Buffon", "Italy", 2, 2,5,40,10);
        Goalkeeper GK4 = new Goalkeeper("Jan Oblack", "Slovenia", 1, 2,5,37,12);
        Goalkeeper GK5 = new Goalkeeper("Ederson Moraes", "Brazil", 2,0,5,36,4);
        

        Extremo Ex1 = new Extremo("Bernardo Silva", "Portugal",1,7,13,120,15);
        Extremo Ex2 = new Extremo("Lionel Messi", "Argentina",1,91,120,232,28);
        Extremo Ex3 = new Extremo("Jack Grealish", "Englang",5,12,15,320,9);
        Extremo Ex4 = new Extremo("Mohamed Salah", "Egipt",3,68,90,120,40);
        Extremo Ex5 = new Extremo("Rafa Leao", "Portugal",0,2,9,140,12);
        Extremo Ex6 = new Extremo("Ferran Torres", "Spain",2,6,6,115,5);

        Scanner scanner = new Scanner(System.in);

        //agregar objetos a los arrays
        GKs.add(GK1);
        GKs.add(GK2);
        GKs.add(GK3);
        GKs.add(GK4);
        GKs.add(GK5);

        Exs.add(Ex1);
        Exs.add(Ex2);
        Exs.add(Ex3);
        Exs.add(Ex4);
        Exs.add(Ex5);
        Exs.add(Ex6);

        //variables y operaciones necesarias para el codigo
        boolean run = true;
        int inputOption = 0;
        for(int i = 0; i<GKs.size();i++){
                GKs.get(i).setEfectividad();
            }
            for(int i = 0; i<Exs.size();i++){
                Exs.get(i).setEfectividad();
            }
        //porgrama
        while(run == true){
            System.out.println(menu);
            
            System.out.println("Ingresa una opcion del menu: ");
            inputOption = scanner.nextInt();

            System.out.println("\n ");

            if (inputOption == 1){

            //imprimir todo el array porteros
            System.out.println("Porteros: ");    
            for(int i = 0; i<GKs.size();i++){
                System.out.println(GKs.get(i).toString());
            }

            //imprimir todo el array extremos
            System.out.println("\n ");
            System.out.println("Extremos: ");
            for(int i = 0; i<Exs.size();i++){
                System.out.println(Exs.get(i).toString());
            }
            System.out.println("\n ");
            }
            
            if(inputOption == 2){

            //crear un nuevo array solo con los floats de efectividad
            System.out.println("Top 3 porteros:");
            for(int i = 0; i<GKs.size();i++){
                Top3.add(GKs.get(i).getEfectividad()); 
            }
            
            //ordenar el nuevo array de mayor a menor
            Collections.sort(Top3, new Comparator<Float>() {
                public int compare(Float o1, Float o2) {
                    return Float.compare(o2, o1); 
                }
               
            });

            //elemento aesthetic
            int num = 0;

                //imprimir todos los jugadores correspondientes al float(efectividad) del mas grande al mas pequeño
                for (int i = 0; i<top; i++) {
                    num++;
                    for (int j = 0; j<GKs.size();j++){
                        if(Top3.get(i) - GKs.get(j).getEfectividad() == 0){
                        System.out.println(num + " " + GKs.get(j).toString());
                    }
                }
            }
            
            System.out.println("\n");
            }

            //los extremos con mas de 85% de efectividad
            if(inputOption == 3){
                int Excounter = 0;
                for(int i = 0; i<Exs.size();i++){
                    //suponemos que 200 es el total, por lo que 85% es 170 
                    if(Exs.get(i).getEfectividad() >= 170){
                    Excounter++;
                }
                

            }
            System.out.println("Hay " + Excounter + " extremos con una efectividad mayor al 0.85%.");
            System.out.println("\n ");
            }

            //cerrar programa
            if(inputOption == 4){
                System.out.println("Gracias por ver las estadisticas de La Champions.");
                run = !run;
            }

            //progra defensiva de bajo nivel (no soporta si ingresan letras, solo ints)
            else{
                System.out.println("Ingrese una opcion valida");
            }
        }
    }
}
