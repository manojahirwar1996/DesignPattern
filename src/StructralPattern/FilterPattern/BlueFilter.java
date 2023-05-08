package StructralPattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class BlueFilter implements Filter {
    @Override
    public List<Purse> meetFilter(List<Purse> purses) {
        List<Purse> bluePurses = new ArrayList<>();

        for(Purse purse : purses){
            String name = purse.getColour().getClass().getName();
            if(name.substring(name.lastIndexOf('.') + 1).equalsIgnoreCase("blue")){
                bluePurses.add(purse);
            }
        }
        return bluePurses;
    }
}
