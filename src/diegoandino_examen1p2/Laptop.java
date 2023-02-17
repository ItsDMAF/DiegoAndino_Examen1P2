
package diegoandino_examen1p2;

public class Laptop extends PC{
    private String marca;
    private String definición;
    private boolean rgb;

    public Laptop(String marca, String definición, boolean rgb, String host, String IP, String mask) {
        super(host, IP, mask);
        this.marca = marca;
        this.definición = definición;
        this.rgb = rgb;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDefinición() {
        return definición;
    }

    public void setDefinición(String definición) {
        this.definición = definición;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return super.toString() + "\nmarca:" + marca + "\ndefinici\u00f3n: " + definición + "\nrgb: " + rgb;
    }
    
    
    
}
