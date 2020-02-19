package pruebacomint;

public class Persona implements Comparable<Persona>{

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private char sexo;

    private Persona() {
    }

    public Persona(String dni, String nombre, String apellidos, int edad, char sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String dni, String nombre, String apellidos) {
        this(dni, nombre, apellidos, 0, 'V');
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo + '}';
    }

    @Override
    public boolean equals(Object obj) {
        boolean igual = false;
        if (obj != null) {
            if (this == obj) {
                igual = true;
            } else if (obj instanceof Persona) {
                Persona other = (Persona) obj;
                igual=this.nombre.toUpperCase().equals
                (other.nombre.toUpperCase()) && 
                        this.apellidos.toUpperCase().equals
                (other.apellidos.toUpperCase());
            }

        }
        return igual;
    }

    @Override
    public int compareTo(Persona o) {
        int result=0;
        result=this.nombre.toUpperCase().compareTo(o.nombre.toUpperCase());
        if(result==0){
          result=this.apellidos.toUpperCase().compareTo(o.apellidos.toUpperCase());
        }
        if(result==0){
            result=this.dni.toUpperCase().compareTo(o.dni.toUpperCase());
        }
        return result;
    }

}
