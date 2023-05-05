package BuilderPattern.Problem;

public class App {
    public static void main(String[] args) {
        OnlineStoreAccount osa = new OnlineStoreAccount(1L, "Manoj", "Palasiya", 500L, 10L);
        OnlineStoreAccount osa1 = new OnlineStoreAccount(2L, "Anuj", "sukhlia", 600L, 20L);
        System.out.println(osa);
        System.out.println(osa1);
    }
}