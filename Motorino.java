public class Motorino {
    private String colore;
    private double velocità;
    private String tipo;
    public boolean antifurto;

    // Costruttore
    public Motorino(String colore, String tipo, double velocità) {
        this.colore = colore;
        this.tipo = tipo;
        this.velocità = velocità;
        this.antifurto = false; // inizialmente l'antifurto è disattivato
    }

    // Metodo per ottenere la velocità attuale
    public double getVelocità() {
        return velocità;
    }

    // Metodo per accelerare il motorino
    public void accelera(double incremento) {
        if (!antifurto) {
            this.velocità += incremento;
        }
    }

    // Metodo per attivare l'antifurto
    public void inserisciAntifurto() {
        this.antifurto = true;
    }
}
