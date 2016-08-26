/**
 * Created by roberto on 08/04/2016.
 */
public class administrativo extends persona{

    private int numControl;
    private String departamento;
    private int numSeguro;
    private int rfc;


    public int getnumControl() {
        return numControl;
    }

    public void setnumControl(int numControl) {
        this.numControl = numControl;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public int getnumSeguro(){
        return numSeguro;
    }

    public void setnumSeguro(int numSeguro){

        this.numSeguro = numSeguro;
    }

    public int getrfc(){
        return rfc;
    }
    public void setrfc(int rfc){

        this.rfc = rfc;

    }
}







