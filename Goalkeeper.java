/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab2, Arrays y excepciones
 * 22-09-2323
 * @return Goalkeeper
 */

public class Goalkeeper extends Player{
    
    private int paradas;
    private int golesRec;
    private float efectividad;


    
    public Goalkeeper(String name, String country, int faults, int goals, int shots, int paradas, int golesRec) {
        super(name,country,faults,goals,shots);

        this.paradas = paradas;
        this.golesRec = golesRec;
    }

    public int getParadas() {
        return paradas;
    }
    public void setParadas(int paradas) {
        this.paradas = paradas;
    }
    public int getGolesRec() {
        return golesRec;
    }
    public void setGolesRec(int golesRec) {
        this.golesRec = golesRec;
    }
    public float getEfectividad() {
        return efectividad;
    }
    public void setEfectividad() {

        float efectividad =( ((this.paradas - this.golesRec) * 100 / (this.paradas + this.golesRec)) 
        + (super.getGoals() * 100) /super.getShots());
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

    @Override
    public String toString() {
        return super.toString() + ", Paradas " + paradas + ", Goles recibidos " + golesRec + ", efectividad " + efectividad + "]";
    }

    
}
