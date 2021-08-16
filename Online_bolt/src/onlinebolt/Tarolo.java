package onlinebolt;

import java.util.*;
import java.io.*;

public class Tarolo {
    
    private final String INPUT_FILENAME = "termekek.txt";

    public ArrayList<Termekek> termekek = new ArrayList<>();
    public ArrayList<Termekek> kosar = new ArrayList<>();
    
    public void beolvasTermekek(){
        String line;
        int j = 0;
        try
        {
            BufferedReader objReader = new BufferedReader(new FileReader("termekek.txt"));
            try
            {
                while((line = objReader.readLine()) != null)
                {
                    String [] elemek = line.split(";");
                    Termekek termek = new Termekek(elemek[0], Integer.parseInt(elemek[1]), elemek[2], Integer.parseInt(elemek[3]));
                    termekek.add(j, termek);
                    j++;
                }
            }catch(IOException e)
            {
                System.out.println(e + "Hibas adat");
            }
        }catch(FileNotFoundException ex)
        {
            System.out.println(ex + "A fajl nem letezik");
        }
        
    }
    
    public void beolvasKosar(){
        String line;
        int j = 0;
        try
        {
            BufferedReader objReader = new BufferedReader(new FileReader("kosar.txt"));
            try
            {
                while((line = objReader.readLine()) != null)
                {
                    String [] elemek = line.split(";");
                    Termekek product = new Termekek(elemek[0], Integer.parseInt(elemek[1]), elemek[2], Integer.parseInt(elemek[3]));
                    this.kosar.add(j, product);
                    j++;
                }
            }catch(IOException | NumberFormatException e){
                System.out.println(e + "Hibás adat");
            }

        }catch(FileNotFoundException ex){
                System.out.println(ex + "A fájl nem létezik");
        }
    }
    
}

    

    
    

