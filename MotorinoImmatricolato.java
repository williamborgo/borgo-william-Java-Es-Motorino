public class MotorinoImmatricolato extends Motorino {
    private double maxVelocità;
    private String targa;

    // Costruttore
    public MotorinoImmatricolato(String colore, String tipo, double velocità, double maxVelocità, String targa) {
        super(colore, tipo, velocità);
        this.maxVelocità = maxVelocità;
        this.targa = targa;
    }

    // Metodo per ottenere la velocità massima
    public double getMax() {
        return maxVelocità;
    }

    // Ridefinizione del metodo accelera
    @Override
    public void accelera(double incremento) {
        if (!antifurto) {
            double nuovaVelocità = getVelocità() + incremento;
            if (nuovaVelocità < maxVelocità) {
                super.accelera(incremento); // usa il metodo della classe base
            } else {
                super.accelera(maxVelocità - getVelocità()); // limita alla velocità massima
            }
        }
    }
}
