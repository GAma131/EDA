package ForCiclos;

import javax.swing.JOptionPane;

public class For_7 {
    private int Numeros;

    public For_7(int Numeros){
        setNumeros(Numeros);
    }

    public void setNumeros(int Numeros){
        if (Numeros <= 0) {
            this.Numeros = 1;
        } else {
            this.Numeros = Numeros;
        }
    }

    public int getNumeros(){
        return Numeros;
    }

    public String calcSuma(){
        double result=0;
        String print="";

        for (int i = 1; i <= Numeros; i++) {
            double valor= Double.parseDouble(JOptionPane.showInputDialog("Número: "+i));
            print+= valor+" + ";
            result+=valor;
        }
        return "\n\nSuma: "+print
            + "\nResultado= "+result;
    }

    @Override
    public String toString() {
        return "Total de números: "+Numeros;
    }


}
