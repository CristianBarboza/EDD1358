/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.modelo;

/**
 *
 * @author CBR19
 */
public class Empleado {
    private int id;
    private String Nombre;
    private String Paterno;
    private String materno;
    private float sueldoBase;
    private int AnioIngreso;
    private int horasExtras;

    public Empleado() {
    }

    public Empleado(int id, String Nombre, String Paterno, String materno, float sueldoBase, int AnioIngreso, int horasExtras) {
        this.id = id;
        this.Nombre = Nombre;
        this.Paterno = Paterno;
        this.materno = materno;
        this.sueldoBase = sueldoBase;
        this.AnioIngreso = AnioIngreso;
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPaterno() {
        return Paterno;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAnioIngreso() {
        return AnioIngreso;
    }

    public void setAnioIngreso(int AnioIngreso) {
        this.AnioIngreso = AnioIngreso;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + "\n Nombre=" + Nombre + "\n Paterno=" + Paterno + "\n materno=" + materno + "\n sueldoBase=" + sueldoBase + "\n AnioIngreso=" + AnioIngreso + "\n horasExtras=" + horasExtras + "}\n";
    }
    
}
