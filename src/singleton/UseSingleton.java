package singleton;

public class UseSingleton {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance("once");
        System.out.println(singletonClass.getInfo());

        SingletonClass singletonClass1 = SingletonClass.getInstance("twice");

        System.out.println(singletonClass1.getInfo()); //Initial class info

        SingletonClass singletonClass2 = SingletonClass.getInstance("thrice");
        singletonClass2.setInfo("New class info");

        System.out.println(singletonClass1.getInfo()); //New class info
        System.out.println(singletonClass2.getInfo()); //New class info

        System.out.println(singletonClass2.getInitiateVariableOnce()); //New class info
    }
}
