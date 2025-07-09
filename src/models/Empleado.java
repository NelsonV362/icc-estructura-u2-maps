package models;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }

    @Override
    public int compareTo(Empleado emp) {
        int comparacionId = Integer.compare(this.id, emp.id);
        if (comparacionId != 0) {
            return comparacionId;
        }
        // Como son iguales los IDs, comparemos el nombre
        return this.name.compareTo(emp.getName());
    }
}
