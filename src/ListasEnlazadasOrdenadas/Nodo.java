package ListasEnlazadasOrdenadas;
public class Nodo {
    private int dato;//Datos que insertaremos en nuestra lista
    private Nodo siguiente;//referencia al siguiente nodo

    public Nodo() {
        setDato(0);
        setSiguiente(null);
    }

    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
    
}
