package utill;

import bean.Man;
import bean.VIPMain;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Descripetion:
 * User: WUHONGYUN
 * Date: 2023-01-01
 * Time: 12:07
 */
public class Taverse {
    public static void traverseArray(ArrayList<Man> ml){
        for (Man m:ml) {
            System.out.println(m);
        }
    }
}
