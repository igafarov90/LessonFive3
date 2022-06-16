import org.junit.jupiter.api.Test;

public class StringTestClass {

   @Test
   void String() {

      //String name1;
      //String name2;

      String[] names;
      names = new String[3];

      String name[] = new String[3];
      int[] arr = new int[10];

      name[0] = "Vaasya";
      name[1] = "Petya";
      name[2] = "Ilgiz";

      System.out.println(name[0]);
      System.out.println(name[2]);

      arr[3] = 15;
      arr[3] = 10;
      System.out.println(arr[3]);
      System.out.println();

      String s = "Hello world";
      System.out.println(s.equals("Hello world"));
      System.out.println(s.equals("Hello"));

      String s2 = "Hello";
      System.out.println(s2.equals(s));

      System.out.println();


      s = "text";
      s2 = "TEXT";
      // equals - сравнение для типа String
      System.out.println(s.equals(s2));
      // equalsIgnoreCase сравнение без учета регистра
      System.out.println(s.equalsIgnoreCase(s2));
      System.out.println();
      s = "TeXt";
      System.out.println(s);
      // toLowerCase - к нижнему регистру
      // toUpperCase - к верхнему регистру
      System.out.println(s.toLowerCase());
      System.out.println(s.toUpperCase());
      System.out.println();
      // charAt поиск символа по индексу в String
      System.out.println(s.charAt(0));
      System.out.println();
      // indexOf поиск с конкретного текста в строке
      System.out.println(s.indexOf("Xt"));
      System.out.println();

      s = "Hello world";
      // contains выводит булевое по наличию текста в строке
      System.out.println(s.contains("Hello"));
      System.out.println(s.contains("hello"));
      System.out.println();

      // lenght длина строки
      System.out.println(s.length());

      // endWith выводит булевое по концу строки
      // startWith выводит булевое по началу строки
      System.out.println(s.endsWith("ld"));
      System.out.println(s.startsWith("He"));

      System.out.println();

      s = "Hello,world";
      // split - разделение строки
      String[] string = s.split(",");
      System.out.println(string[0] + "!" + string[1] + "!");
      System.out.println(string[0]);
      System.out.println(string[1]);

      //формат строки
      String str = "My name is %s! I am %d years old!";
      int age = 31;
      String name1 = "Ilgiz";

      System.out.println((String.format(str, name1, age)));
      System.out.println(String.format(str, "Albert", 34));

      System.out.println();
      // извлечение числа из строки
      String age2 = "10";
      int j = Integer.parseInt(age2);
      System.out.println(j * 3);

      System.out.println();
      // substring - обрез строки
      s = "Hello, world";
      System.out.println(s.substring(1, 5));
      System.out.println(s.substring(7));
      System.out.println(s.substring(7, s.length() - 2));
      System.out.println();

      // конкатенация - объединение(слияние) строк

      String s3 = "Hello";
      String s4 = " world";
      String s5 = "!";
      String res;
      res = s3 + s4 + s5;
      System.out.println(res);

      res = s3.concat(s4).concat(s5);
      System.out.println(res);
   }
}

