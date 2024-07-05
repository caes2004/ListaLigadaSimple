package PracticaDPAS2VS;
import java.util.Scanner;
public class ListaLigada {
    private Nodo cabeza;
    private Nodo Ult;
   // private Nodo P;

    public ListaLigada() {
        this.Ult = null;
        this.cabeza = null;
    }

    public void crearLista() {
        String resp;
        int sw = 0;
        Scanner read = new Scanner(System.in);

        System.out.println("¿Desea crear un nuevo nodo en la lista? (S/N)");
        resp = read.nextLine();

        while (resp.equals("s") && sw == 0) {
            Nodo P = new Nodo(); // Crear un nuevo nodo

            if (P == null) {
                System.out.println("No hay espacio en memoria");
                sw = 1;
            } else {
                System.out.println("Digite el valor en el nodo:");
                P.dato = read.nextInt();
                read.nextLine(); // Limpiar el buffer
            }

            if (cabeza == null) {
                cabeza = P;
            } else {
                Ult.liga = P; // Enlazar el nuevo nodo al último nodo
            }
            Ult = P; // Actualizar el último nodo

            System.out.println("¿Desea crear un nuevo nodo en la lista? (S/N)");
            resp = read.nextLine();
        }
       
    }

    public void imprimirLista() {
        Nodo temp = cabeza; // Inicializar un nodo temporal con la cabeza
    
        if (temp == null) {
            System.out.println("La lista está vacía");
        } else {
            while (temp != null) {
                System.out.println(temp.dato);
                temp = temp.liga; // Avanzar al siguiente nodo
            }
        }
    }
    public void ordenarLista() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }
    
        Nodo P = cabeza; // Inicializamos P con la cabeza de la lista
    
        while ( P.liga != null) {
            Nodo temp = P.liga; // Inicializamos temp con el siguiente nodo de P
    
            while (temp != null) {
                if (P.dato > temp.dato) {
                    // Intercambiamos los valores de P y temp
                    int aux1 = P.dato;
                    P.dato = temp.dato;
                    temp.dato = aux1;
                }
                temp = temp.liga; // Avanzamos al siguiente nodo
            }
            P = P.liga; // Avanzamos al siguiente nodo de la lista principal
        }
    }
}

