package etf.unsa.ba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    private Predmet p = new Predmet("RPR", 17, 5);

    @Test
    void geteri() {
        assertEquals("RPR", p.getNazivPredmeta());
        assertEquals(17, p.getSifraPredmeta());
        assertEquals(5, p.getMaxBrojStudenata());
    }

    @Test
    void seteri() {
        p.setNazivPredmeta("ASP");
        assertEquals("ASP", p.getNazivPredmeta());
        p.setSifraPredmeta(13);
        assertEquals(13, p.getSifraPredmeta());
    }

    @Test
    void ispisiStudenta() {
        Student s1 = new Student("Hasim", "Begovic", 17172);
        Student s2 = new Student("Boban", "Bajramovic", 12321);
        p.upisi(s1); p.upisi(s2);
        p.ispisi(s1);
        assertEquals("Hasim Begovic (17172)", s1.toString());
    }

    @Test
    void ispisiDrugiPut() {
        Student s = new Student("Rovan", "Nedovic", 12131);
        try {
            p.ispisi(s);
        }
        catch(IllegalArgumentException w) {
            assertEquals("Nema studenta na predmetu!", w.getMessage());
        }
    }

    @Test
    void istiStudent() {
        Student s1 = new Student("Hasim", "Taci", 12311);
        p.upisi(s1);
        try {
            p.upisi(s1);
        }
        catch(IllegalArgumentException w) {
            assertEquals("Isti student!", w.getMessage());
        }
    }

}