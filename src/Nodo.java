public class Nodo {
    public int dato;
    public Nodo enlace;
    public Nodo (int d, Nodo n){
        dato = d;
        enlace = n;
    }
    public Nodo(int d){
        this.dato=d;
        this.enlace=null;
    }
}