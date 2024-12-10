public class Main {    public static void main(String[] args) {
    int[] tab = GeneratorTablicy.generujPosortowaneOdwrotnie(50000);
    int[] kopia = new int[50000];


    Czasomierz c1 = new Czasomierz();
    Sortowania.sortujBabelkowo(kopia);



    System.out.println(c1.obliczCzasTrwania());
    Czasomierz c2 = new Czasomierz();
    Sortowania.sortujBabelkowoZOgraniczonaLiczbePrzebiegow(kopia);
    System.out.println(c2.obliczCzasTrwania());





    Czasomierz c3 = new Czasomierz();
    Sortowania.sortujPrzezWybor(kopia);
    System.out.println(c3.obliczCzasTrwania());
    Czasomierz c4 = new Czasomierz();
    Sortowania.sortujPrzezWstawianie(kopia);
    System.out.println(c4.obliczCzasTrwania());    }}


