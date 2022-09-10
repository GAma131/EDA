import javax.swing.JOptionPane;

import ForCiclos.For_1;
import ForCiclos.For_2;
import ForCiclos.For_3;

public class App {
    public static void main(String[] args) throws Exception {
        String chose="\n\nElige una opción:";
        String noV="Opción no valida";

        int menu = Integer.parseInt(JOptionPane.showInputDialog("MENU"
            + "\n1)Ciclos For"
            + "\n2)Ciclos While"
            + "\n3)Ciclos Do-While"
            + chose));


        switch (menu) {
            case 1:
                int Cfor= Integer.parseInt(JOptionPane.showInputDialog("1)Promedio Metodologia"
                    + "\n2)Promedio Alumnos clase"
                    + "\n3)Tabla de multiplicar"
                    + chose));
                switch (Cfor) {
                    case 1:
                        int Ncalif;
                        Ncalif= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de calificaciones: "));
                        For_1 obj1 = new For_1(Ncalif);
                        JOptionPane.showMessageDialog(null, obj1.toString()+"\nEl resultado es: "+obj1.promedioMateriaFor());
                    break;

                    case 2:
                        int Nalumn;
                        Nalumn=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de alumnos: "));
                        For_2 obj2= new For_2(Nalumn);
                        JOptionPane.showMessageDialog(null, obj2.toString()+obj2.Calcular());
                    break;

                    case 3:
                        int tabla;
                        tabla= Integer.parseInt(JOptionPane.showInputDialog("Tabla de multiplicar a calcular: "));
                        For_3 objF3= new For_3(tabla);
                        JOptionPane.showMessageDialog(null, objF3.toString()+ objF3.Multiplicar());
                    break;

                    default:
                        JOptionPane.showMessageDialog(null, noV);
                        break;
                }
                break;
            case 2:
                int Cwhile= Integer.parseInt(JOptionPane.showInputDialog("\n\nElige una opción:"));
                switch (Cwhile) {
                    case 1:

                        break;

                    default:
                        JOptionPane.showMessageDialog(null, noV);
                        break;
                }
                break;
            case 3:
                int Cdowhile= Integer.parseInt(JOptionPane.showInputDialog("\n\nElige una opción:"));
                switch (Cdowhile) {
                    case 1:

                        break;

                    default:
                        JOptionPane.showMessageDialog(null, noV);
                        break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, noV);
                break;
        }
    }
}
