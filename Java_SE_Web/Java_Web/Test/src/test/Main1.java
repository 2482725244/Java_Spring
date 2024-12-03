package test;

import bean.Baby;
import bean.Father;
import bean.Mother;
import beans.Family;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {

    private static List<Family> families;

    private static void init(){

        Father father1 = new Father("tom");
        Father father2 = new Father("job");
        Father father3 = new Father("jerry");

        Mother mother1 = new Mother("lucy");
        Mother mother2 = new Mother("amy");
        Mother mother3 = new Mother("judy");

        Baby baby1 = new Baby("baby1");
        Baby baby2 = new Baby("baby2");
        Baby baby3 = new Baby("baby3");

        Family family1 = new Family(father1,mother1,baby1);
        Family family2 = new Family(father2,mother2,baby2);
        Family family3 = new Family(father3,mother3,baby3);

        families = new ArrayList<>();

        families.add(family1);
        families.add(family2);
        families.add(family3);

        System.out.println("Information for all families:");
        for (Family f : families){

            System.out.println(f);
        }




    }


    public static void main(String[] args) {


        init();

        Scanner scanner = new Scanner(System.in);
        String s = null;

        do {
            System.out.println("please input the baby's name:");
            s = scanner.nextLine();
            for (Family f : families){
                if(f.baby.name.equals(s)){

                    System.out.println(f.baby.name+"'s"+" father is "+f.father.name+", mother is "+f.mother.name+".");

                }
            }

        }while (!s.equals("q"));




    }



}
