package uno;

import java.util.Scanner;

public class DistribucionEquipos {

**public** **static** **void** main(String\[\] args) {

    Scanner entrada = **new** Scanner([System.***in***](http://System.in));

    // 1. Leer y <u>almacenar</u> <u>los</u> <u>valores</u>

    System.***out***.print("Ingrese la cantidad total de estudiantes: ");

    **int** totalEstudiantes = entrada.nextInt();

    System.***out***.print("Ingrese la cantidad de estudiantes por equipo: ");

    **int** estudiantesPorEquipo = entrada.nextInt();

    // <u>Validacion</u> <u>basica</u> <u>para</u> <u>evitar</u> division <u>por</u> <u>cero</u>

    **if** (estudiantesPorEquipo &lt;= 0) {

        System.***out***.println("\\nError: la cantidad de estudiantes por equipo debe ser mayor que cero.");

        entrada.close();

        **return**;

    }

    // 3. y 4. <u>Calculos</u>

    **int** equiposCompletos = totalEstudiantes / estudiantesPorEquipo;

    **int** estudiantesRestantes = totalEstudiantes % estudiantesPorEquipo;

    // 2. y 5. <u>Mostrar</u> <u>valores</u> <u>ingresados</u> y <u>resultados</u>

    System.***out***.println();

    System.***out***.println("Cantidad total de estudiantes: " + totalEstudiantes);

    System.***out***.println("Estudiantes por equipo: " + estudiantesPorEquipo);

    System.***out***.println("Se pueden formar " + equiposCompletos + " equipos completos.");

    System.***out***.println("Quedan " + estudiantesRestantes + " estudiantes sin integrar un equipo completo.");

    entrada.close();

}

}
