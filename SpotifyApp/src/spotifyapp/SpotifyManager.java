package spotifyapp;

import java.io.*;
import java.util.*;



public class SpotifyManager {

    
    private final static String INPUT_FILENAME = "songs.txt";
    
    
    ArrayList<Spotify> sp = new ArrayList<Spotify>();
    
    
    public void beolvas() throws FileNotFoundException{
        String line;
        int j = 0;
        try{
           BufferedReader objReader = new BufferedReader(new FileReader(INPUT_FILENAME));
           
           try{
               while((line = objReader.readLine()) != null){
                    String[] elemek = line.split(";");
                    Spotify spotify = new Spotify(elemek[0], elemek[1],elemek[2],Integer.parseInt(elemek[3]),elemek[4]);
                    sp.add(j, spotify);
                    j++;
               }
           }catch(IOException e){
               System.out.println(e + "Hibas adat");
           }
        }catch(FileNotFoundException ex){
            System.out.println(ex + "Nem letezik a fajl");
        } 
    }

    
    public void playInSort(){
    int oszlop1 = 0;
    int oszlop2 = 0;
    int oszlop3 = 0;
    int oszlop4 = 0;
    int oszlop5 = 0;
    
    for(int i= 0 ;i < sp.size();i++){
        if(sp.get(i).getSzamcime().length() > oszlop1){
            oszlop1 = sp.get(i).getSzamcime().length();
        }
    }
    
    for(int i= 0 ;i < sp.size(); i++){
        if(sp.get(i).getEloado().length() > oszlop2){
            oszlop2 = sp.get(i).getEloado().length();
        }
    }
    
    for(int i= 0 ;i < sp.size() ;i++){
        if(sp.get(i).getStilus().length() > oszlop3){
            oszlop3 = sp.get(i).getStilus().length();
        }
    }
    
   
    for(int i= 0 ;i < sp.size();i++){
        if(sp.get(i).getAlbum().length() > oszlop4){
            oszlop4= sp.get(i).getAlbum().length();
        }
    }
    
    for(int i= 0 ;i < sp.size();i++){
        if(sp.get(i).getSzamhossz() > oszlop5){
            oszlop5 = sp.get(i).getSzamhossz();
        }
    }
    
    int szokoz;
    for(int i=0;i<sp.size();i++){
        //1.oszlop
        szokoz = (((oszlop1 - sp.get(i).getSzamcime().length()+4)));
        System.out.print(sp.get(i).getSzamcime());
        for(int j = 0; j <= szokoz ;j++){
            System.out.print(" ");
        }
        //2.oszlop
        szokoz = (((oszlop2 - sp.get(i).getEloado().length()+4)));
        System.out.print(sp.get(i).getEloado());
        for(int j = 0; j <= szokoz ;j++){
            System.out.print(" ");
        }
        //3.oszlop
        szokoz = (((oszlop3 - sp.get(i).getStilus().length()+4)));
        System.out.print(sp.get(i).getStilus());
        for(int j = 0; j <= szokoz ;j++){
            System.out.print(" ");
        }
        //4.oszlop
        szokoz = (((oszlop4 - sp.get(i).getAlbum().length()+4)));
        System.out.print(sp.get(i).getAlbum());
        for(int j = 0; j <= szokoz ;j++){
            System.out.print(" ");
        }
        //5.oszlop
        szokoz = (((oszlop5 - (sp.get(i).getSzamhossz()+4))));
        System.out.print(sp.get(i).getSzamhossz());
        for(int j = 0; j <= 4 ;j++){
            System.out.print(" ");
        }
        System.out.print("--- (LEJATSZVA)");
        System.out.println();
    }  
}

    public void playInRandom(){
        
    Collections.shuffle(sp);
    
    int oszlop1 = 0;
    int oszlop2 = 0;
    int oszlop3 = 0;
    int oszlop4 = 0;
    int oszlop5 = 0;
    
    for(int i= 0 ;i < sp.size();i++){
        if(sp.get(i).getSzamcime().length() > oszlop1){
            oszlop1 = sp.get(i).getSzamcime().length();
        }
    }
    
    for(int i= 0 ;i < sp.size(); i++){
        if(sp.get(i).getEloado().length() > oszlop2){
            oszlop2 = sp.get(i).getEloado().length();
        }
    }
    
    for(int i= 0 ;i < sp.size() ;i++){
        if(sp.get(i).getStilus().length() > oszlop3){
            oszlop3 = sp.get(i).getStilus().length();
        }
    }
    
   
    for(int i= 0 ;i < sp.size();i++){
        if(sp.get(i).getAlbum().length() > oszlop4){
            oszlop4= sp.get(i).getAlbum().length();
        }
    }
    
    for(int i= 0 ;i < sp.size();i++){
        if(sp.get(i).getSzamhossz() > oszlop5){
            oszlop5 = sp.get(i).getSzamhossz();
        }
    }
    
    int szokoz;
    for(int i=0;i<sp.size();i++){
        //1.oszlop
        szokoz = (((oszlop1 - sp.get(i).getSzamcime().length()+4)));
        System.out.print(sp.get(i).getSzamcime());
        for(int j = 0; j <= szokoz ;j++){
            System.out.print(" ");
        }
        //2.oszlop
        szokoz = (((oszlop2 - sp.get(i).getEloado().length()+4)));
        System.out.print(sp.get(i).getEloado());
        for(int j = 0; j <= szokoz ;j++){
            System.out.print(" ");
        }
        //3.oszlop
        szokoz = (((oszlop3 - sp.get(i).getStilus().length()+4)));
        System.out.print(sp.get(i).getStilus());
        for(int j = 0; j <= szokoz ;j++){
            System.out.print(" ");
        }
        //4.oszlop
        szokoz = (((oszlop4 - sp.get(i).getAlbum().length()+4)));
        System.out.print(sp.get(i).getAlbum());
        for(int j = 0; j <= szokoz ;j++){
            System.out.print(" ");
        }
        //5.oszlop
        szokoz = (((oszlop5 - (sp.get(i).getSzamhossz()+4))));
        System.out.print(sp.get(i).getSzamhossz());
        for(int j = 0; j <= 4 ;j++){
            System.out.print(" ");
        }
        System.out.print("--- (LEJATSZVA)");
        System.out.println();
    }  
    
}

