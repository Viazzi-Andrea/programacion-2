package uno;

public class SumaHastaAleatorio {

**public** **static** **void** main(String\[\] args) {

    // <u>Generar</u> <u>un</u> <u>numero</u> <u>entero</u> <u>aleatorio</u> <u>entre</u> 1 y 20 (<u>ambos</u> <u>incluidos</u>)

    **int** m = (**int**) (Math.*random*() \* 20) + 1;

    // <u>Mostrar</u> el <u>numero</u> <u>generado</u>

    System.***out***.println("Numero generado (m): " + m);

    // <u>Calcular</u> <u>la</u> <u>suma</u> <u>de</u> <u>todos</u> <u>los</u> <u>enteros</u> <u>entre</u> 1 y m <u>usando</u> <u>una</u> <u>estructura</u> <u>repetitiva</u>

    **int** suma = 0;

    **for** (**int** i = 1; i &lt;= m; i++) {

        suma = suma + i;

    }

    // <u>Mostrar</u> el <u>resultado</u>

    System.***out***.println("La suma de todos los numeros entre 1 y " + m + " es: " + suma);

}

}
