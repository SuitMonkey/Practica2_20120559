
/**
* Created by Francis Cáceres on 30/5/2016.
        */
public class Estudiante {

    private int matricula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String carrera;

    public Estudiante(){

    }

    public Estudiante(int matricula, String nombre, String apellido, String telefono, String carrera) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.carrera = carrera;
    }

    public int getMatricula() {
        return matricula;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}

