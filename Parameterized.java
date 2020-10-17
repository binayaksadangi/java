package com.Ansh;

public class Parameterized
{
    int a,b;
    String m,n;
    float c,d;
    Parameterized(int x,int y)
    {
        a = x;b = y;
        System.out.println("Before swapping a: " + a + " and b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a: " + a + " and b: " + b+"\n");
    }
    Parameterized(String u,String v)
    {
        m=u;n=v;
        System.out.println("Before swapping m: " + m + " and n: " + n);
        String temp;
        temp=m;
        m=n;
        n=temp;
        System.out.println("After swapping m: " + m + " and n: " + n+"\n");
    }
    Parameterized(float g,float h)
    {
        c = g;d = h;
        System.out.println("Before swapping c: " + c + " and d: " + d);
        c = c + d;
        d = c - d;
        c = c - d;
        System.out.println("After swapping c: " + c + " and d: " + d+"\n");
    }

    public static void main(String[] args) {
        Parameterized p1=new Parameterized(3,4);
        Parameterized p2=new Parameterized("Hii...","Bye...");
        Parameterized p3=new Parameterized((float)5.3,(float)2.4);
    }
}
