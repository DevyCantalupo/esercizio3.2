public class esercizio3di2 {
    public static int lunghezzaDiString(String a){
        int x = a.length();
        return x;
    };
    public static void main(String[] args) {
        int risultato = lunghezzaDiString("blablablablabla");
        System.out.println("risultato = " + risultato);
    }
}
