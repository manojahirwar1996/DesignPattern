package StructralPattern.AdapterPattern;

public class LegacyBankAccount{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LegacyBankAccount(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
