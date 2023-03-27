import businessLogic.MenuItem;
import presentation.controller.*;
import presentation.view.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems=new ArrayList<>();
        LogInView view=new LogInView();
        Client clientView=new Client();
        Administrator administratorView=new Administrator();
        AddView addView=new AddView();
        CreateComposedView createComposedView=new CreateComposedView();
        DeleteView deleteView=new DeleteView();
        ModifyView modifyView=new ModifyView();
        Angajat angajatView=new Angajat();
        RaportsView raportsView=new RaportsView();
        ControllerAll controllerAll=new ControllerAll(view,addView,administratorView,clientView,createComposedView,deleteView,modifyView,angajatView,raportsView,menuItems);

        }

    }
