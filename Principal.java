public class Principal {
    public static void main(String[] args) {
        // Crear un objeto Estudiante
        Estudiante estudiante = new Estudiante("Juan", 2000);

        // Establecer las notas de las materias
        estudiante.setNotaMateria1(8.5);
        estudiante.setNotaMateria2(7.0);
        estudiante.setNotaMateria3(9.2);

        // Obtener y mostrar la información del estudiante
        System.out.println("Nombre del estudiante: " + estudiante.getNombre());
        System.out.println("Año de nacimiento: " + estudiante.getanoNacimiento());

        // Calcular y mostrar la edad del estudiante
        int edad = estudiante.getEdad();
        System.out.println("Edad del estudiante: " + edad + " años");

        // Calcular y mostrar el promedio del estudiante
        double promedio = estudiante.getPromedio();
        System.out.println("Promedio del estudiante: " + promedio);
    }
}
