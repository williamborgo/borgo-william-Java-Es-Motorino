public class MotorinoImmatricolato extends Motorino {
    private double maxVelocità;
    private String targa;

    // Costruttore
    public MotorinoImmatricolato(String colore, String tipo, double velocità, double maxVelocità, String targa) {
        super(colore, tipo, velocità);
        this.maxVelocità = maxVelocità;
        this.targa = targa;
    }


    public double getMax() {
        return maxVelocità;
    }


    @Override
    public void accelera(double incremento) {
        if (!antifurto) {
            double nuovaVelocità = getVelocità() + incremento;
            if (nuovaVelocità < maxVelocità) {
                super.accelera(incremento); 
                
            } else {
                super.accelera(maxVelocità - getVelocità()); 



                
            }
        }
    }
}
