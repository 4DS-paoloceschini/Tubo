public class Main {
    public static void main(String[] args) {
        float altezza = 5.3f;
        int raggio = 2;

        Tubo t  = new Tubo(altezza, raggio);

        System.out.println("Superficie: "+t.superficieCilindro());
        System.out.println("Volume: "+t.volumeCilindro());

        t.setAltezza(27.9f);
        t.setRaggio(9);
        System.out.println("Nuova altezza: "+t.getAltezza());
        System.out.println("Nuovo raggio: "+t.getRaggio());

        System.out.println("Superficie: "+t.superficieCilindro());
        System.out.println("Volume: "+t.volumeCilindro());
    }
}