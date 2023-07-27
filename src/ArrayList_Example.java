import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list=new ArrayList<>(10);
//
//        list.add(67);
//        list.add(98);
//        list.add(78);
//        list.add(89);
//        list.add(670);
//        list.add(67);
//        list.add(98);
//        list.add(78);
//        list.add(89);
//        list.add(670);
//        list.add(67);
//        list.add(98);
//        list.add(78);
//        list.add(89);
//        list.add(670);
//        list.add(67);
//        list.add(98);
//        list.add(78);
//        list.add(89);
//        list.add(670);
//        list.add(67);
//        list.add(98);
//        list.add(78);
//        list.add(89);
//        list.add(670);
//        System.out.println(list);

        // FOR INPUT
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));//pass index here, list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
