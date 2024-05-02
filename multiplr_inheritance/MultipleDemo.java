public class MultipleDemo {

    public static void main(String[] args) {
        new VeryImportant() {

            @Override
            public void watchingReels() {
               
            }

            @Override
            public void rakhadpatti() {
                
            }

            @Override
            public void buyGrocery() {
              
            }

            @Override
            public void bringMilk() {
               
            }

            @Override
            public void bringDhania() {
                
            }
            
        };
    }
}

interface VeryImportant extends NotImportant{
    void buyGrocery();

    void bringMilk();

    void bringDhania();
}

interface NotImportant {
    void watchingReels();

    void rakhadpatti();
}

//////////////////////////////////////////  abstract class

abstract class A extends B{
    int a = 12;
    abstract void functionA();

}

abstract class B implements VeryImportant {

    int b = 45;

    abstract void functionB();

    @Override
    public void buyGrocery() {
        
    }

    

}

class C extends A {

    @Override
    void functionA() {
       
    }

    @Override
    void functionB() {
       
    }


    @Override
    public void bringMilk() {
        
    }

    @Override
    public void bringDhania() {
        
    }

    @Override
    public void watchingReels() {
        
    }

    @Override
    public void rakhadpatti() {
        
    }
    
}

class MainClass {
    public static void main(String[] args) {

    }
}


//////////////////////////////////////////////////////////////////////////


// mutiple inheritance

class A1{
    void dance1() {
        System.out.println("class A1 is Dancing");
    }
}

interface B1 {
    void dance2();
    
}

class C1 extends A1 implements B1,NotImportant{

    @Override
    public void dance2() {
       
    }

    @Override
    public void watchingReels() {
       
    }

    @Override
    public void rakhadpatti() {
        
    }
    
}

