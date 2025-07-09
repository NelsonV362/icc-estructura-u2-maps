package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap() {
    Map<String, String> mapa = new HashMap<>();
    mapa.put("001", "Celular");
    mapa.put("002", "Laptop");
    mapa.put("003", "Celular");
        mapa.put("003", "PC");


    System.out.println(mapa);

    System.out.println(mapa.keySet());

    for (String key : mapa.keySet()) {
        System.out.println("Clave: " + key + " - Valor: " + mapa.get(key));
    }
    System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));

}


    public void runLinkedHashMpa() {
    Map<Integer, String> mapa = new LinkedHashMap<>();

    mapa.put(1, "Carlos");
    mapa.put(2, "Ana");
    mapa.put(3, "Luis");
    mapa.put(4, "Sofía");
    mapa.put(5, "María");

    for (Integer clave : mapa.keySet()) {
        System.out.println("Valor: " + mapa.get(clave));
    }
}

    

    public void runTreeMap() {
        Map<Integer, String> items = new TreeMap();
        items.put(3, "carro");
    }

    public void runHashMapObj() {
    Map<Empleado, Integer> empleados = new HashMap<>();

    empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
    empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
    empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
    empleados.put(new Empleado(1, "Juan", "Dev"), 2500); 
    empleados.put(new Empleado(1, "Diego", "Dev"), 3000);

    for (Empleado emp : empleados.keySet()) {
        System.out.println(emp + " - Salario: " + empleados.get(emp));
    }
}

public void runTreeMapObj() {
    Map<Empleado, Integer> empleados = new TreeMap<>();
    System.out.println();
    System.out.println("runTreeMapObj");
    empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
    empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
    empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
    empleados.put(new Empleado(1, "Juan", "Dev"), 1200);  
    empleados.put(new Empleado(1, "Diego", "Dev"), 3000); 

    for (Map.Entry<Empleado, Integer> entry : empleados.entrySet()) {
        System.out.println(entry.getKey() + " - Salario: " + entry.getValue());
    }
}



}