    public void sortByArtist(){
    Comparator<Spotify> byArtist = new Comparator<Spotify>(){
        @Override
        public int compare(Spotify sp1, Spotify sp2){
            return sp1.getEloado().compareTo(sp2.getEloado());
        }
    };
    
    Collections.sort(sp, byArtist);
    
    
    System.out.println("A előadók nevei ABC sorrendben: ");
    for(int i = 0;i<sp.size();i++){
        if(i < (sp.size() - 1)){
            if(!(sp.get(i).getEloado().equals(sp.get(i+1).getEloado()))){
                System.out.println(sp.get(i).getEloado());
            }
        }
        if(i == sp.size()){
            if(!(sp.get(i).getEloado().equals(sp.get(i-1).getEloado()))){
                System.out.println(sp.get(i).getEloado());
            }
        }   
    }   
}

    public void listByArtist(){    
     int oszlop1 = 0, oszlop2 = 0, oszlop3 = 0, oszlop4 = 0, oszlop5 = 0;
     
     ArrayList<Spotify> masolat = new ArrayList<Spotify>();

     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

     try{

        System.out.print("Kérem az előadó nevét: ");
        String artist = in.readLine();
        for(Spotify k : sp){
            if(k.getEloado().contains(artist)){
                masolat.add(k);
            }
        }

        if(masolat.isEmpty()){
                System.out.println("A beírt előadónak nincsenek zenéi.");
        }
        else{


                 for(int i= 0 ;i < masolat.size();i++){
                     if(masolat.get(i).getSzamcime().length() > oszlop1){
                         oszlop1 = masolat.get(i).getSzamcime().length();
                     }
                 }

                 for(int i= 0 ;i < masolat.size(); i++){
                     if(masolat.get(i).getEloado().length() > oszlop2){
                         oszlop2 = masolat.get(i).getEloado().length();
                     }
                 }

                 for(int i= 0 ;i < masolat.size() ;i++){
                     if(masolat.get(i).getStilus().length() > oszlop3){
                         oszlop3 = masolat.get(i).getStilus().length();
                     }
                 }


                 for(int i= 0 ;i < masolat.size();i++){
                     if(masolat.get(i).getAlbum().length() > oszlop4){
                         oszlop4= masolat.get(i).getAlbum().length();
                     }
                 }

                 for(int i= 0 ;i < masolat.size();i++){
                     if(masolat.get(i).getSzamhossz() > oszlop5){
                         oszlop5 = masolat.get(i).getSzamhossz();
                     }
                 }

                 int szokoz;
                 for(int i=0;i<masolat.size();i++){
                     //1.oszlop
                     szokoz = (((oszlop1 - masolat.get(i).getSzamcime().length()+4)));
                     System.out.print(masolat.get(i).getSzamcime());
                     for(int j = 0; j <= szokoz ;j++){
                         System.out.print(" ");
                     }
                     //2.oszlop
                     szokoz = (((oszlop2 - masolat.get(i).getEloado().length()+4)));
                     System.out.print(masolat.get(i).getEloado());
                     for(int j = 0; j <= szokoz ;j++){
                         System.out.print(" ");
                     }
                     //3.oszlop
                     szokoz = (((oszlop3 - masolat.get(i).getStilus().length()+4)));
                     System.out.print(masolat.get(i).getStilus());
                     for(int j = 0; j <= szokoz ;j++){
                         System.out.print(" ");
                     }
                     //4.oszlop
                     szokoz = (((oszlop4 - masolat.get(i).getAlbum().length()+4)));
                     System.out.print(masolat.get(i).getAlbum());
                     for(int j = 0; j <= szokoz ;j++){
                         System.out.print(" ");
                     }
                     //5.oszlop
                     szokoz = (((oszlop5 - (masolat.get(i).getSzamhossz()+4))));
                     System.out.print(masolat.get(i).getSzamhossz());
                     for(int j = 0; j <= 4 ;j++){
                         System.out.print(" ");
                     }
                     System.out.print("--- (LEJATSZVA)");
                     System.out.println();
            }
        }
        }catch(IOException ex){

        }

}

