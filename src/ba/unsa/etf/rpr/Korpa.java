package ba.unsa.etf.rpr;

public class Korpa {

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
