public class Celular {
    private String bateria;
    private String camara;
    private String colorr;
    private String celTamano;
    private int almacen;

    public Celular(){
    }

    public Celular(String bateria, String camara, String colorr, String celTamano, int almacen) {
        this.bateria = bateria;
        this.camara = camara;
        this.colorr = colorr;
        this.celTamano = celTamano;
        this.almacen = almacen;
    }

    public String getBateria(){
        return bateria;
    }
    public void setBateria(String bateria){
        this.bateria = bateria;
    }

    public String getCamara(){
        return camara;
    }
    public void setCamara(String camara){
        this.camara = camara;
    }

    public String getColorr(){
        return colorr;
    }
    public void setColorr(String colorr){
        this.colorr = colorr;
    }

    public String getCelTamano(){
        return celTamano;
    }
    public void setCelTamano(String celTamano){
        this.celTamano = celTamano;
    }

    public int getAlmacen(){
        return almacen;
    }
    public void setAlmacen(int almacen){
        this.almacen = almacen;
    }

}

