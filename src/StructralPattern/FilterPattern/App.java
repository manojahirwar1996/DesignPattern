package StructralPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Purse redPurse = new Purse(new Red());
        Purse bluePurse = new Purse(new Blue());
        Purse anotherBluePurse = new Purse(new Blue());
        Purse YetAnotherBluePurse = new Purse(new Blue());


        List<Purse> purses = new ArrayList<>();
        purses.add(redPurse);
        purses.add(bluePurse);
        purses.add(anotherBluePurse);
        purses.add(YetAnotherBluePurse);

        Filter blueFilter = new BlueFilter();
        Filter redFilter = new RedFilter();
        List<Purse> blueParses = blueFilter.meetFilter(purses);
        List<Purse> redParses = redFilter.meetFilter(purses);

        for (Purse purse : blueParses){
            String name= purse.getColour().getClass().getName();
            System.out.println("The Purse from the this list is "+ name.substring(name.lastIndexOf('.') + 1).toLowerCase());
        }

        for (Purse purse : redParses){
           String name= purse.getColour().getClass().getName();
            System.out.println("The Purse from the this list is "+ name.substring(name.lastIndexOf('.') + 1).toLowerCase());
        }
    }
}
