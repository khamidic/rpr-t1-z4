package etf.unsa.ba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student s = new Student("Rambo", "Amadeus", 17178);

    @Test
    void geteri() {
        assertEquals("Rambo", s.getIme());
        assertEquals("Amadeus", s.getPrezime());
        assertEquals(17178, s.getBrojIndeksa());
    }

    @Test
    void seteri() {
        s.setIme("Hasim");
        assertEquals("Hasim", s.getIme());
        s.setPrezime("Brkan");
        assertEquals("Brkan", s.getPrezime());
        s.setBrojIndeksa(11921);
        assertEquals(11921, s.getBrojIndeksa());
    }

    @Test
    void tostringic() {
        assertEquals("Rambo Amadeus (17178)", s.toString());
    }

    @Test
    void testiranjejednakosti() {
        Student k = new Student("Hajra", "Rajlovic", 12912);
        assertEquals(false ,s.equals(k));
    }
}