public class Main {
    public static void main(String[] args) {

        Capitan capitan = new Capitan("Juan", "Perez", "ABC123");
        Velero velero = new Velero(capitan, 10000, 5000, 2022, 10.5, 5);
        Yate yate = new Yate(capitan, 20000, 10000, 2023, 15.0, 8);

        System.out.println("Monto de alquiler del velero: " + velero.calcularMontoAlquiler());
        System.out.println("Es grande el velero? " + velero.esGrande());

        System.out.println("Monto de alquiler del yate: " + yate.calcularMontoAlquiler());
        System.out.println("Es de lujo el yate? " + yate.esDeLujo());

        yate.comprarYate();
    }
}