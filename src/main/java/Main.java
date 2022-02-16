public class Main {
    public static void main(String[] args) {

        Pracownik Magazynier=new Pracownik(1,"Tomasz","Pielecki","Magazynier-Chłodnia");
        Firma Agawa=new Firma(23445553,"AGawa","Kartuzy","Kartuzy 83-300",3,"Tomasz","Pielecki","Magazynier-Chłodnia");

        Magazynier.poczatekPracy();
        System.out.println(Magazynier);
        System.out.println(Agawa);
        Magazynier.Konczy();
    }
}
