public class Tubo {
    private float altezza, raggio;
    private double pGreco;

    public Tubo(float altezza, float raggio){
        this.altezza=altezza;
        this.raggio=raggio;
        pGreco=3.14;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public void setRaggio(float raggio) {
        this.raggio = raggio;
    }

    public void setpGreco(double pGreco) {
        this.pGreco = pGreco;
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
