class Velero extends Embarcacion {
    int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int añoFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, añoFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean esGrande() {
        return cantidadMastiles > 4;
    }
}