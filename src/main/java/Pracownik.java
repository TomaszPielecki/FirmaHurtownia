public class Pracownik implements Interface{
    int ID;
    String Imie;
    String Nazwisko;
    String Stanowisko;

    public Pracownik(int ID, String Imie, String Nazwisko, String Stanowisko){
        this.ID=ID;
        this.Imie=Imie;
        this.Nazwisko=Nazwisko;
        this.Stanowisko=Stanowisko;

    }
    public String toString() {
        return "Pracownik " +
                "ID=" + ID + ", 'Imie='" + Imie +
                ", 'Nazwisko='" + Nazwisko+
                ", 'Stanowisko='" + Stanowisko;
    }

    public void poczatekPracy() {
        System.out.println("poczatek pracy");
    }
    public void Konczy() {
        System.out.println("Koniec pracy");
    }
}

