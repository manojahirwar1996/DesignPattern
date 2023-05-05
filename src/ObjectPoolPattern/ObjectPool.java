package ObjectPoolPattern;
import java.util.Hashtable;

public abstract  class ObjectPool<T> {
    private Hashtable<T, Boolean> checkedIn = new Hashtable<>();

    public abstract T create();
    public synchronized   void checkedOut(T t){
        checkedIn.put(t,false);
    }
    public synchronized T checkedIn(){
        for(T t : checkedIn.keySet()){
            if(checkedIn.get(t)){
                return t;
            }
        }
return null;
    }
}
