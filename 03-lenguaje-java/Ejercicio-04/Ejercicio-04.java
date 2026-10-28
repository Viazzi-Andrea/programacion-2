package ejercicio;
import java.util.Random;

public class DiaDeLaSemana {
public static void main(String[] args) {
// Generación del número aleatorio entre 1 y 7
Random random = new Random();
int numeroGenerado = random.nextInt(7) + 1;

String diaSemana;

// Estructura switch con casos únicos (1 a 7) y sus respectivos break
switch (numeroGenerado) {
case 1:
diaSemana = "lunes";
break;
case 2:
diaSemana = "martes";
break;
case 3:
diaSemana = "miércoles";
break;
case 4:
diaSemana = "jueves";
break;
case 5:
diaSemana = "viernes";
break;
case 6:
diaSemana = "sábado";
break;
case 7:
diaSemana = "domingo";
break;
default:
diaSemana = "Número inválido";
break;
}

// Salida formateada
System.out.println("Número generado: " + numeroGenerado);
System.out.println("Día correspondiente: " + diaSemana);
}
}
