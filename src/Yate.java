class Yate extends Embarcacion {
    int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int añoFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, añoFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public boolean esDeLujo() {
        return cantidadCamarotes > 7;
    }

    public void comprarYate() {
        System.out.println("Yate comprado");
    }

}