    public void listOfStyles(){

    System.out.println("A számok stílusainak listázása: ");
    
    Comparator<Spotify> byStyle= new Comparator<Spotify>(){
        @Override
        public int compare(Spotify sp1, Spotify sp2){
            return sp1.getStilus().compareTo(sp2.getStilus());
        }
    };
    
    Collections.sort(sp, byStyle);
    
    for(int i = 0;i<sp.size();i++){
        if(i < (sp.size() - 1)){
            if(!(sp.get(i).getStilus().equals(sp.get(i+1).getStilus()))){
                System.out.println(sp.get(i).getStilus());
            }
        }
        if(i == sp.size()){
            if(!(sp.get(i).getStilus().equals(sp.get(i-1).getStilus()))){
                System.out.println(sp.get(i).getStilus());
            }
        }
        
    }
}

    public void createPlayList() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Spotify> copySp = new ArrayList<>();

            try{

                System.out.print("\nKérem adja meg a lejátszási lista nevét: ");
                String playListName = in.readLine();
                String fajlnev = playListName + ".txt";
                File f = new File(fajlnev);
                FileWriter fr = new FileWriter(f, false);
                System.out.println(playListName + " nevű lejatszasi lista létrehozva.");

                boolean finished = false;
                while(!finished){
                    System.out.print("\nKérem adja meg a  zeneszám címét: ");
                    String condition = in.readLine();
                    boolean talalt = false;
                    for(Spotify s : sp){
                        if((s.getSzamcime().equals(condition))){
                            talalt = true;
                            System.out.println("Sikeresen hozzafuzve!");
                            copySp.add(s);
                            fr.write(s.getSzamcime() + ";" + s.getEloado() + ";" + s.getStilus() + ";" + s.getSzamhossz() +  ";" + s.getAlbum() + "\n");
                        }
                    }

                    if(!talalt)
                        System.out.println("A megadott szam nem letezik!");

                    System.out.print("Kívánja még folytatni? (igen/nem): ");
                    Scanner ans = new Scanner(System.in);
                    String valasz = ans.next();

                    if(valasz.equals("nem")){
                        int oszlop1 = 0, oszlop2 = 0, oszlop3 = 0, oszlop4 = 0, oszlop5 = 0;





                        for(int i= 0 ;i < copySp.size();i++){
                            if(copySp.get(i).getSzamcime().length() > oszlop1){
                                oszlop1 = copySp.get(i).getSzamcime().length();
                            }
                        }

                        for(int i= 0 ;i < copySp.size(); i++){
                            if(copySp.get(i).getEloado().length() > oszlop2){
                                oszlop2 = copySp.get(i).getEloado().length();
                            }
                        }

                        for(int i= 0 ;i < copySp.size() ;i++){
                            if(copySp.get(i).getStilus().length() > oszlop3){
                                oszlop3 = copySp.get(i).getStilus().length();
                            }
                        }


                        for(int i= 0 ;i < copySp.size();i++){
                            if(copySp.get(i).getAlbum().length() > oszlop4){
                                oszlop4= copySp.get(i).getAlbum().length();
                            }
                        }

                        for(int i= 0 ;i < copySp.size();i++){
                            if(copySp.get(i).getSzamhossz() > oszlop5){
                                oszlop5 = copySp.get(i).getSzamhossz();
                            }
                        }

                        int szokoz;
                        for(int i=0;i<copySp.size();i++){
                            //1.oszlop
                            szokoz = (((oszlop1 - copySp.get(i).getSzamcime().length()+4)));
                            System.out.print(copySp.get(i).getSzamcime());
                            for(int j = 0; j <= szokoz ;j++){
                                System.out.print(" ");
                            }
                            //2.oszlop
                            szokoz = (((oszlop2 - copySp.get(i).getEloado().length()+4)));
                            System.out.print(copySp.get(i).getEloado());
                            for(int j = 0; j <= szokoz ;j++){
                                System.out.print(" ");
                            }
                            //3.oszlop
                            szokoz = (((oszlop3 - copySp.get(i).getStilus().length()+4)));
                            System.out.print(copySp.get(i).getStilus());
                            for(int j = 0; j <= szokoz ;j++){
                                System.out.print(" ");
                            }
                            //4.oszlop
                            szokoz = (((oszlop4 - copySp.get(i).getAlbum().length()+4)));
                            System.out.print(copySp.get(i).getAlbum());
                            for(int j = 0; j <= szokoz ;j++){
                                System.out.print(" ");
                            }
                            //5.oszlop
                            szokoz = (((oszlop5 - (copySp.get(i).getSzamhossz()+4))));
                            System.out.print(copySp.get(i).getSzamhossz());
                            for(int j = 0; j <= 4 ;j++){
                                System.out.print(" ");
                            }
                            System.out.print("--- (LEJATSZVA)");
                            System.out.println();


                            finished = true;
                        }

                    }
                }
                fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
}


}   
