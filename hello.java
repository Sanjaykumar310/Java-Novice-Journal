public class hello{
    public static void main (String[] args){
        System.out.println("Welcome to Java Programming");
        int a = 2;
        float b = 2.0f;
        char c ='2';
        boolean d = true;
        String e = "hey buddy";


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        


        //Declare two integers and print their sum.

        int a1 = 12;
        int b1 = 13;

        int sum = a1+b1;

        System.out.println(sum);

        //Given two numbers a = 20, b = 10, print:

        int A = 20;
        int B = 10;

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);


        //Write a program to calculate the area of a rectangle.

        int length = 10;
        int breadth = 10;

        int area = length*breadth;

        System.out.println(area);

        //Find Simple Interest.

        int P = 12;
        int T = 12;
        int R = 12;

        int SI = (P * T * R) / 100;

        System.out.println(SI);

        //LEVEL 3: Relational Operators 7️⃣ Compare Two Numbers

        int first = 20;
        int second = 45;

        

        System.out.println(first  > second);
        System.out.println(first == second);

        //Voting Eligibility

        int age = 18;

        System.out.println(age >= 18);

        //Logical Operators

        int Age = 18;

        if(Age < 0 || Age == 0){
            System.out.println("negative or positive");
        }
        else{
            System.out.println("positive");
        }

        //Unary & Assignment Operators

        int in = 10;

        System.out.println(in++);
        System.out.println(++in);
        System.out.println(in--);
        System.out.println(--in);

        //1️⃣2️⃣ Assignment Operators

        int A1 = 10;

        System.out.println( A1 += 5);
        System.out.println( A1 -= 3);
        System.out.println( A1 *= 2);
        System.out.println( A1 /= 4);

        //Mixed Operators

        int aa = 10;
        int bb = 5;
        int cc = aa + bb * 2;
        System.out.println(cc);


        //swaptonumbers

        int c1 = 14;
        int c2 = 15;

       c1 = c1+c2;
       c2 = c1-c2;
       c1 = c1-c2;

        System.out.println("after : c1 "+c1+" c2 = "+c2);


        //even or odd

        int aA = 12;

        if(aA % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }


        

    }
}