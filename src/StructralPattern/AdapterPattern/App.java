package StructralPattern.AdapterPattern;

public class App {
    public static void main(String[] args) {
        LegacyBankAccount legacyBankAccount = new LegacyBankAccount(1, "Anuj Tiwari");
        PersonalInfoDB personalInfoDB = new PersonalInfoDB();
        personalInfoDB.setName("Anuj Tiwari");
        personalInfoDB.setEmail("anuj@tiwari.com");
        personalInfoDB.setAmount(1000L);
        BankAccountAdapter bankAccountAdapter = new BankAccountAdapter(legacyBankAccount,personalInfoDB);
        AccountCreationService accountCreationService = new AccountCreationService(bankAccountAdapter.getId(), bankAccountAdapter.getName(), bankAccountAdapter.getEmail(), bankAccountAdapter.getAmount());
        accountCreationService.createAccount();
    }
}
