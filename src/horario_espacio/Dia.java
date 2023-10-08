package horario_espacio;





public class Dia {
    private String actividad;
    private String dia;
    private String planeta;
    private boolean hayActividad;
    private int horaInicio;
    private int horaFin;

    public Dia(String dia, String planeta) {
        this.dia = dia;
        this.planeta = planeta;
        this.hayActividad = false;
    }

    public void ingresarActividad(int inicio, int fin, String actividad) {
        this.horaInicio = inicio;
        this.horaFin = fin;
        this.actividad = actividad;
        this.hayActividad = true;
    }

    public boolean tieneActividad() {
        return hayActividad;
    }

    public String getActividad() {
        return actividad;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public String getDia() {
        return dia;
    }

    public String getPlaneta() {
        return planeta;
    }

    public String getHoraYActividad() {
        if (tieneActividad()) {
            return getHoraInicio() + " - " + getHoraFin() + ": " + getActividad();
        } else {
            return "Sin actividad";
        }
    }

    public String getNombreDia() {
        return dia;
    }
}

   
    

