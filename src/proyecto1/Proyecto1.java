package proyecto1;

import javax.swing.JOptionPane;

public class Proyecto1 {

    public static void main(String[] args) {
        int e= 1;
        String[] name = new String[20];
        int[] cedula = new int[20];
        int[] precio = new int[20];
        String[] fecha = new String[20];
        int sombra = 5000;
        int palco = 12000;
        int i = 0;
        boolean salir = true;
        while (salir == true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("1-comprar entrada" + "\n 2-Ver base de datos " + "\n 3-Salir "));
            if (menu == 1) {
                String nombre = JOptionPane.showInputDialog("digite nombre ");
                int id = Integer.parseInt(JOptionPane.showInputDialog("digite cedula"));
                String date = JOptionPane.showInputDialog("digite fecha d/m/a ");
                fecha[i] = date;
                name[i] = nombre;
                cedula[i] = id;
                int entrada = Integer.parseInt(JOptionPane.showInputDialog("digite 1-sombra  2-palco "));
                if (entrada == 1) {
                    int entS = Integer.parseInt(JOptionPane.showInputDialog("digite cuantas entradas quiere "));
                    int precioS = sombra * entS;
                    precio[i] = precioS;
                    float iva = precioS * 0.13f;
                    float precioF = precioS + iva;
                    System.out.println("------------Factura--------------");
                    System.out.println("nombre:" + name[i] + "\nCedula:" + cedula[i] + "\nFecha:" + fecha[i]
                            + "\nPrecio de Entradas" + precio[i] + "\nIva:" + iva + "\nTotal" + precioF);
                    i++;
                    e++;
                }
                if (entrada == 2) {
                    int entS2 = Integer.parseInt(JOptionPane.showInputDialog("digite cuantas entradas quiere "));
                    int precioP = palco * entS2;
                    precio[i] = precioP;
                    float iva2 = precioP * 0.13f;
                    float precioF2 = precioP + iva2;
                    System.out.println("------------Factura--------------");
                    System.out.println("nombre:" + name[i] + "\nCedula:" + cedula[i] + "\nFecha:" + fecha[i]
                            + "\nPrecio de Entradas" + precio[i] + "\nIva:" + iva2 + "\nTotal:" + precioF2);
                    i++;
                    e++;
                }

            }
            if (menu == 2) {
                for (int a = 0; a < name.length; a++) {
               
                    if (name[a]==null){
                    break;
                    }else{
                         System.out.println("------------Base de datos--------------");
                    System.out.println("nombre:" + name[a] + "\nCedula:" + cedula[a] + "\nFecha:" + fecha[a]
                            + "\nPrecio de Entradas" + precio[a]);
                    
                    }
                }
            }
            if (menu == 3) {
                salir = false;
            }

        }
    }

}
