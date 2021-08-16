package onlinebolt;

public class Termekek {
    private String termekneve;
    private int vetelar;
    private String kategoria;
    private int raktaridarabszam;
    
    public Termekek(String _termekneve, int _vetelar, String _kategoria, int _raktaridarabszam)
    {
        this.termekneve = _termekneve;
        this.vetelar = _vetelar;
        this.kategoria = _kategoria;
        this.raktaridarabszam = _raktaridarabszam;
    }
    
    public String getTermekNeve(){
        return this.termekneve;
    }
    public int getVetelar()
    {
        return this.vetelar;
    }
    public String getKategoria()
    {
        return this.kategoria;
    }
    public int getRaktariDarabszam()
    {
        return this.raktaridarabszam;
    }
    
    
    public void setTermekNeve(String _termekneve)
    {
        this.termekneve = _termekneve;
    }
    public void setVetelar(int _vetelar)
    {
        this.vetelar = _vetelar;
    }
    public void setKategoria(String _kategoria)
    {
        this.kategoria = _kategoria;
    }
    public void setRaktariDarabaszam(int _raktardb)
    {
        this.raktaridarabszam = _raktardb;
    }
}
