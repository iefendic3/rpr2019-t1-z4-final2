package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void Artikl(){

    }

    @Test
    void getNaziv() {
        Artikl a = new Artikl("biciklo", 1000, "1");

        assertEquals("biciklo", a.getNaziv());
    }

    @Test
    void setNaziv() {
        Artikl a = new Artikl("biciklo", 1200, "3");
        a.setNaziv("biciklo");
        assertEquals("biciklo", a.getNaziv());
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("biciklo", 1000, "1");
        assertEquals("1", a.getKod());
    }

    @Test
    void setKod() {
        Artikl a = new Artikl("biciklo", 1200, "3");
        a.setKod("2");
        assertEquals("2", a.getKod());
    }

    @Test
    void getCijena() {
        Artikl a = new Artikl("biciklo", 1200, "3");
        assertEquals(1200, a.getCijena());
    }

    @Test
    void setCijena() {
        Artikl a = new Artikl("biciklo", 1200, "3");
        a.setCijena(1300);
        assertEquals(1300, a.getCijena());
    }
}