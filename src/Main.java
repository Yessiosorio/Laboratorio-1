import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Lista Listado = new Lista();
        int opcion=0, el;
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar al Inicio \n 2.Insertar al Final \n 3. Recorrer"
                                +"\n 4. Buscar Elemento \n 5. Borrar Elemento \n 6. Salir","Menu de opciones",3));
                switch(opcion){
                    case 1:
                        el=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Elemento: ","Insertando al inicio",3));
                        Listado.agregarAlInicio(el);
                        break;
                    case 2:
                        el=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Elemento: ","Insertando al final",3));
                        Listado.agregarAlFinal(el);
                        break;
                    case 3:
                        Listado.MostrarLista();
                        break;
                    case 4:
                        el=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento a buscar..","Buscando Nodo",
                                JOptionPane.INFORMATION_MESSAGE));
                        if(Listado.Buscar(el)==true){
                            JOptionPane.showMessageDialog(null,"El elemento "+ el +
                                    " Si esta en la lista");
                        }else{
                            JOptionPane.showMessageDialog(null,"El elemento "+ el +
                                    " No esta en la lista");
                        }

                        break;
                    case 5:
                        el=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento a eliminar..","Eliminando Nodo",
                                JOptionPane.INFORMATION_MESSAGE));
                        Listado.Eliminar(el);
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es: "+ el);
                        break;
                    case 6:
                        JOptionPane.showConfirmDialog(null, "Programa finalizado");
                        break;
                    default:
                        JOptionPane.showConfirmDialog(null, "Opcion incorrecta");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
            }
        }while(opcion != 6);
    }

}