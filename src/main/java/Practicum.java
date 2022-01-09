public class Practicum {

    public static void main(String[] args) {
        String name = "Тимоти Шаламе";
        Account account = new Account(name);
        if (account.checkNameToEmboss()){
            System.out.println(name + " можно использовать для печати на банковской карте");
        } else {
            System.out.println(name + " нельзя использовать для печати на банковской карте");
        }
    }
}
