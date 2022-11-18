
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class TestInheritance{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
d.eat();  
}}  
// #multilevel
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog{  
void weep(){System.out.println("weeping...");}  
}  
class TestInheritance2{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}  
// #heirarchical
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  
class TestInheritance3{  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();  
c.eat();  
//c.bark();//C.T.Error  
}}  
// #hybrid
public class ClassA 
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}
public class ClassB extends ClassA 
{
    public void show()
    {
        System.out.println("show() method of ClassB");
    }
    public void dispB()
    {
        System.out.println("disp() method of ClassB");
    }
}
public class ClassC extends ClassA
{
    public void show()
    {
        System.out.println("show() method of ClassC");
    }
    public void dispC()
    {
        System.out.println("disp() method of ClassC");
    }
}
public class ClassD extends ClassB,ClassC
{
    public void dispD()
    {
        System.out.println("disp() method of ClassD");
    }
    public static void main(String args[])
    {
          ClassD d = new ClassD();
          d.dispD();
          d.show();//Confusion happens here which show method to call
    }
}
public class Inhe {
    
}
