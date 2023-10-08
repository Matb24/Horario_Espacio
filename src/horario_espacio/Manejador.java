package horario_espacio;

public class Manejador {
    private Dia[] vec_dias = new Dia[7];
    private int cant_act;

    public Manejador(String planeta) {
        vec_dias[0] = new Dia("Lunes", planeta);
        vec_dias[1] = new Dia("Martes", planeta);
        vec_dias[2] = new Dia("Miércoles", planeta);
        vec_dias[3] = new Dia("Jueves", planeta);
        vec_dias[4] = new Dia("Viernes", planeta);
        vec_dias[5] = new Dia("Sábado", planeta);
        vec_dias[6] = new Dia("Domingo", planeta);
    }

    public void AsignarActividad(String actividades[], int N) {
        int inicio, fin, dia;
        cant_act = N;
        boolean verif;
        int dias[] = new int[7];
        for (int i = 0; i < 6; i++)
            dias[i] = i + 1;

        for (int i = 0; i < N; i++) {
            verif = true;
            do {
                inicio = (int) (Math.random() * 6 + 8);
                fin = (int) (Math.random() * 10 + 12);
            } while (fin < inicio + 4);
            do {
                dia = (int) (Math.random() * 6 + 1);

                for (int j = 0; j < 6; j++) {
                    if (dias[j] == dia) {
                        verif = false;
                        dias[j] -= dia;
                    }
                }

            } while (verif);

            vec_dias[dia - 1].ingresarActividad(inicio, fin, actividades[i]);
        }
    }

    public String[][] obtenerHorarioCompleto() {
    String[][] horarioCompleto = new String[7][1]; 

    for (int i = 0; i < 7; i++) {
        if (vec_dias[i].tieneActividad()) {
            horarioCompleto[i][0] = vec_dias[i].getHoraYActividad();
        } else {
            horarioCompleto[i][0] = "Día de descanso";
        }
    }
    return horarioCompleto;
}



    public int getHoraInicioActividad(int pos) {
        return pos >= 0 && pos < 7 && vec_dias[pos].tieneActividad() ? 8 : -1;
    }

    public int getHoraFinActividad(int pos) {
        return pos >= 0 && pos < 7 && vec_dias[pos].tieneActividad() ? 12 : -1;
    }

    public String getNombreActividad(int pos) {
        return pos >= 0 && pos < 7 ? vec_dias[pos].getActividad() : "";
    }

    public String getPlaneta(int pos) {
        return pos >= 0 && pos < 7 ? vec_dias[pos].getPlaneta() : "";
    }

    public String getDia(int pos) {
        return pos >= 0 && pos < 7 ? vec_dias[pos].getNombreDia() : "";
    }

    public boolean hayActividad(int pos) {
        return pos >= 0 && pos < 7 && vec_dias[pos].tieneActividad();
    }

    public int getCant_act() {
        return cant_act;
    }

    public void setCant_act(int cant_act) {
        this.cant_act = cant_act;
    }
}
