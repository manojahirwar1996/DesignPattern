package StructralPattern.CompositePattern;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.List;

public class WorkManager implements Worker{
    List<Human > humanEmployees = new ArrayList<>();
    List<Robot > robotEmployees = new ArrayList<>();

    public void add(Worker worker){
        String name =  worker.getClass().getName();
        if(name.substring(name.lastIndexOf('.') + 1).equalsIgnoreCase("Human")){
            this.humanEmployees.add((Human)worker);
        }
        else {
            this.robotEmployees.add((Robot) worker);       }
    }

    public void remove(Worker worker){
        String name =  worker.getClass().getName();
        if(name.substring(name.lastIndexOf('.') + 1).equalsIgnoreCase("Human")){
            this.humanEmployees.remove((Human)worker);
        }
        else {

                this.robotEmployees.remove((Robot) worker);       }

        }

    @Override
    public void performTask() {
        System.out.println(getClass().getName() + "performing a task");
    }


    @Override
    public String toString() {
        return "Human workers are "+ humanEmployees + "  and Robot workers are"+ robotEmployees ;
    }
}
