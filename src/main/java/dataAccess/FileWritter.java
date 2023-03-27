package dataAccess;

import businessLogic.MenuItem;
import businessLogic.Order;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWritter {
    private static int i=0;


    public static void scrieIn(List<MenuItem> menuItems, Order order){
        try {
            double totalPrice=0;
            i++;
            FileWriter fw=new FileWriter("bill"+i+".txt");
            fw.write("FACTURA "+"\n");
            fw.write("Comanda cu ID-ul: "+order.getOrderID()+" care contine produsele:\n");
            for(MenuItem i:menuItems){
                fw.write("Produsul "+i.getTitle()+" cu rating "+i.getRating()+" la pretul de "+i.getPrice()+"\n");
                totalPrice=totalPrice+i.getPrice();
            }
            fw.write("Totalul comenzii: "+totalPrice);
            fw.close();
        } catch (IOException e) {}
    }
}
