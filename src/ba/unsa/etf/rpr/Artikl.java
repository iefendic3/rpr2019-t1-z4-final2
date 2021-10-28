package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv, kod;
    private int cijena;

    public Artikl(){
        this.naziv="";
        this.cijena=0;
        this.kod="";
    }
    public Artikl(String naziv, int cijena, String kod) {
        this.naziv = naziv;
        this.kod = kod;
        this.cijena = cijena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }
}
