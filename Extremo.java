/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab2, Arrays y excepciones
 * 22-09-2323
 * @return Extremo
 */

public class Extremo extends Player{
    
    private int pases;
    private int asistencias;
    private float efectividad;

    public Extremo(String name, String country, int faults, int goals, int shots, int pases, int asistencias) {
        super(name, country, faults, goals, shots);

        this.pases = pases;
        this.asistencias = asistencias;
    }

    public int getPases() {
        return pases;
    }
    public void setPases(int pases) {
        this.pases = pases;
    }
    public int getAsistencias() {
        return asistencias;
    }
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
    public float getEfectividad() {
        return efectividad;
    }
    public void setEfectividad() {
        float efectividad = (((this.pases + this.asistencias - super.getFaults()) * 100 / (this.pases + this.asistencias + this.getFaults())) 
        + super.getGoals() * 100 / super.getShots());
        this.efectividad = efectividad;
    }

    @Override
    public String getCountry() {
        return super.getCountry();
    }

    @Override
    public int getFaults() {
        return super.getFaults();
    }

    @Override
    public int getGoals() {
        return super.getGoals();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getShots() {
        return super.getShots();
    }

    @Override
    public void setCountry(String country) {
        super.setCountry(country);
    }

    @Override
    public void setFaults(int faults) {
        super.setFaults(faults);
    }

    @Override
    public void setGoals(int goals) {
        super.setGoals(goals);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setShots(int shots) {
        super.setShots(shots);
    }

    public String toString() {
        return super.toString() + ", Pases " + pases + ", Asistencias " + asistencias + ", efectividad " + efectividad + "]";
    }
}
