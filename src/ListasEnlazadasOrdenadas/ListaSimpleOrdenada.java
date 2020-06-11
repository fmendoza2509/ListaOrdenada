package ListasEnlazadasOrdenadas;
public class ListaSimpleOrdenada {
    private Nodo inicio;//Nodo inicial, marca el inicio de la lista

    public ListaSimpleOrdenada() {
        setInicio(null);
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getInicio() {
        return inicio;
    }
    //Creamos un método para que busque un dato especifico y retorne un boolean
    public boolean EncontrarDato(int dato){
        Nodo aux = getInicio();//creamos un nodo auxiliar qye nos permitira recorrer la lista
        while(aux !=null){
            if(aux.getDato()==dato){//Si nuestro auxiliar es igual al dato entonces
                return true;
            }
            aux = aux.getSiguiente();//Si llega hasta aqui quiere decir que no lo encontro y sigue al proximo nodo
        }
        return false;//si retorna falso es que no encuentró nada
    }
    //Creamos un método para insertar un datos y devuelda un boolean
    public boolean InsertarDato(int dato){
        if(!EncontrarDato(dato)){//Si no encontramos el datos
            Nodo nuevo = new Nodo();
            nuevo.setDato(dato);//Creamos un nuevo nodo y le asignamos el dato
            if(getInicio()==null){//Si nuestro inicio es nulo entonces
                setInicio(nuevo);//El inicio sera el nuevo nodo
                return true;//Retornamos un true
            }else{//caso contrario la lista no esta vacia
                Nodo aux = getInicio();//creamos un nodo auxiliar para recorrer la lista
                if(aux.getDato()>dato){//si el auxiliar es mayor que el dato
                    nuevo.setSiguiente(aux);
                    setInicio(nuevo);//Ahora este es el nuevo inicio
                    return true;
                }
                while(aux.getSiguiente()!=null){//Ahora empezamos a recorrer la lista
                    if(aux.getSiguiente().getDato()>dato){//si el siguiente nodo es mayor a nuestro dato, entonces lo insertamos
                        nuevo.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(nuevo);
                        return true;
                    }
                    aux = aux.getSiguiente();
                }
                //Si llega hasta aqui es que lo va a insertar al final
                aux.setSiguiente(nuevo);
                return true;
            }
        }else {//significa que el datos ya estaba en la lista
            System.out.println("El dato ya existe!!!");
            return false;
        }
    }
    //Método para mostrar todos los datos
    public void MostrarDatos(){
        Nodo aux = getInicio();
        while(aux != null){
            System.out.println("Dato: "+aux.getDato()+"\n");
            aux =aux.getSiguiente();
        }
    }
}
