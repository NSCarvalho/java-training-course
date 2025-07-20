package classes;

import java.util.Scanner;

public class OuterClassMain {


    public static void main(String[] args) {

        // Instancia StaticInnerClass
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        staticInnerClass.printClassName();

        // Instanciar OuterClass
        OuterClass outerClass = new OuterClass();
        outerClass.printClassName();

        // Instanciar InnerClass
        // OuterClass.InnerClass innerClass1 = new OuterClass.InnerClass(); NOT ALLOWED
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printClassName();

        // Instanciar PrivateInnerClass
        //OuterClass.PrivateInnerClass NOT ALLOWED
        outerClass.printPrivateClassName();
    }

}
