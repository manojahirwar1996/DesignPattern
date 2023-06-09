package StructralPattern.AdapterPattern;

public class BankAccountAdapter implements BankAccountInfo {
    LegacyBankAccount instance;
    PersonalInfoDB dbConnection;

    public BankAccountAdapter(LegacyBankAccount instance, PersonalInfoDB dbConnection) {
        this.instance = instance;
        this.dbConnection = dbConnection;
    }

    @Override
    public int getId() {
        return instance.getId();
    }

    @Override
    public String getName() {
        return instance.getName();
    }

    @Override
    public String getEmail() {
        return dbConnection.getEmail();
    }

    @Override
    public Long getAmount() {
        return dbConnection.getAmount();
    }
}
