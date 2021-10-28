package ba.unsa.etf.rpr;

import java.util.Arrays;

public class Korpa {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Korpa korpa = (Korpa) o;

        if (broj != korpa.broj) return false;
        if (max != korpa.max) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(niz, korpa.niz);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(niz);
        result = 31 * result + broj;
        result = 31 * result + max;
        return result;
    }

    private Artikl[] niz;
    private int broj;
    private int max;

    public Korpa(){
        niz = new Artikl[50];
        broj=0;
        max=50;
    }
    public boolean dodajArtikl(Artikl a) {
        if(broj==max) return false;
        else{
            niz[broj]=a;
            broj++;
            return true;
        }

    }

    public Artikl[] getArtikli() {

        return niz;

    }

    public Artikl izbaciArtiklSaKodom(String kod) {

        Artikl a = new Artikl();
        for(int i=0; i<broj;i++){
            if(niz[i].getKod().equalsIgnoreCase(kod)){
                a=niz[i];
                for(int j=i;j<broj-1;j++){
                    niz[j]=niz[j+1];
                }
            }
        }
        broj--;
        return a;
    }

    public int dajUkupnuCijenuArtikala() {

        int cijena=0;
        for(int i=0;i<broj;i++){
            cijena+=niz[i].getCijena();
        }
        return cijena;
    }
}
