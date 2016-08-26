/**
 * Created by Administrador on 07/04/2016.
 */
public class alumno extends persona {

    private int numControl;
    private String carrera;
    private int semestre;
    private float promedio;

    public int getNumControl() {
        return numControl;
    }

    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    public String estudiar()
    {
        return "estoy estudiando";

    }
    public String tarea()
    {
        return "estoy haciendo tarea";
    }
}
