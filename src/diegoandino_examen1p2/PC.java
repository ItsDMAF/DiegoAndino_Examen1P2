package diegoandino_examen1p2;

import java.util.ArrayList;

public class PC {

    private String host;
    private String IP;
    private String mask;

    public PC() {

    }

    public PC(String host, String IP, String mask) {
        this.host = host;
        this.IP = IP;
        this.mask = mask;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    @Override
    public String toString() {
        return "PC" + "\nhost: " + host + "\nIP: " + IP + "\nmask: " + mask;
    }

    
}
