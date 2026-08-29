interface I2
{
    void show2();
}

interface I3
{
    void show3();
}

interface I1 extends I2, I3
{
    void show1();
}

class Demo implements I1
{
    public void show1()
    {
        System.out.println("I1 method");
    }

    public void show2()
    {
        System.out.println("I2 method");
    }

    public void show3()
    {
        System.out.println("I3 method");
    }

    public static void main(String args[])
    {
        Demo d = new Demo();

        d.show1();
        d.show2();
        d.show3();
    }
}