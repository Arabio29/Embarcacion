class Embarcacion {
    Capitan capitan;
    double precioBase;
    double valorAdicional;
    int añoFabricacion;
    double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int añoFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.añoFabricacion = añoFabricacion;
        this.eslora = eslora;
    }

    public double calcularMontoAlquiler() {
        double montoAlquiler = precioBase;
        if (añoFabricacion > 2020) {
            montoAlquiler += 20000;
        }
        return montoAlquiler;
    }
}