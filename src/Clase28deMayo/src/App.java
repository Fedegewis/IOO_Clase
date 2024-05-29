import Clase28deMayo.src.uade.edu.ar.controller.Controller;
import Clase28deMayo.src.uade.edu.ar.dto.ModelDto;
import Clase28deMayo.src.uade.edu.ar.model.Model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Model> models = new ArrayList<>();
        //Creo la lista del modelo
        for(int i = 0;i<10;i++){
            models.add(new Model("Id"+i,"Name ["+i+"]"));
            System.out.println("Creo Objects del model: " + models.get(i).toString());
        }
        //Desde un dto lo modifico
        ModelDto dto = new ModelDto("Id"+7,"Name [Modificado]");
        //Busco el modelo a editar o borrar.
        for(int i = 0;i<models.size();i++){
            //Modifico el que encuentro de la lista
            if(models.get(i).getId().equals(dto.getIdModel())){
                models.get(i).setName(dto.getNameModel());
                //En caso de borrar
                //models.remove(i);
            }
            System.out.println("Objects a buscar: " + models.get(i).toString());
        }




        char ch = 'c';
        try{
            Integer.parseInt(String.valueOf(ch));
            System.out.println("OK");
        }catch (NumberFormatException ex){
            System.out.println("Error");
        }
        //System.out.println(a);
        System.out.println(isNumber(ch));
        System.out.println(isNumberParser(ch));

        //char ch = '3';
        //int a = Character.getNumericValue(ch);
        //System.out.println("Hello, World! " + a );
        //Pattern digitPattern = Pattern.compile("\\d");

        //digitPattern.matcher(String.valueOf(ch));

        //System.out.println(digitPattern.matcher(String.valueOf(ch)));

        ArrayList<Model> modelLis = new ArrayList<>();
        for (int i=0;i<10;i++){
            modelLis.add(new Model("Id"+i,"Pepe"+1));
        }

        try {
            Controller controller = Controller.getInstances();
             controller.setModelList(modelLis);
             modelLis.remove(null);
            for (Model mo : controller.getModelList()) {
                System.out.println(mo.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isNumber(char ch){
        Matcher m = Pattern.compile("[0-9]+").matcher(String.valueOf(ch));
        return m.matches();
    }

    public static boolean isNumberParser(char ch){
        try{
            Integer.parseInt(String.valueOf(ch));
            return true;
        }catch (NumberFormatException ex){
            return false;
        }
    }
}
