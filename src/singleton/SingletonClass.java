package singleton;

public final class SingletonClass {
    private static SingletonClass INSTANCE;
    private final String initiateVariableOnce;
    private String info = "Initial Info class";
    private SingletonClass(String s) {
        this.initiateVariableOnce = s;
    }

    public static SingletonClass getInstance(String s) {
        if(INSTANCE == null) {
            INSTANCE = new SingletonClass(s);
        }
        return INSTANCE;
    }

    protected String getInfo() {
        return info;
    }

   public String getInitiateVariableOnce() { return initiateVariableOnce;};


    public void setInfo(String info) {
        this.info = info;
    }
}
