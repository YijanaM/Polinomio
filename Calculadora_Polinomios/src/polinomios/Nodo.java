package polinomios;

public class Nodo {

    private double coeficiente;
    private int exponente;
    public Nodo siguiente;

    public Nodo(double coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        siguiente = null;
    }

    public Nodo() {
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public int getExponente() {
        return exponente;
    }

    public void actualizar(double coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }

}
