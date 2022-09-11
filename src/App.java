import javax.swing.JOptionPane;

import ForCiclos.For_1;
import ForCiclos.For_2;
import ForCiclos.For_3;
import ForCiclos.For_4;
import ForCiclos.For_5;
import ForCiclos.For_6;
import ForCiclos.For_7;

public class App {
    public static void main(String[] args) throws Exception {
        String chose="\n\nElige una opción:";
        String noV="Opción no valida";

        int menu = Integer.parseInt(JOptionPane.showInputDialog("MENU"
            + "\n1)Ciclos For"
            + "\n2)Ciclos While"
            + "\n3)Ciclos Do-While"
            + chose));
        int Npersonas;


        switch (menu) {
            case 1:
                int Cfor= Integer.parseInt(JOptionPane.showInputDialog("1)Promedio Metodologia"
                    + "\n2) Promedio Alumnos clase"
                    + "\n3) Tabla de multiplicar"
                    + "\n4) Promedio peso por edad"
                    + "\n5) Descuentos!"
                    + "\n6) Autos contaminantes"
                    + "\n7) Suma de números"
                    + chose));
                switch (Cfor) {
                    // !For_4 Pendiente
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
                    case 4:
                        //TODO: PROMEDIO PENDIENTE
                        Npersonas= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de personas: "));
                        For_4 objF4=new For_4(Npersonas);
                        JOptionPane.showMessageDialog(null, objF4.toString()+objF4.mostrarEdadPeso());
                    break;

                    case 5:
                        Npersonas=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de personas: "));
                        Double precio= Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio a pagar (sin descuento):"));
                        For_5 objF5=new For_5(precio, Npersonas);
                        JOptionPane.showMessageDialog(null, objF5.toString()+objF5.calcDescuento());
                    break;

                    case 6:
                        int Nautos=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de autos: "));
                        For_6 objF6=new For_6(Nautos);
                        JOptionPane.showMessageDialog(null, objF6.toString()+objF6.calcContaminantes());
                    break;

                    case 7:
                        int Numeros = Integer.parseInt(JOptionPane.showInputDialog("¿De cuantos números sera la suma?: "));
                        For_7 objF7=new For_7(Numeros);
                        JOptionPane.showMessageDialog(null, objF7.toString()+objF7.calcSuma());
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
