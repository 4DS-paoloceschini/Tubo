public class Tubo {
    private float altezza, raggio;
    private double pGreco;

    public Tubo(float altezza, float raggio){
        this.altezza=altezza;
        this.raggio=raggio;
        pGreco=3.14;
    }

    public double getpGreco() {
        return pGreco;
    }

    public float getAltezza() {
        return altezza;
    }

    public float getRaggio() {
        return raggio;
    }
}
