public class VagoneMerci extends Vagone {
    private double volumeCarico;
    private double pesoMaxCarico;
    private double pesoEffCarico;

    VagoneMerci(int codice, double pesoAVuoto, int annoDiCostruzione, String aziendaCostruttrice,
                double volumeCarico, double pesoMaxCarico, double pesoEffCarico) {
        super(codice, pesoAVuoto, annoDiCostruzione, aziendaCostruttrice);
        setVolumeCarico(volumeCarico);
        setPesoMaxCarico(pesoMaxCarico);
        setPesoEffCarico(pesoEffCarico);
        super.setPeso(getPesoEffCarico() + pesoAVuoto);
    }

    public void setVolumeCarico(double volumeCarico) {
        this.volumeCarico = volumeCarico;
    }

    public double getVolumeCarico() {
        return volumeCarico;
    }

    public void setPesoMaxCarico(double pesoMaxCarico) {
        this.pesoMaxCarico = pesoMaxCarico;
    }

    public double getPesoMaxCarico() {
        return pesoMaxCarico;
    }

    public void setPesoEffCarico(double pesoEffCarico) {
        this.pesoEffCarico = pesoEffCarico;
    }

    public double getPesoEffCarico() {
        return pesoEffCarico;
    }
}
