/* class FinalVariableExample{
    final int MAX=100;

    void display(){
        System.out.println("Max Value: "+ MAX);
    }
    public static void main(String[] args) {
        FinalVariableExample obj=new FinalVariableExample();
        obj.display();
    }
}
*/

class parent{
    final void display(){
        System.out.println("Final method is in parent class.");
    }
}

class Child extends parent{
    /*void display(){                     // we cannot override final method
        System.out.println("Final method is in child class.");
    }*/
    
}
public class FinalVariableExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}



