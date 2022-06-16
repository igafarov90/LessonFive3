import org.junit.jupiter.api.Test;

public class MathTestClass {
        @Test void Math() {

                int[] array = {15, 10, 100, 250, 565};
                System.out.println(array[0]);
                System.out.println(array[1]);
                System.out.println(array[2]);
                System.out.println();

                for (int i = 0; i < 5; i++) {
                        System.out.println(array[i]);
                }
                System.out.println();
                int[] arr2 = new int[15];
                for (int j = 0; j < 15; j++) {
                        arr2[j] = j * 10;
                        System.out.println(arr2[j]);
                }
                System.out.println();
                System.out.println(arr2.length);
                System.out.println(arr2[arr2.length - 1]);
                System.out.println();


                int a = 10;
                a = 10;
                a = 20;

                int b = a;
                int c, d;

                c = d = b;
                System.out.println(c + " " + d);

                a = 13;
                b = 5;
                System.out.println();
                System.out.println(a + b);
                System.out.println(a - b);
                System.out.println(a * b);
                System.out.println(a / b);

                double e = 15;
                double f = 7;
                System.out.println(e / f);
                System.out.println();

                System.out.println(a % b);

                a = b + c * d;
                System.out.println(a);

                a = (b + c) * d;
                System.out.println(a);

                a = 15;
                b = 10;

                System.out.println();

                System.out.println(a > b);
                System.out.println(a < b);
                System.out.println(a - 5 >= b);
                System.out.println(a - 5 <= b);
                System.out.println(a == b);
                System.out.println(a != b);
                System.out.println(a + 10 <= b + 15);
                System.out.println(!(a + 10 <= b + 15));
                System.out.println(!(false));
                System.out.println();

                int i = 0;
                i++; // i + 1
                System.out.println(i);
                i--; //i-1
                System.out.println(i);

                i = 5;
                System.out.println(i++);
                System.out.println(i);

                i = 3;
                a = i++;
                System.out.println(a);

                i = 3;
                a = ++i;
                System.out.println(a);
                System.out.println();

                a = 10;
                b = 20;
                System.out.println(a > b || a < b);// || or
                System.out.println(a > b || b > 30);

                System.out.println(a > b && a < b); // && and


                System.out.println(a > 5 && b == 20);

                System.out.println(!(!(a + 10 > 15 || b - 5 > 10 && a < b)));
                System.out.println();

                a = 9;
                System.out.println(Math.sqrt(a));
                System.out.println(Math.pow(a, 3));

                a = 10;
                a = a + 5;
                a = 10;
                a += 5; // a=a+5
                System.out.println(a);
                a -= 5;
                System.out.println(a);
                a *= 5;
                System.out.println(a);
                a /= 5;
                System.out.println(a);
                System.out.println();
                a %= 3; //a = a % 3 остаток от деления на 3
                System.out.println(a);
                a = 10;
                System.out.println(a % 3);
        }
    }
