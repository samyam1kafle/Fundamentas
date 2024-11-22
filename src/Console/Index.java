package Console;

/**
 * @Author : Samyam Kafle
 * @Portfolio : https://samyamkafle.com.np
 * @Project : JavaVariableAssignment
 * @CreatedDate : 22/11/2024, Friday
 **/
public class Index {
    private static int counter = 0;
    public Index() {
        super();
        counter = this.counter + 1;
    }
    private static final String VALUE= "JAVA";
    public static void init(){
        System.out.println(counter);
        initiaize();
    }
    private static void initiaize(){
        String message = "Welcome to the App! Hello World!";
        printWelcome(message);
    }

    protected static void printWelcome(String message){
        System.out.println(message.toUpperCase());
    }
}
