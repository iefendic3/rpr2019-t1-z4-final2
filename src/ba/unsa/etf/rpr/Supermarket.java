package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] niz ;
    private int broj;
    private int max;

    public Supermarket(){
        niz = new Artikl[1000];
        broj=0;
        max=1000;
    }
    public void dodajArtikl(Artikl biciklo) {
        if(broj==max) return;
        else{
            niz[broj]=biciklo;
            broj++;
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
}
