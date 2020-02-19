
package pruebacomint;


public class AgenciaMain {
    public static void main(String[] args) {
        Agencia a1= new Agencia(4);
        Persona p1=new Persona("123456g", "jose", "marin moreno", 18, 'V');
        Persona p2=new Persona("153236t", "Ana", "nuñez raudales", 30, 'M');
        Persona p3=new Persona("176312s", "Manuel", "caudillo rubio", 69, 'V');
        Persona p4=new Persona("178989d", "Lola", "Fermin moreno", 6, 'M');
        
        a1.addpersona(p1);
        a1.addpersona(p2);
        a1.addpersona(p3);
        a1.addpersona(p4);
        a1.addpersona(p2);
 
        a1.mostrar();
        System.out.println("--------");
        a1.deletePersona(p3);
        a1.mostrar();
        System.out.println("--------");
        System.out.println("buscando el eleminado");
        System.out.println(a1.searchPersona(p3));
        System.out.println("--------");
        System.out.println("buscando uno existente");
        System.out.println(a1.searchPersona(p2));
        
        }
}
