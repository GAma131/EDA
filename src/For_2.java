import javax.swing.JOptionPane;

public class For_2 {
    private int Nalumn;

    public For_2(int Nalumn) {
        setNalumn(Nalumn);
    }

    public void setNalumn(int Nalumn){
        if(Nalumn<0){
            this.Nalumn=1;
        }else{
            this.Nalumn=Nalumn;
        }
    }

    public int getNalumn(){
        return Nalumn;
    }

    public String Calcular(){
        double promedio=0;
        double calMenor=9999999;

        for (int i = 1; i <= Nalumn; i++) {
            double cal= Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificación del alumno "+i+": "));
            promedio+=cal;

            if (cal<calMenor) {
                calMenor = cal;
            }
        }
        promedio /= Nalumn;
        return "\nPromedio: "+promedio+"\nCalificación más baja: "+calMenor;
    }

    @Override
    public String toString() {
        return "El número de alumnos y calificaciones es: " + Nalumn;
    }
}
