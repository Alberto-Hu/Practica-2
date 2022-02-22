public class Lampara {
    private String estado;
    private String intensidad;
    private String lampcolor;
    private String forma;
    private String lamTamano;

    public Lampara(){
    }

    public Lampara(String estado, String intensidad, String lampcolor, String forma, String lamTamano) {
        this.estado = estado;
        this.intensidad = intensidad;
        this.lampcolor = lampcolor;
        this.forma = forma;
        this.lamTamano = lamTamano;
    }

    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getIntensidad(){
        return intensidad;
    }
    public void setIntensidad(String intensidad){
        this.intensidad = intensidad;
    }

    public String getLampcolor(){
        return lampcolor;
    }
    public void setLampcolor(String lampcolor){
        this.lampcolor = lampcolor;
    }

    public String getForma(){
        return forma;
    }
    public void setForma(String forma){
        this.forma = forma;
    }

    public String getLamTamano(){
        return lamTamano;
    }
    public void setLamTamano(String lamTamano){
        this.lamTamano = lamTamano;
    }

}

