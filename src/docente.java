/**
 * Created by roberto on 08/04/2016.
 */
public class docente extends persona {

    private int numControl;
    private String Materia;
    private int numSeguro;
    private int rfc;


    public int getnumControl() {
        return numControl;
    }

    public void setnumControl(int numControl) {
        this.numControl = numControl;
    }

    public String getMateria(){
        return Materia;
    }

    public void setMateria(String Materia){
        this.Materia = Materia;
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
