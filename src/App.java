import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        double sumaCal=0;
        double promedio=0;
        int menu = Integer.parseInt(JOptionPane.showInputDialog("MENU"
            + "\n1)Ciclos For"
            + "\n2)Ciclos While"
            + "\n3)Ciclos Do-While"
            + "\n\nSelecciona una opción:"));


        switch (menu) {
            case 1:
                int Cfor= Integer.parseInt(JOptionPane.showInputDialog("1)Promedio Metodologia\n2)Alumnos clase\n\nElige una opción:"));
                switch (Cfor) {
                    case 1:
                        int Ncalif;
                        Ncalif= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de calificaciones: "));
                        Calif_Met obj = new Calif_Met(Ncalif);
                        JOptionPane.showMessageDialog(null, "El resultado es: "+obj.promedioMateriaFor());
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no valida");
                        break;
                }
                break;
            case 2:
                int Cwhile= Integer.parseInt(JOptionPane.showInputDialog("\n\nElige una opción:"));
                switch (Cwhile) {
                    case 1:

                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no valida");
                        break;
                }
                break;
            case 3:
                int Cdowhile= Integer.parseInt(JOptionPane.showInputDialog("\n\nElige una opción:"));
                switch (Cdowhile) {
                    case 1:

                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no valida");
                        break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no valida");
                break;
        }

        // PROBLEMA 2 CON CICLO FOR
        // int Ncal= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de Alumnos: "));

        // for (int i = 1; i <= Ncal; i++) {
        //     double cal= Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificación del alumno "+i+": "));
        //     sumaCal+=cal;
        //     promedio = sumaCal / Ncal;
        // }
        // JOptionPane.showMessageDialog(null, "Calificación media de la clase: "+promedio);
    }
}
