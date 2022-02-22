public class Radio {
    private String tipo;
    private String tamanio;
    private String tipoBateria;
    private String conectividad;
    private String disenio;

    public Radio(){
    }

    public Radio(String tipo, String tamanio, String tipoBateria, String conectividad, String disenio) {
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.tipoBateria = tipoBateria;
        this.conectividad = conectividad;
        this.disenio = disenio;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTamanio(){
        return tamanio;
    }
    public void setTamanio(String tamanio){
        this.tamanio = tamanio;
    }

    public String getTipoBateria(){
        return tipoBateria;
    }
    public void setTipoBateria(String tipoBateria){
        this.tipoBateria = tipoBateria;
    }

    public String getConectividad(){
        return conectividad;
    }
    public void setConectividad(String conectividad){
        this.conectividad = conectividad;
    }

    public String getDisenio(){
        return disenio;
    }
    public void setDisenio(String disenio){
        this.disenio = disenio;
    }

}

