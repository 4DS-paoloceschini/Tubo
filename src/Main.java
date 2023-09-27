public class Main {
    public static void main(String[] args) {
        float altezza = 5.3f;
        int raggio = 2;

        Tubo t  = new Tubo(altezza, raggio);

        System.out.println("Superficie: "+t.superficieCilindro());
        System.out.println("Volume: "+t.volumeCilindro());
    }
}