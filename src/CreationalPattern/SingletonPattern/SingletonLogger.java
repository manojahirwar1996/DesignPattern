package CreationalPattern.SingletonPattern;

public class SingletonLogger {

    //Eager Initialization
    private static SingletonLogger instance;
    private  SingletonLogger(){}

    public static synchronized SingletonLogger getInstance(){
        if(instance == null){
             instance = new SingletonLogger();
        }
        return instance;
    }

    public  void logMessageStart(){
        System.out.println("start message is logged");
    }
    public  void logMessageStop(){
        System.out.println("stop message is logged");
    }
}
