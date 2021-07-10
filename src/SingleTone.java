// Java program implementing Singleton class
// with getInstance() method
class Singleton {
    // static variable single_instance of type Singleton
    private static Singleton single_instance = null;

    // static method to create instance of Singleton class
    public static Singleton getInstance() {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }

    private Singleton() {}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Single tone class could not be cloned");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton singleton = Singleton.getInstance();

    }
}
