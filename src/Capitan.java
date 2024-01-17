class Capitan {
    String nombre;
    String apellido;
    String matriculaNavegacion;

    public Capitan(String nombre, String apellido, String matriculaNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
    }

    public void comprarYate() {
        System.out.println("Yate comprado");
    }
}