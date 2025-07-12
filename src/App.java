import controllers.Ejercicios;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: JNelson Villalta"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.runHashMap();
        mapa.runLinkedHashMpa();
        mapa.runTreeMap();
        mapa.runHashMapObj();
        mapa.runTreeMapObj();
    }

    private static void runEjerccios() {
    Ejercicios ejercicios = new Ejercicios();

    System.out.println("\n--- Anagramas ---");
    System.out.println("listen vs silent: " + Ejercicios.areAnagrams("listen", "silent")); 
    System.out.println("hello vs bello: " + Ejercicios.areAnagrams("hello", "bello"));     
    System.out.println("triangle vs integral: " + Ejercicios.areAnagrams("triangle", "integral")); 

    System.out.println("\n--- Sumatoria de Dos ---");
    int[] resultado1 = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
    if (resultado1 != null)
        System.out.println("Índices para 5: [" + resultado1[0] + ", " + resultado1[1] + "]");
    else
        System.out.println("No hay combinación para 5");

    int[] resultado2 = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 10);
    if (resultado2 != null)
        System.out.println("Índices para 10: [" + resultado2[0] + ", " + resultado2[1] + "]");
    else
        System.out.println("No hay combinación para 10");

    System.out.println("\n--- Contar Caracteres ---");
    ejercicios.contarCaracteres("hola"); 

    // Prueba de sonAnagramas
    System.out.println("\n--- sonAnagramas ---");
    System.out.println("roma vs amor: " + ejercicios.sonAnagramas("roma", "amor")); 
    System.out.println("roma vs ramo: " + ejercicios.sonAnagramas("roma", "ramo")); 
}

    
}
