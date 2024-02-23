public class Lista {
    protected Nodo inicio, fin;
    public Lista (){
        inicio = null;
        fin = null;
    }
    public boolean ListaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    public void agregarAlInicio(int elemento){
        inicio = new Nodo(elemento, inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    public void agregarAlFinal(int elemento){
        if(!ListaVacia()){
            fin.enlace=new Nodo(elemento);
            fin=fin.enlace;
        }else{
            inicio=fin=new Nodo(elemento);
        }
    }
    public void MostrarLista () {
        Nodo recorrer = inicio;
        System.out.println();
        while(recorrer != null){
            System.out.print("["+recorrer.dato+"]-->");
            recorrer=recorrer.enlace;
        }
    }
    public boolean Buscar(int elemento){
        Nodo temporal=inicio;
        while(temporal != null && temporal.dato!=elemento){
            temporal=temporal.enlace;
        }
        return temporal!=null;
    }
    public void Eliminar(int elemento){
        if(!ListaVacia()){
            if(inicio==fin && elemento==inicio.dato){
                inicio=fin=null;
            }else if(elemento==inicio.dato){
                inicio= inicio.enlace;
            }else{
                Nodo anterior, temporal;
                anterior = inicio;
                temporal=inicio.enlace;
                while(temporal != null && temporal.dato!=elemento){
                    anterior=anterior.enlace;
                    temporal=temporal.enlace;
                }
                if(temporal==null){
                    anterior.enlace=temporal.enlace;
                    if(temporal==fin){
                        fin=anterior;
                    }
                }
            }
        }
    }
}


