
package boletin21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Boletin21 {

    
    public static void engadir (String nomFich,ArrayList<String> lista){
        PrintWriter engado = null;
        FileWriter fich;
        try{
           engado= new PrintWriter(new FileWriter(nomFich,true));
           for(int i = 0 ; i<lista.size();i++){
              engado.print(lista.get(i)+" "); 
           }
           engado.println("\n");
        }catch(IOException ex){
            System.out.println("Error 7: "+ex.getMessage());
        }finally{
            engado.close();
        }
        
    }
    
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
        System.out.println("Escribe o que queiras poñen no ficheiro:");
       String cadea = sc.nextLine();
        System.out.println(cadea);
        String cadeas[] = cadea.split(" ");
        for(int i =0; i<cadeas.length;i++){
            listaNomes.add(cadeas[i]);
        }
        Collections.sort(listaNomes);
        engadir("ficheiro.txt",listaNomes);
    }
    
}
