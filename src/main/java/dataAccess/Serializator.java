package dataAccess;
import businessLogic.BaseProduct;
import businessLogic.MenuItem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serializator {
    List<String[]> dataLines =new ArrayList<>();
    List<MenuItem> menuItems;
    public Serializator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void realizareSerializare() {
        dataLines.add(new String[] {"title","rating","calories","protein","fat","sodium","price"});
        for(MenuItem i:menuItems){
            dataLines.add(new String[]{i.getTitle(), String.valueOf(i.getRating()), String.valueOf(i.getCalories()),
                    String.valueOf(i.getProtein()), String.valueOf(i.getFat()), String.valueOf(i.getSodium()), String.valueOf(i.getPrice())});
        }
        try{
            FileWriter writer=new FileWriter("E:\\PT2022_30228_Cindea_Alexandru_4\\products1.csv");
            for(String[] j:dataLines){
                for(String z:j){
                    writer.append(z);
                    writer.append(",");
                }
                writer.append("\n");
            }
            writer.flush();
            writer.close();
        }catch(Exception e){}
    }
}
