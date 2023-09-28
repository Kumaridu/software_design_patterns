package lab2_iterator_plain;

import java.util.*;

public class SwimmersList
{
    private Vector slist= new Vector();
    
    public void addSwimmer( Swimmer swimmer){
        slist.addElement(swimmer);
    }
    
    public Vector getVector(){
        return slist;
    }
}
