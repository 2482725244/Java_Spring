/*
* @Author: Marte
* @Date:   2022-04-12 16:36:33
* @Last Modified by:   Marte
* @Last Modified time: 2022-04-14 20:25:25
*/
// import java.scanner
// public class Text {
//     public static void main(String[] args) {
//         scanner = new.scanner(System.in);
//         int a = scan();
//         System.out.println("hello");
//     }
// }
//

// import java.util.Scanner;
// public class Text {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int a = scan.nextInt();
//         System.out.println(a);
//     }
// }

// import java.util.Scanner;
// public class Text {
//     public static void main(String[] args) {
//         Scanner scan =new Scanner(System.in);
//         int b = scan.nextInt();
//         double c = scan.nextDouble();
//         String h = scan.next();
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(h);

//     }

// }

// import java.util.Scanner;
// public class Text {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int a = scan.nextInt();
//         if (a < 18) {
//             System.out.println("少年");
//         } else if (a > 19 && a < 28) {
//             System.out.println("青年");
//         } else if (a > 29 && a < 55) {
//             System.out.println("中年");
//         } else {
//             System.out.println("老年");
//         }

//     }
// }
//
//
// import java.util.Scanner;
// public class Text {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int i = 0;
//         int a = scan.nextInt();
//         for(i = 2; i < a; i++) {
//             if (a % i == 0) {
//                 System.out.println("不是素数");
//                 break;
//             }
//         }
//         if (i == a) {
//             System.out.println("是素数");
//         }

//     }
// }
//
// public class Text {
//     public static void main(String[] args) {
//         int i = 0;
//         int j = 0;
//         for(i = 2; i < 100; i++) {
//             for(j = 2; j < i; j++) {
//                 if(i % j == 0) {
//                     System.out.println(i);
//                     break;
//                 }
//             }
//         }
//     }
// }
// public class Text {
//     public static void main(String[] args) {
//         int i = 0;
//         for(i = 1000;i < 2000; i++) {
//             if(i % 4 == 0 && i % 100 != 0 ||i % 400 ==0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

// public class Text {
//     public static void main(String[] args) {
//         int i = 0;
//         int j = 0;
//         for(i = 1; i < 10; i++) {
//             for(j = 1; j <= i; j++) {
//                 System.out.print(i+"*"+j+"="+(i*j)+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// import java.util.Scanner;
// public class Text {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         while(scan.hasNextInt()) {
//             int a = scan.nextInt();
//             if (a < 18) {
//                 System.out.println("少年");
//             } else if (a > 19 && a < 28) {
//                 System.out.println("青年");
//             } else if (a > 29 && a < 55) {
//                 System.out.println("中年");
//             } else {
//                 System.out.println("老年");
//             }
//         }
//     }
// }

// import java.util.Scanner;
// public class Text {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("请输入两个整数");
//         int a = scan.nextInt();
//         int b = scan.nextInt();
//         int min = a > b ? b : a;
//         int i = 0;
//         for (i = min; i > 0; i--) {
//             if(a % i == 0 && b % i == 0) {
//                 System.out.println("他们中的最大公约数是:" + i);
//                 break;
//             }

//         }
//     }
// }

// public class Text {
//     public static void main(String[] args) {
//         int j = 0;
//         int n = 0;
//         double sum = 0;
//        for (j = 1; j <= 100; j++) {
//             if (j % 2 == 0) {
//                 n = -1;
//             } else {
//                 n = 1;
//             }
//             sum += 1.0 / j * n;
//         }
//         System.out.println(sum);
//     }
// }

/* public class Text {
    public static void main(String[] args) {
         int cot = 0;
         int i = 0;
         for (i = 1; i < 100; i++) {
            if (i % 10 == 9) {
                cot++;
            }
            if (i / 10 == 9) {
                cot++;
            }
         }
         System.out.println(cot);
    }
} */

public class Text {
	public static void main(String[] args) {
		int a = 0,b = 0,sum = 0;
		for (int i = 0; i < 100; i++) {
			a+=b;
			b=i+1;
			sum = sum+a+b;
		}
		System.out.println(sum);
	}
}








































