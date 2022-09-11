package ForCiclos;

import javax.swing.JOptionPane;

public class For_5 {
    private double precio;
    private int Npersonas;

    public For_5(Double precio, int Npersonas){
        setPrecio(precio);
        setNpersonas(Npersonas);
    }

    public void setPrecio(Double precio){
        if (precio <=0.0) {
            this.precio = 0.1;
        } else {
            this.precio=precio;
        }
    }
    public void setNpersonas(int Npersonas){
        if (Npersonas <=0) {
            this.precio = 1;
        } else {
            this.Npersonas=Npersonas;
        }
    }

    public double getPrecio(){
        return precio;
    }
    public double getNpersonas(){
        return Npersonas;
    }


    public String calcDescuento(){
        String imprimir="";
        double total=0;

        precio*=0.15;
        for (int i = 1; i <= Npersonas; i++) {
            double kilos=Double.parseDouble(JOptionPane.showInputDialog("Kilos a comprar del ciente "+i+": "));

            if (kilos >=10) {
                total+=precio;
                imprimir+="\nPrecio con descuento del cliente "+i+": $"+precio+"        ";
            }else{
                imprimir+="\nPrecio con descuento del cliente "+i+": No aplica";
            }

        }
        return imprimir+"\n\nLa tienda recibirá un total de: $"+total;
    }

    @Override
    public String toString() {
        return "Número de clientes para el descuento: " + Npersonas + "\nPrecio sin descuento: $" + precio+"\n";
    }

}
