public class Estudiante {
    /*Atributos privados*/
    private final String nombre;
    private final int anoNacimiento;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;

    public Estudiante(String nombre, int anoNacimiento) {
        this.nombre = nombre;
        this.anoNacimiento = anoNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getanoNacimiento() {
        return anoNacimiento;
    }

    public int getEdad() {
        int anioActual = java.time.Year.now().getValue();
        return anioActual - anoNacimiento;
    }

    public double getPromedio() {
        return (notaMateria1 + notaMateria2 + notaMateria3) / 3.0;
    }

    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }

    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }
}
