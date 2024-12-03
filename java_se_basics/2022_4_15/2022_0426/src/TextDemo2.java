/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * 主题：抽象类
 * Date: 2022-04-27
 * Time: 11:56
 */


abstract class FuBei {
    public int a = 6;
    public abstract void fx();
}

abstract class FeiXiang extends FuBei{
//        public void fx() {
//                System.out.println("Hui Fei");
//        }
}

class BuZhuo extends FuBei {
        public void fx() {
                System.out.println("Hui Chi");
        }
}

class PaoBu extends FuBei {
        public void fx() {
                System.out.println("Hui Pao");
        }
}

public class TextDemo2 {
        public static void main(String[] args) {
//                PaoBu s1 = new PaoBu();
//                System.out.println(s1.a);
//                FuBei s1 = new PaoBu();
//                s1.fx();
//                FuBei[] saa = {new PaoBu(), new BuZhuo()};
//                for (FuBei ps:saa) {
//                        ps.fx();
//                }

        }
}
