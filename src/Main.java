public class Main {
    public static void main(String[] args) {
        Modulo[] modulos = new Modulo[5];
        modulos[0] = new Modulo("Autenticacion", "Java", 100, true);
        modulos[1] = new Modulo("Inventario", "Java", 75, false);
        modulos[2] = new Modulo("Pagos", "Python", 60, false);
        modulos[3] = new Modulo("Reportes", "Java", 100, true);
        modulos[4] = new Modulo("Notificaciones", "Java", 40, false);
        AnalizadorProyecto analizador = new AnalizadorProyecto(modulos);
        System.out.println("MODULOS DEL PROYECTO");
        System.out.println(analizador.listarModulos());
        System.out.println("Modulos terminados: " + analizador.contarTerminados());
        System.out.printf("Progreso promedio: %.2f%%%n", +analizador.calcularProgresoPromedio());
        System.out.println("\nBUSQUEDA DE MODULO ");
        Modulo encontrado = analizador.buscarModulo("Autenticacion");
        if (encontrado != null) {
            System.out.println("Modulo encontrado:");
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Modulo no encontrado");
        }
        Modulo inexistente = analizador.buscarModulo("Base de datos");
        if (inexistente != null) {
            System.out.println(inexistente.mostrarInformacion());
        } else {
            System.out.println("El modulo Base de datos no existe");
        }
        System.out.println("\nMENOR PROGRESO");
        Modulo menor = analizador.obtenerMenorProgreso();
        if (menor != null) {
            System.out.println(menor.mostrarInformacion());
        } else {
            System.out.println("No existen modulos registrados.");
        }
    }
}