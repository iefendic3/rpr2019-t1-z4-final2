package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        Artikl[] niz = new Artikl[50];

        Artikl a= new Artikl("banana", 1, "1");
        niz[0]=a;
        k.dodajArtikl(a);
        assertArrayEquals(niz,k.getArtikli());


    }

    @Test
    void getArtikli() {
      Korpa k=new Korpa();
      Artikl[] niz = new Artikl[50];
      assertArrayEquals(niz, k.getArtikli());

    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("racunar", 1000, "6");
        k.dodajArtikl(a);
        Artikl s = k.izbaciArtiklSaKodom("6");
        assertEquals(a, s);

    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("biciklo", 100, "4");
        Artikl b = new Artikl("blabla", 200, "4");
        k.dodajArtikl(a); k.dodajArtikl(b);

        assertEquals(300, k.dajUkupnuCijenuArtikala());

    }
}