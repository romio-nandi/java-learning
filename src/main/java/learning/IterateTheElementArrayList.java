package learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IterateTheElementArrayList {
    public static void main(String[] args) {
        List<Integer> insertingElement = new ArrayList<>();
        insertingElement.add(5);
        insertingElement.add(4);
        insertingElement.add(8);
        insertingElement.add(2);
        insertingElement.add(7);


        Collections.swap(insertingElement,0,3);
        Collections.swap(insertingElement,1,4);
        for(int i=0;i<insertingElement.size();i++){
            System.out.println(insertingElement.get(i));
        }

        }


    }

