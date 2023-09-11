public class Test {
    public static void main(String[] args) {
        String str = "hello";
        char ch = 'w';
        char ch2 = 'z';
        int num = 4;
        double dbl = 2.5;

        System.out.println("string + char ");
        System.out.println(str + ch);
        System.out.println((str + ch).getClass().getSimpleName());

//        System.out.println("boolean + boolean ");
//        System.out.println(true + false);
//        System.out.println((true + false).getClass().getSimpleName());


//        System.out.println("boolean + char ");
//        System.out.println(true + ch);
//        System.out.println((true + ch).getClass().getSimpleName());


//        System.out.println("boolean + int ");
//        System.out.println(true + num);
//        System.out.println((str + ch).getClass().getSimpleName());



//        System.out.println("boolean + dbl ");
//        System.out.println(true + dbl);
//        System.out.println((true + dbl).getClass().getSimpleName());

//        System.out.println("boolean + string ");
//        System.out.println(true + str);
//        System.out.println((true + str).getClass().getSimpleName());


//        System.out.println("char + boolean");
//        System.out.println(ch + true);
//        System.out.println((ch + true).getClass().getSimpleName());


        System.out.println("char + char");
        System.out.println(ch + ch2);
        System.out.println(Integer.valueOf(ch + ch2).getClass().getSimpleName());


        System.out.println("char + int");
        System.out.println(ch + 5);
        System.out.println(Integer.valueOf(ch + 5).getClass().getSimpleName());


        System.out.println("char + double");
        System.out.println(ch + dbl);
        System.out.println(Double.valueOf(ch + dbl).getClass().getSimpleName());


        System.out.println("char + string");
        System.out.println(ch + str);
        System.out.println((ch + str).getClass().getSimpleName());


//        System.out.println("int + boolean");
//        System.out.println(num + false);
//        System.out.println((num + false).getClass().getSimpleName());


        System.out.println("int + char");
        System.out.println(num + ch);
        System.out.println(Integer.valueOf(num + ch).getClass().getSimpleName());


        System.out.println("int + int");
        System.out.println(num + 6);
        System.out.println(Integer.valueOf(num + 5).getClass().getSimpleName());


        System.out.println("int + double");
        System.out.println(num + dbl);
        System.out.println(Double.valueOf(num + dbl).getClass().getSimpleName());


        System.out.println("int + string");
        System.out.println(num + "dbl");
        System.out.println((num + "dbl").getClass().getSimpleName());


//        System.out.println("double + boolean");
//        System.out.println(dbl + true);
//        System.out.println((dbl + true).getClass().getSimpleName());


        System.out.println("double + char");
        System.out.println(dbl + ch);
        System.out.println(Double.valueOf(dbl + ch).getClass().getSimpleName());


        System.out.println("double + int");
        System.out.println(dbl + num);
        System.out.println(Double.valueOf(dbl + num).getClass().getSimpleName());


        System.out.println("double + double");
        System.out.println(dbl + 2.5);
        System.out.println(Double.valueOf(dbl + 2.5).getClass().getSimpleName());


        System.out.println("double + string");
        System.out.println(dbl + str);
        System.out.println((dbl + str).getClass().getSimpleName());


        System.out.println("string + boolean");
        System.out.println(str + false);
        System.out.println((str + false).getClass().getSimpleName());


        System.out.println("string + char");
        System.out.println(str + ch);
        System.out.println((str + ch).getClass().getSimpleName());


        System.out.println("string + int");
        System.out.println(str + num);
        System.out.println((str + num).getClass().getSimpleName());


        System.out.println("string + double");
        System.out.println(str + dbl);
        System.out.println((str + dbl).getClass().getSimpleName());


        System.out.println("string + strinf");
        System.out.println(str + "dbl");
        System.out.println((str + "dbl").getClass().getSimpleName());


        char ch3 = 'a';
        System.out.println("ch3 'a'++  " + (ch3++));
        System.out.println("ch3 'a' + 1 " +  (ch3 + 1));


        System.out.println(" ''  + 5 ");
        System.out.println("" + 5);
        System.out.println(("" + 5).getClass().getSimpleName());

    }
}