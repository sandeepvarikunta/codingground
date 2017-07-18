class HelloWorld{
    static int x = 5;
    int y = 15;
    public static void main (String []args)
    {
        HelloWorld Obj = new HelloWorld();
        System.out.println(x);
        System.out.println(HelloWorld.x);
        System.out.println(Obj.x);
        System.out.println(new HelloWorld().y);
        System.out.println(Obj.y);
        //System.out.println(HelloWorld.y);
        
    }
}
