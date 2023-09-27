public class Tubo {
    private float altezza;
    private int raggio;
    private double pGreco;

    public Tubo(float altezza, int raggio){
        this.altezza=altezza;
        this.raggio=raggio;
        pGreco=3.14;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public void setRaggio(int raggio) {
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

    public double volumeCilindro(){
        double volume = pGreco*(raggio^2)*altezza;

        return volume;
    }

    public double superficieCilindro(){
        return 2*pGreco*raggio*altezza;
    }
}
