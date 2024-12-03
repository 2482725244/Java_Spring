/**
 * Created with Intellij IDEA.
 * Description:
 * User: 吴洪赟
 * Date: 2022-04-15
 * Time: 10:05
 */
import java.util.*;
public class TextDemo {
//    public static void main1(String[] args) {
//        int i = 0;
//        for(i = 0; i < 999999; i++) {
//            int n = i;
//            int cot = 0;
//            double sum = 0;
//            while(n != 0) {
//                n /= 10;
//                cot++;
//            }
//            n = i;
//            while(n != 0) {
//               double y = Math.pow((n % 10),cot);
//                sum += y;
//                n /= 10;
//            }
//            if(sum == i) {
//                System.out.println(i);
//            }
//        }
//    }


//    public static void main2(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int cot = 0;
//        while(a != 0) {
//            if(a % 2 == 1) {
//                cot++;
//            }
//            a /= 2;
//        }
//        System.out.println(cot);
//    }

//    public static void main3(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        while(a != 0) {
//            System.out.println(a % 10);
//            a /= 10;
//        }
//    }
//    public static void main4(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
////        int a = 9;
//        int cot = 0;
//        while(a != 0) {
//            if((a & 1) == 1) {
//                cot++;
//            }
//            a = a >> 1;
//        }
//        System.out.println(cot);
//    }
//
//    public static void main5(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int cot = 0;
//        while(n != 0) {
//            cot++;
//            n = n & (n - 1);
//        }
//        System.out.println(cot);
//    }
//    public static int maxNum(int a, int b, int c) {
//        int tmp = a > b ? a : b;
//        return tmp > c ? tmp : c;
//    }
//
//
//    public static void main2(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a= scan.nextInt();
//        int b= scan.nextInt();
//        int c= scan.nextInt();
//        int ret = maxNum(a, b, c);
//        System.out.println(ret);
//    }
//    public static void main(String[]args){
//            int a = 8;
//            int b = 6;
//            int c = 10;
//            int ret = add(a, b, c);
//            int ret2 = add(a, c);
//            double d1 = 1.3;
//            double d2 = 2.6;
//            double ret3 = add(d1, d2);
//        System.out.println(ret+" "+ret2+" "+ret3+" ");
//        }
//    public static int add(int x, int y, int z) {
//        return x + y + z;
//    }
//    public static int add(int x, int y) {
//        return x + y;
//    }
//    public static double add(double x, double y) {
//        return x + y;
//    }
//    public static int sum(int n) {
//        if(n == 1) {
//            return 1;
//        } else{
//            return n + sum(n - 1);
//        }
//    }
//    public static void fun(int n) {
//        if(n < 10) {
//            System.out.println(n);
//        } else {
//            fun(n / 10);
//            System.out.println(n % 10);
//        }
//    }
//
//    public static int sum2(int n) {
//        if(n < 10) {
//            return n;
//        } else {
//            int y = n % 10;
//            return y + sum2(n / 10);
//        }
//    }
//
//
//    public static int fx(int n) {
//        if(n == 1 || n == 2) {
//            return 1;
//        } else {
//            return fx(n -1) + fx(n - 2);
//        }
//    }
//    public static int func(int n) {
//        if(n == 1) {
//            return 1;
//        } else {
//            return n * func(n - 1);
//        }
//
//    }
//    public static void print(int n) {
//        if(n < 10) {
//            System.out.println(n);
//        } else {
//            print(n / 10);
//            System.out.println(n % 10);
//        }
//    }
//    public static int sumNum(int n) {
//        if(n < 10) {
//            return n;
//        } else {
//            int y = n % 10;
//            return y + sumNum(n / 10);
//        }
//    }
//    public static int fbnc(int n) {
//        if(n == 1 || n == 2) {
//            return 1;
//        } else {
//            return fbnc(n - 1) + fbnc(n - 2);
//        }
//    }
//    public static void main(String[] args) {
//        int n = 30;
//        //int ret = sum(5);
//        //fun(n);
//        //int ret = sum2(n);
//        //System.out.println(ret);
//        //int ret = fx(n);
//        //int ret = func(5);
//        //System.out.println(ret);
//        //print(1234);
//        //int ret = sumNum(12345);
//        int ret = fbnc(3);
//        System.out.println(ret);
//    }
//    public static void main(String[] args) {
//        int n = 100;
//        int i = 0;
//        int a = 0;
//        int sum = 0;
//        for(i = 1; i <= n; i++) {
//            int ret = a + i;
//            a = ret;
//            sum += ret;
//        }
//        System.out.println(sum);
//    }
//    public static void main(String[] args) {
//        //int[] arrays1 = {1,2,3};
//        //int[] array2 = new int[3];
//        int[] array3 = new int[]{1,2,3,4};
//        int ret = array3.length;
//        String s = Arrays.toString(array3);
//        System.out.println(s);
//        System.out.println(ret);
//    }
//    public static void change(int[] arr) {
//        arr[0] = arr[0] * 10;
//        arr[1] = arr[1] * 10;
//    }
//
//    public static void main(String[] args) {
//        int[] arrays = new int[]{1,2,3,4,5};
//        //change(arrays);
//        //String s = Arrays.toString(arrays);
//        //System.out.println(s);
//        for (int vla:arrays) {
//            System.out.println(vla);
//        }
//    }
//    public static int[] cpy(int[] arr1) {
//        int[] arr2 = new int[arr1.length];
//        for(int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }
//        return arr2;
//    }
//    public static int maxNum(int[] arr) {
//        int max = arr[0];
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//     public static int find(int[] arr, int key) {
//        int l = 0;
//        int r = arr.length - 1;
//        while(l<=r) {
//            int mid = (l + r) / 2;
//            if(arr[mid] > key) {
//                r = mid + 1;
//            } else if(arr[mid] < key) {
//                l = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//     }
//     public static boolean isUp(int[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             if(arr[i - 1] > arr[i]) {
//                 return false;
//             }
//         }
//         return true;
//     }
//    public static void main(String[] args) {
//        int[] arrays1 = new int[]{12, 23, 34, 45};
//        int[] arrays2 = new int[]{12, 23, 34, 45, 1};
//        int[] arrays3 = new int[6];
//        Arrays.copyof();
//        System.arraycopy();
//        //int[] a = arrays2.clone();
//        //System.out.println(Arrays.toString(a));
//        //Arrays.sort(arrays2);
//        //System.out.println(Arrays.toString(arrays2));
//        //boolean b = Arrays.equals(arrays1,arrays2);
//        //System.out.println(b);
//        //Arrays.fill(arrays3,2,5,1);
//        //System.out.println(Arrays.toString(arrays3));
//        //int[] arrays2 = new int[4];
//        //int[] arrays2 = cpy(arrays1);
//        //String s1 = Arrays.toString(arrays1);
//        //String s2 = Arrays.toString(arrays2);
//        //System.out.println(s1);
//        //System.out.println(s2);
//        //int max = maxNum(arrays1);
//        //boolean b = isUp(arrays1);
//        //int ret = find(arrays1, 23);
//        //System.out.println(ret);
//        //System.out.println(b);
//    }
    public static void main(String[] args) {
//        int a1[][] = {{1,2,3},{3,4,5}};
//        int a2[][] = new int[][]{{1,2,3},{4,5,6}};
//        int a3[][] = new int[2][3];
//        int a4[][] = new int[2][];
//         for(int i = 0; i < a1.length; i++) {
//             for (int j = 0; j < a1[i].length; j++) {
//                 System.out.print(a1[i][j] + " ");
//             }
//             System.out.println();
//         }
//        for (int[] x:a1) {
//            for (int y:x) {
//                System.out.print(y + " ");
//            }
//            System.out.println();
//        }
//    a4[1] = new int[3];
//    a4[0] = new int[2];
//    a4[1][2] = 3;
//        for (int[] x:a4) {
//            for (int y:x) {
//                System.out.print(y + " ");
//            }
//            System.out.println();
//        }
//        int b1[] = new int[10];
//        int b2[] = new int[10];
//        int sum = 0;
//        int sum1 = 0;
//        int sum2 = 0;
//        int cot = 0;
//        int a[] = new int[]{1,1,2,2,3,4};
//        for (int i = 0; i < a.length; i++) {
//            sum ^= a[i];
//        }
//        int n = sum;
//        for (int i = 0; i < 32; i++) {
//            cot++;
//            if(n % 2 == 1) {
//                break;
//            }
//            n /= 2;
//        }
//        int p = 0;
//        int q = 0;
//        for(int i = 0; i < a.length; i++)
//        {
//            int m = 0;
//            for(int j = 0; j < cot - 1; j++) {
//                m = a[i];
//                m /= 2;
//            }
//            if(m % 2 == 1)
//            {
//                b1[p] = a[i];
//                p++;
//            }
//            else {
//                b2[q] = a[i];
//                q++;
//            }
//        }
//        for (int i = 0; i < 10; i++) {
//            sum1 ^= b1[i];
//            sum2 ^= b2[i];
//        }
//        System.out.println(sum1);
//        System.out.println(sum2);

    }
}
