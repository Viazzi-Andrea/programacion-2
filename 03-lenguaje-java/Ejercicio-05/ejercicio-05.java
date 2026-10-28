package ejercicio;
public class CantidadVocales {
public static void main(String[] args) {
// 1. Almacenamiento del texto en una variable String
String texto = "PROGRAMACION JAVA";

// 2. Obtención de la cantidad total de caracteres
int totalCaracteres = texto.length();
int contadorVocales = 0;

// 3. Recorrido de la cadena mediante un bucle for
for (int i = 0; i < totalCaracteres; i++) {
char caracterActual = texto.charAt(i);

// 4. Identificación de vocales (considerando mayúsculas y minúsculas)
if (caracterActual == 'A' || caracterActual == 'E' || caracterActual == 'I' ||
caracterActual == 'O' || caracterActual == 'U' ||
caracterActual == 'a' || caracterActual == 'e' || caracterActual == 'i' ||
caracterActual == 'o' || caracterActual == 'u') {
contadorVocales++;
}
}

// 5. Presentación de resultados con el formato exacto requerido
System.out.println("Texto analizado: " + texto);
System.out.println("Cantidad de caracteres: " + totalCaracteres);
System.out.println("Cantidad de vocales: " + contadorVocales);
}
}
