import book.BookList;
import user.AdminPanel;
import user.Ope;

import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-09-03
 * Time: 9:42
 */
public class TestMain {
    public static void main(String[] args) {
        BookList bks = new BookList();
        Ope pt = new Ope();
        pt.indexPrint();
        pt.choosePanel();
        pt.psonPanel();
    }
}
