package spotifyapp;

public class Spotify {
    private String szamCime;
    private String eloado;
    private String stilus;
    private int szamHossz; //in seconds
    private String album;
    
    
    
    //constructor
    public Spotify(String _szamcime, String _eloado, String _stilus, int _szamHossz, String _album){
        this.szamCime = _szamcime;
        this.eloado = _eloado;
        this.stilus = _stilus;
        this.szamHossz = _szamHossz;
        this.album = _album;
    }
    
    //getters and setters
    public String getSzamcime(){
        return this.szamCime;
    }
    public String getEloado()
    {
        return this.eloado;
    }
    public String getStilus(){
        return this.stilus;
    }
    public int getSzamhossz(){
        return this.szamHossz;
    }
    public String getAlbum(){
        return this.album;
    }
    
    public void setSzamcime(String value){
        this.szamCime = value;
    }
    public void setEloado(String value){
        this.eloado = value;
    }
    public void setStilus(String value){
        this.stilus = value;
    }
    public void setSzamhossz(int value){
        this.szamHossz = value;
    }
    public void setAlbum(String value){
        this.album = value;
    }
    
    
}
