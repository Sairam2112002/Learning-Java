package oops.inheritance;

public class InterfaceInheritance {
    interface Engine {
        void start();
        void stop();
    }

    interface Trunk {
        void open();
        void close();
    }

    /*
     * An interface can extend one or more interfaces
     */
    interface TurboEngine extends Engine {
        void activateTurbo();
    }

    interface Car extends Engine, Trunk {
        void startCar();
    }

    /*
     * B class can implement one more interfaces
     *
     * B class implementing an interface or multiple interfaces must implement abstract methods of all interfaces
     *
     * If a class is implementing an interface which is extending one or more interfaces,
     * then the class must implement abstract methods its parent interface and abstract methods of
     * parent interfaces of the class's parent interface
     */
    class DieselEngine implements Engine {
        private double temperature;

        // abstract method from Engine interface
        @Override
        public void start() {
            System.out.println("Engine starting");
        }
        @Override
        public void stop() {
            System.out.println("Engine stopping");
        }
    }
    class PetrolEngine implements Engine, Trunk {
        private double temperature;

        // abstract methods from Engine interface
        @Override
        public void start() {

        }
        @Override
        public void stop() {

        }

        // abstract methods from Trunk interface
        @Override
        public void open() {

        }
        @Override
        public void close() {

        }
    }

    /*
     * If a class or interface is implementing or extending multiple interfaces and all the interfaces contain
     * the same abstract method, then the child class can just override that abstract method once
     * and there is no need of overriding in child interface
     *
     * If a class or interface is implementing or extending multiple interfaces and all the interfaces
     * contain default methods with same signature,
     * then the child class and child interface must choose which implementation to use or use a custom implementation
     *
     * If a class is implementing multiple interfaces and all the interfaces contain static methods with same
     * signature, then there will be no problem because static methods are called using its class or interface name
     * hence they will be distinguished using the interface name
     * Even if we create a same static method in the subclass,
     * that method is specific to the subclass and do not interact with the parent interfaces
     *
     * Static methods in the interfaces are not inherited by child classes i.e.
     * method hiding is not possible in interface inheritance, we have to worry only about abstract and
     * default method in inheritance from interfaces
     */

    interface A {
        void abstractMethod();

        default void defaultMethod() {
            System.out.println("This is a default method in interface A");
        }

        static void staticMethod() {
            System.out.println("This is a static method in interface A");
        }
    }

    interface B {
        void abstractMethod();

        default void defaultMethod() {
            System.out.println("This is a default method in interface B");
        }

        static void staticMethod() {
            System.out.println("This is a static method in interface B");
        }
    }

    interface D extends A, B {
        /*
         * Since, both the parent interfaces A and B contains same default method, we have to override it and choose
         * the implementation
         *
         * This solves the multiple inheritance problem in Java
         */
        @Override
        default void defaultMethod() {
            A.super.defaultMethod();
            B.super.defaultMethod();
        }
    }

    class C implements A, B {
        @Override
        public void abstractMethod() {
            System.out.println("Implemented the same abstract method from interfaced A and B");
        }

        /*
         * Since, both the parent interfaces A and B contains same default method, we have to override it and choose
         * the implementation
         *
         * This solves the multiple inheritance problem in Java
         */
        @Override
        public void defaultMethod() {
            A.super.defaultMethod(); // or
            B.super.defaultMethod(); // or any custom implementation
        }
    }

}


