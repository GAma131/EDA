import javax.swing.JOptionPane;

public class Calif_Met {
    private int Ncalif;


    public Calif_Met (int Ncalif){
        setNcalif(Ncalif);
    }

    public void setNcalif(int Ncalif){
        if(Ncalif<0){
            this.Ncalif=1;
        }else{
            this.Ncalif=Ncalif;
        }
    }

    public int getNcalif(){
        return Ncalif;
    }


    public double promedioMateriaFor(){
        double promedio=0;

        for (int i = 1; i <= Ncalif; i++) {
            double cal= Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificación "+i+": "));
            promedio+=cal;
        }
        promedio /= Ncalif;
        return promedio;
    }

}
