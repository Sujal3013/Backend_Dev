package OOPS.collection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    enum Week{
        Mon,Tue,Wed,Thur,Fri,Sat,Sun;
        // these are enum constants
        // public,static and final
        // since its final you can create child enums
        // type is Week

        Week(){
            System.out.println("Constructor called for "+this);
        }
        // this is not public or protected,only private or default 
    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Week week;
        week=Week.Mon;
        for(Week day:Week.values()){
            System.out.println(day);
        }
    }
}
