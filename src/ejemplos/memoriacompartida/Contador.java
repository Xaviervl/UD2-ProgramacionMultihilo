package ejemplos.memoriacompartida;

/**
 * Clase contador:
 * - atributo privado entero valor, con un getter
 * - método de instancia incrementar(), que incrementa valor en una unidad
 */
public class Contador {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void incrementar() {
        valor++;
    }


}