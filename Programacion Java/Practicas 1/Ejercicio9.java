public class Ejercicio9 {
    private static void println(Object message) {
        System.out.println(message);
    }
    public static void main(String[] args) {
        byte edadJuan = 20;
        byte edadPedro = 42;

        short sueldoBase = 1980;
        short complementos = 400;

        final int SUELDOS_BASE_COMPLEMENTOS = sueldoBase + complementos;
        // Sueldo Juan
        
        final int SUELDO_JUAN = SUELDOS_BASE_COMPLEMENTOS + 25 + 60 + 100;
        final int SUELDO_JUAN_IRPF = SUELDO_JUAN * 15 / 100;
        final int SUELDO_JUAN_SEGSOC = SUELDO_JUAN * 9 / 100;
        final int SUELDO_JUAN_FINAL = SUELDO_JUAN + SUELDO_JUAN_IRPF - SUELDO_JUAN_SEGSOC;

        println("El sueldo real del empleado de " + edadJuan + " años es: " + SUELDO_JUAN_FINAL);

        final int SUELDO_PEDRO = SUELDOS_BASE_COMPLEMENTOS + 100;
        final int SUELDO_PEDRO_IRPF = SUELDO_PEDRO * 15 / 100;
        final int SUELDO_PEDRO_SEGSOC = SUELDO_PEDRO * 9 / 100;
        final int SUELDO_PEDRO_FINAL = SUELDO_PEDRO + SUELDO_PEDRO_IRPF - SUELDO_PEDRO_SEGSOC;

        println("El sueldo real del empleado de " + edadPedro + " años es: " + SUELDO_PEDRO_FINAL);

    }
}