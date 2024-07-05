package PracticaDPAS2VS;

public class Main {
    public static void main(String[] args) {
        ListaLigada A=new ListaLigada();

        A.crearLista();
        System.out.println("Lista desordenada;");
        A.imprimirLista();
        System.out.println("Lista ordenadaa;");
        A.ordenarLista();
        A.imprimirLista();
    }

}
