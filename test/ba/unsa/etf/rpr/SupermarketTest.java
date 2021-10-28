package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        Artikl[] niz = new Artikl[1000];
        Artikl a = new Artikl("cokolada", 2, "10");
        niz[0]=a;
        s.dodajArtikl(a);
        assertArrayEquals(niz, s.getArtikli());
    }

    @Test
    void getArtikli() {
        Supermarket s = new Supermarket();
        Artikl[] niz = new Artikl[1000];
        assertArrayEquals(niz, s.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("kolac", 3, "5");
        Artikl c = new Artikl("abab", 3, "2");
        s.dodajArtikl(a);
        Artikl b = s.izbaciArtiklSaKodom("5");
        assertEquals(a, b);
    }
}