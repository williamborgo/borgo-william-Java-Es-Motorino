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
        this.antifurto = false; 
    }

    public double getVelocità() {
        return velocità;
    }

    public void accelera(double incremento) {
        if (!antifurto) {
            this.velocità += incremento;
        }
    }

    public void inserisciAntifurto() {
        this.antifurto = true;
    }
}
