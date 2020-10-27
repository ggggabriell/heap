package heapsort;

import static heapsort.HEAPSORT.heapsort;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        List<Integer> valores = new ArrayList<Integer>();

        BufferedReader br2 = new BufferedReader(new FileReader("C:/Users/gabri/Desktop/10000_numbers.txt"));
        String numeros;
        int i;
        
        while ((numeros = br2.readLine()) != null) {
            int converted = Integer.parseInt(numeros);
            valores.add(converted);
        }   
        
        int []valor = new int[valores.size()+1];
          for (i = 0; i <= 9999; i++) {
            valor[i] = valores.get(i);
        }
        
        heapsort(valor);
      
        }
 
    }
    
