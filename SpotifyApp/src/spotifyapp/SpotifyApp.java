package spotifyapp;

import java.io.*;
import java.util.*;


public class SpotifyApp {
    static SpotifyManager spm = new SpotifyManager();

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.setProperty("file.encoding", "UTF-8");
        
        System.out.println("♫ SPOTIFY ♫");
        spm.beolvas();
        System.out.println();
        
        System.out.println("Válassz az alábbi menüpontok közül: ");
        System.out.println("<--------------------------------------->");
        SpotifyApp spa = new SpotifyApp();
        try {
            spa.menu();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
    }
    private void menu() throws InterruptedException, IOException
    {
    boolean finsihed = false;
    while(!finsihed){
        
        System.out.println("1 - számok tárolási sorrendben történő lejátszása");
        System.out.println("2 - véletlenszerű sorrendben való lejátszás");
        System.out.println("3 - előadók listázása névsor szerint");
        System.out.println("4 - kiválasztott előadó számainak lejátszása egymás után");
        System.out.println("5 - a számok stílusainak kilistázása");
        System.out.println("6 - lejátszási lista készítése");
        System.out.println("9 - EXIT");
        System.out.print("Kérlek adj meg egy számot: ");
        

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        switch(num){
            case 1:
                spm.playInSort();
                break;
            case 2:
                spm.playInRandom();
                break;
            case 3:
                spm.sortByArtist();
                break;
            case 4:
                spm.listByArtist();
                break;
            case 5:
                spm.listOfStyles();
                break;
            case 6:
                spm.createPlayList();
                break;
            case 9: 
                System.out.println("A program leáll...");
                System.exit(0);
            default:
                System.out.println("ÉRVÉNYTELEN PARANCS.");
        }
         
            
            System.out.println();
            
            System.out.print("Szeretnél mást is csinálni? (igen / nem): ");
            Scanner sc1 = new Scanner(System.in);
            String answer = sc1.next();
            
            if(answer.equals("nem")){
                finsihed = true;
            }

    }
        
    }
    
}
