package CreationalPattern.BuilderPattern.Solution;

public class App {
    public static void main(String[] args) {
        OnlineStoreAccount osa = new OnlineStoreAccount.Builder()
                .withId(5L)
                .withName("Manoj")
                .withAddress("Palasiaya")
                .withBudget(500L)
                .withDiscountRate(10L)
                .build();

        System.out.println(osa.getId());
    }
}