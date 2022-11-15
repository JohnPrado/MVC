
package Modelo;


public class modelo {
    
    private int NumeroUno = 0;
    private int NumeroDos = 0;
    private String operador = "";

    /**
     * @return the NumeroUno
     */
    public int getNumeroUno() {
        return NumeroUno;
    }

    /**
     * @param NumeroUno the NumeroUno to set
     */
    public void setNumeroUno(int NumeroUno) {
        this.NumeroUno = NumeroUno;
    }

    /**
     * @return the NumeroDos
     */
    public int getNumeroDos() {
        return NumeroDos;
    }

    /**
     * @param NumeroDos the NumeroDos to set
     */
    public void setNumeroDos(int NumeroDos) {
        this.NumeroDos = NumeroDos;
    }

    /**
     * @return the operador
     */
    public String getOperador() {
        return operador;
    }

    /**
     * @param operador the operador to set
     */
    public void setOperador(String operador) {
        this.operador = operador;
    }
    


    public int operacion() {

if (operador.equals("+")){
    return NumeroUno+NumeroDos;
    }
if (operador.equals("-")){
    return NumeroUno-NumeroDos;
    }
if (operador.equals("*")){
    return NumeroUno*NumeroDos;
    }

if (operador.equals("/")){
    return NumeroUno/NumeroDos;
    
}
    return 0;
    }
}