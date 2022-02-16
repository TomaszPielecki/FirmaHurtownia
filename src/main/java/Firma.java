public class Firma extends Pracownik implements Interface {
    int NIP;
    String nazwaFirmy;
    String Miasto;
    String Adress;

    Firma(int NIP, String nazwaFirmy, String Miasto, String Adress, int ID, String Imie, String Nazwisko, String Stanowisko) {
        super( ID, Imie, Nazwisko, Stanowisko);
        this.NIP = NIP;
        this.nazwaFirmy = nazwaFirmy;
        this.Miasto = Miasto;
        this.Adress = Adress;
    }
    public String toString() {
        return "Firma" +
                "NIP=" + NIP +
                ", nazwaFirmy='" + nazwaFirmy + '\'' +
                ", Miasto='" + Miasto + '\'' +
                ", Adress='" + Adress ;
    }
}




