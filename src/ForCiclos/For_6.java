package ForCiclos;

import javax.swing.JOptionPane;

public class For_6 {
    private int Nautos;

    public For_6(int Nautos){
        setNautos(Nautos);
    }

    public void setNautos(int Nautos){
        if (Nautos<0) {
            this.Nautos=1;
        } else {
            this.Nautos=Nautos;
        }
    }

    public int getNautos(){
        return Nautos;
    }

    public String calcContaminantes(){
        double conMenor = 99999999;
        double conMayor  = -99999999;
        double promedio=0;
        int autoMenor=0;
        int autoMayor=0;

        for (int i = 1; i <= Nautos; i++) {
            double contam = Double.parseDouble(JOptionPane.showInputDialog("Puntos contaminantes del auto "+i+": "));
            promedio+=contam;

            if (contam < conMenor) {
                conMenor=contam;
                autoMenor=i;
            }
            if (contam > conMayor) {
                conMayor=contam;
                autoMayor=i;
            }
        }
        promedio/=Nautos;
        return "\n\nEl promedio de puntos de contaminación es de: "+promedio
            + "\n\nEl auto que mas contamino es el auto no."+autoMayor+" con "+conMayor+" puntos"
            + "\nEl auto que menos contamino es el auto no."+autoMenor+" con "+conMenor+" puntos        ";
    }

    @Override
    public String toString() {
        return "Número de autos: "+Nautos;
    }


}
