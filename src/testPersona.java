import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by robert on 07/04/2016.
 */
public class testPersona {




    //static persona p=new persona();
    static ArrayList<persona>persona=new ArrayList();
    static ArrayList<docente>docente=new ArrayList();
    static ArrayList<administrativo>administrativo=new ArrayList();


    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;
        do {
            System.out.println("ejemplo de herencia simple");
            System.out.println("1- Alta alumno");
            System.out.println("2- Alta docente");
            System.out.println("3- Alta administrativa");
            System.out.println("4- Lista de alumnos");
            System.out.println("5- Lista de docentes");
            System.out.println("6- Lista de administrativos");
            System.out.println("7- salir");
            System.out.println(" selecciona una opcion");
            opcion = Integer.parseInt(leer.nextLine());
            switch (opcion){
                case 1: altaAlumno();
                    break;
                case 2: altaDocente();
                    break;
                case 3: altaAdministrativo();
                    break;
                case 4: Listaralumnos();
                    break;
                case 5: Listardocente();
                    break;
                case 6: Listaradministrativo();
                    break;

            }

        }while (opcion !=7);
    }


    public static void altaAlumno(){
        alumno studiante=new alumno();

        System.out.println("nombre: ");
        studiante.setNombre(leer.nextLine());

        System.out.println("domicilio: ");
        studiante.setDomicilio(leer.nextLine());

        System.out.println("ciudad: ");
        studiante.setCiudad(leer.nextLine());

        System.out.println("no. Control: ");
        studiante.setNumControl(Integer.parseInt(leer.nextLine()));

        System.out.println("carrera: ");
        studiante.setCarrera(leer.nextLine());

         persona.add(studiante);
    }

    public static void Listaralumnos(){

            for (persona p : persona) {
                if (p instanceof alumno) {
                    System.out.println("Nombre: " + p.getNombre() );
                    System.out.println("Domicilio: "+ p.getDomicilio() );
                    System.out.println("Ciudad: " + p.getCiudad());
                    System.out.println("no.Control: " + ((alumno) p).getNumControl());
                    System.out.println("Carrera: "+ ((alumno) p).getCarrera());
                }

            }
            System.out.println(persona.size());

    }


     public static void altaDocente(){
        docente Docente=new docente();

        System.out.println("nombre: ");
        Docente.setNombre(leer.nextLine());

        System.out.println("domicilio: ");
        Docente.setDomicilio(leer.nextLine());

        System.out.println("ciudad: ");
        Docente.setCiudad(leer.nextLine());

        System.out.println("No. de control: ");
        Docente.setnumControl(Integer.parseInt(leer.nextLine()));

        System.out.println("materia: ");
        Docente.setMateria(leer.nextLine());

        System.out.println("numero de seguro social: ");
        Docente.setnumSeguro(Integer.parseInt(leer.nextLine()));

        System.out.println("numero de RFC");
        Docente.setrfc(Integer.parseInt(leer.nextLine()));

        docente.add(Docente);


    }

    public static void Listardocente(){

        for(docente d : docente){

            if(d instanceof docente){

                System.out.println("nombre:"+d.getNombre());
                System.out.println("domicilio:" + d.getDomicilio());
                System.out.println("ciudad:" + d.getCiudad());
                System.out.println("numero de control:" + d.getnumControl());
                System.out.println("materia:"+d.getMateria());
                System.out.println("numero de seguro social:"+d.getnumSeguro());
                System.out.println("numero de rfc:"+d.getrfc());

            }



        }


    }


    public static void altaAdministrativo(){
        administrativo Administrativo=new administrativo();


        System.out.println("nombre: ");
        Administrativo.setNombre(leer.nextLine());

        System.out.println("domicilio: ");
        Administrativo.setDomicilio(leer.nextLine());

        System.out.println("ciudad: ");
        Administrativo.setCiudad(leer.nextLine());

        System.out.println("No. de control: ");
        Administrativo.setnumControl(Integer.parseInt(leer.nextLine()));

        System.out.println("departamento: ");
        Administrativo.setDepartamento(leer.nextLine());

        System.out.println("numero de seguro social: ");
        Administrativo.setnumSeguro(Integer.parseInt(leer.nextLine()));

        System.out.println("numero de RFC");
        Administrativo.setrfc(Integer.parseInt(leer.nextLine()));

        administrativo.add(Administrativo);
    }

    public static void Listaradministrativo(){

        for(administrativo a : administrativo){

            if(a instanceof administrativo){

                System.out.println("nombre:"+a.getNombre());
                System.out.println("domicilio:" + a.getDomicilio());
                System.out.println("ciudad:" + a.getCiudad());
                System.out.println("numero de control:" + a.getnumControl());
                System.out.println("departamento:"+a.getDepartamento());
                System.out.println("numero de seguro social:"+a.getnumSeguro());
                System.out.println("numero de rfc:"+a.getrfc());

            }



        }

    }
}
