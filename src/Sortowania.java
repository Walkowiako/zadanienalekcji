public class Sortowania {
    public static void sortujBabelkowo(int[] tab) {
        int n = tab.length;
        for (int i=0; i < n - 1; i++) {
            for (int j=0; j< n - 1-i; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }
    public static void sortujBabelkowoZOgraniczonaLiczbePrzebiegow(int[] tab) {
        int n = tab.length;
        for (int i=0; i < n - 1; i++) {
            boolean zamiana=false;
            for (int j=0; j< n - 1-i; j++) {
                if (tab[j] > tab[j + 1]) {
                    zamiana=true;
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }            if(zamiana==false){
                break;
            }
        }

    }    public static void sortujPrzezWybor(int[]tab) {
        int n = tab.length;
        for (int i= 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j <n; j++) {
                if (tab[j] < tab[minIndex]) {
                    minIndex = j;
                }            }
            int temp = tab[i];
            tab[i] = tab[minIndex];
            tab[minIndex] = temp;
        }
    }    public static void sortujPrzezWstawianie(int[] tab){
        int n = tab.length;
        for(int i=1; i<n;i++){
            int temp = tab[i];
            int j=i-1;
            while(j>=0 && tab[j]>temp){
                tab[j+1]=tab[j];
                j--;
            }
            tab[j+1] = temp;        }    }}
