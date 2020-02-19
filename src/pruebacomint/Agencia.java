package pruebacomint;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Agencia {

    private int codigoviaje;
    private ArrayList<Persona> listapersonas;
    private Instant fecha;

    public Agencia(int codigoviaje) {
        this.codigoviaje = codigoviaje;
        listapersonas = new ArrayList<>();
        fecha = Instant.now();
    }

    public boolean addpersona(Persona p) {
        boolean result = false;
        if (p != null) {
            if (!certificarpersona(p)) {
                listapersonas.add(p);
                result = true;
            }

        }
        return result;
    }

    private boolean certificarpersona(Persona p) {
        boolean existe = false;
        existe = listapersonas.contains(p);

        return existe;
    }

    public void deletePersona(Persona p) {
        if (p != null && certificarpersona(p)) {
            listapersonas.remove(p);
        }
    }

    public boolean searchPersona(Persona p) {
        boolean busqueda = false;
        if(p!=null){
           Iterator<Persona> it = listapersonas.iterator();
        while (it.hasNext() && !busqueda) {
            if(it.next().getDni().toUpperCase().equals(p.getDni().toUpperCase())){
               busqueda=true; 
            }
        } 
        }
        
        return busqueda;
    }

    public void mostrar() {
        Collections.sort(listapersonas);
        System.out.println(fecha);
        Iterator<Persona> it = listapersonas.iterator();
        while (it.hasNext()) {
            System.out.println( it.next());
        }
    }

}
