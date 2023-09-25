/** Programacion orientada a objetos -  seccion 10
 * Luis Francisco Padilla Juárez - 23663
 * Lab2, Arrays y excepciones
 * 22-09-2323
 * @return player
 */

public class Player {

    private String name;
    private String country;
    private int faults;
    private int goals;
    private int shots;


    protected Player(String name, String country, int faults, int goals, int shots) {
        this.name = name;
        this.country = country;
        this.faults = faults;
        this.goals = goals;
        this.shots = shots;
    }

    protected String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }
    protected String getCountry() {
        return country;
    }
    protected void setCountry(String country) {
        this.country = country;
    }
    protected int getFaults() {
        return faults;
    }
    protected void setFaults(int faults) {
        this.faults = faults;
    }
    protected int getGoals() {
        return goals;
    }
    protected void setGoals(int goals) {
        this.goals = goals;
    }
    protected int getShots() {
        return shots;
    }
    protected void setShots(int shots) {
        this.shots = shots;
    }
    
    public String toString() {
        return "Jugador: " + name + ", Nacionalidad: " + country + ", Faltas: " + faults + ", Goles: " + goals + ", Tiros: "
                + shots;
    }
    



    

}
