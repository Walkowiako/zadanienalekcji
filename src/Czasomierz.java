public class Czasomierz {
    private long start;

    public Czasomierz(){
        this.start=System.nanoTime();
    }
    public long obliczCzasTrwania(){
        return System.nanoTime()-start;
    }
}