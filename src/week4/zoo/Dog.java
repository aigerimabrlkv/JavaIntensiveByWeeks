package week4.zoo;

import week4.zoo.Animal;

public class Dog extends Animal {
//    static{
//         count = 100;
//        System.out.println(getCount());
//    }
    public String name;
    public static int count;
    public Dog(String name){
       this.name= name ;

    }
    public void makeSound(){
        System.out.println(this.name + " barked!");
    }

//    public void bark(){
//        System.out.println(this.name + " barked!");
//        count ++;
//    }

//    public static int getCount(){
//        return count;
//    }
    //public
    //private--only inside the class
    //package-private default -- inside in same package
    //protected

}
