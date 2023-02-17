
package diegoandino_examen1p2;


public class PC_Escritorio extends PC {
    private int ram;
    private int almacenamiento;
    private boolean tipoalm;
    private boolean tarjeta;

    public PC_Escritorio(int ram, int almacenamiento, boolean tipoalm, boolean tarjeta, String host, String IP, String mask) {
        super(host, IP, mask);
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tipoalm = tipoalm;
        this.tarjeta = tarjeta;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public boolean isTipoalm() {
        return tipoalm;
    }

    public void setTipoalm(boolean tipoalm) {
        this.tipoalm = tipoalm;
    }

    public boolean isTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(boolean tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return super.toString() + "\nram: " + ram + "\nalmacenamiento: " + almacenamiento + "\ntipoalm: " + tipoalm + "\ntarjeta: " + tarjeta ;
    }
    
    
    
}
