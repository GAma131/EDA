package ForCiclos;

import javax.swing.JOptionPane;

public class For_4 {
    private int Npersonas;

    public For_4(int Npersonas){
        setNpersonas(Npersonas);
    }

    public void setNpersonas(int Npersonas){
        if (Npersonas <= 0) {
            this.Npersonas=1;
        } else {
            this.Npersonas=Npersonas;
        }
    }

    public int getNpersonas(){
        return Npersonas;
    }

    public String mostrarEdadPeso(){
        int ninos=0;
        int jovenes=0;
        int adultos=0;
        int viejos=0;
        double promNinos=0;
        double promJovenes=0;
        double promAdultos=0;
        double promViejos=0;

        for (int i = 1; i <= Npersonas; i++) {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce una edad (años): "));
            // double peso = Double.parseDouble(JOptionPane.showInputDialog("Introduce un peso (kg)"));

            if (edad > 0 && edad <=12) {
                double pesoN = Double.parseDouble(JOptionPane.showInputDialog("Introduce un peso (kg)"));
                ninos++;
                promNinos+=pesoN;
            }
            if (edad >= 13 && edad<=29) {
                double pesoJ = Double.parseDouble(JOptionPane.showInputDialog("Introduce un peso (kg)"));
                jovenes++;
                promJovenes+=pesoJ;
            }
            if (edad >= 30 && edad<=59) {
                double pesoA = Double.parseDouble(JOptionPane.showInputDialog("Introduce un peso (kg)"));
                adultos++;
                promAdultos+=pesoA;
            }
            if (edad >=  59) {
                double pesoV = Double.parseDouble(JOptionPane.showInputDialog("Introduce un peso (kg)"));
                if (edad>120) {
                    edad=120;
                }
                viejos++;
                promViejos+=pesoV;
            }

            promNinos/=ninos;
            promJovenes/=jovenes;
            promAdultos/=adultos;
            promViejos/=viejos;
        }

        return "\n\n        Categoria   Promedio peso           "
                + "\nNiños:          " +ninos +"        "+ promNinos
                + "\nJovenes:        " +jovenes +"      "+ promJovenes
                + "\nAdultos:        " +adultos +"      "+ promAdultos
                + "\nViejos:         " +viejos +"       "+ promViejos;
    }

    @Override
    public String toString() {
        return "Número de personas: "+Npersonas;
    }
}