package Ejercicio01;

public class Notas {

    private double pta;

    private double emc;

    private double efc;

    private Math math;

    public Notas(double pta, double emc, double efc) {
        this.pta = pta;
        this.emc = emc;
        this.efc = efc;
    }

    public double getPta() {
        return pta;
    }

    public void setPta(double pta) {
        this.pta = pta;
    }

    public double getEmc() {
        return emc;
    }

    public void setEmc(double emc) {
        this.emc = emc;
    }

    public double getEfc() {
        return efc;
    }

    public void setEfc(double efc) {
        this.efc = efc;
    }

    public double getPromedio(){

        double promedio;

        promedio = this.math.round(getPta() + getEmc() + getEfc())/3;

        return promedio;
    }
}
