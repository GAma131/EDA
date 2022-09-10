package ForCiclos;
public class For_3 {
    private int tabla;

    public For_3(int tabla){
        setTabla(tabla);
    }

    public void setTabla(int tabla){
        if (tabla<=0) {
            this.tabla=1;
        }
        if (tabla>10) {
            this.tabla=10;
        }else{
            this.tabla=tabla;
        }
    }

    public int getTabla(){
        return tabla;
    }

    public String Multiplicar(){
        int resultado=0;
        String imprimir="";
        for (int i = 1; i <= 10; i++) {
            resultado=tabla*i;

            imprimir+= "\n          "+tabla+"                       "+i+"                       "+resultado;
        }
        return "\n\nMultiplicando   Multiplicador   Resultado           "+imprimir;
    }

    @Override
    public String toString() {
        return "Tabla de multiplicar: "+tabla;
    }
}
