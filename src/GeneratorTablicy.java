import java.util.Random;public class GeneratorTablicy {
    public static int[] generujLosowe (int rozmiar, int max)
    {        Random r = new Random();
        int[] tablica = new int[rozmiar];
        for(int i =0;i < rozmiar;i++){
            tablica[i] = r.nextInt(max)+1;
        }        return  tablica;    }
    public static int[] generujPosortowane (int rozmiar)    {
        int[] tablica = new int[rozmiar];
        for(int i =0;i < rozmiar;i++){            tablica[i] = i+1;
        }        return  tablica;}    public static int[] generujPosortowaneOdwrotnie (int rozmiar)
    {        int[] tablica = new int[rozmiar];        for(int i =0;i < rozmiar;i++){
        tablica[i] = rozmiar-i;
    }        return  tablica;    }}