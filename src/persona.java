/**
 * Created by Administrador on 07/04/2016.
 */
public class persona {

    private String nombre;
    private String domicilio;
    private String ciudad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String comer(){
        return "estoy comiendo...";
    }
    public String pistear(String bebida){

        return "estoy pisteando...";
    }

    public String dormir(){
        return "contando perros.......";
    }
}

