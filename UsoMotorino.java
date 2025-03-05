public class UsoMotorino {
    public static void main(String[] args) {
        Motorino motorino1 = new Motorino("grigiometallizzato", "Piaggio Liberty", 40.5);
        double velocità1 = motorino1.getVelocità();
        System.out.println("Velocità iniziale motorino1: " + velocità1 + " Km/h");

        MotorinoImmatricolato motorino2 = new MotorinoImmatricolato("rosso", "Aprilia Scarabeo", 30.5, 60, "CV1234");
        double maxVelocità2 = motorino2.getMax();
        System.out.println("Velocità massima motorino2: " + maxVelocità2 + " Km/h");

        motorino1.accelera(30.7);
        motorino2.accelera(30.7);

        System.out.println("Velocità dopo accelerazione motorino1: " + motorino1.getVelocità() + " Km/h");
        System.out.println("Velocità dopo accelerazione motorino2: " + motorino2.getVelocità() + " Km/h");
    }
}
