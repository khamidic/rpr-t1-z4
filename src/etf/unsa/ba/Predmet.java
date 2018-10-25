package etf.unsa.ba;

public class Predmet {
    private Student[] studenti;
    private String nazivPredmeta;
    private int sifraPredmeta;
    private final int maxBrojStudenata;

    Predmet(String nazivPredmeta, int sifraPredmeta, int maxBrojStudenata) {
        this.nazivPredmeta = nazivPredmeta;
        this.sifraPredmeta = sifraPredmeta;
        studenti = new Student[maxBrojStudenata];
        this.maxBrojStudenata = maxBrojStudenata;
    }
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public int getSifraPredmeta() {
        return sifraPredmeta;
    }
    public int getMaxBrojStudenata() {
        return maxBrojStudenata;
    }
    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }
    public void setSifraPredmeta(int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }

    public void ispisi(Student s) {
        boolean ispisan = false;
        for(int i = 0; i < getMaxBrojStudenata(); i++) {
            if(s.equals(studenti[i])) {
                studenti[i] = null;
                ispisan = true;
                break;
            }
        }
    }

    public void upisi(Student s) {
        for(int i = 0; i < getMaxBrojStudenata(); i++) {
            if (s.equals(studenti[i])) throw new IllegalArgumentException("Isti student!");
            if (studenti[i] == null) {
                studenti[i] = s;
                break;
            }
        }
    }
    public void ispisi() {
        for(int i = 0; i < getMaxBrojStudenata(); i++) if(studenti[i] != null)  System.out.println(studenti[i]);
    }
}
