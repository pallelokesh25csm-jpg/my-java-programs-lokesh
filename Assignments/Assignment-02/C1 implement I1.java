interface I1
{
    void display();
}

class C1 implements I1
{
    public void display()
    {
        System.out.println("C1 implements I1");
    }

    public static void main(String args[])
    {
        C1 obj = new C1();
        obj.display();
    }
}