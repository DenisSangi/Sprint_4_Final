//Просто добавлю комментарий чтобы были изменения для Пулл Реквеста
public class Praktikum {

    private static String name = "weedqwefer";

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */

        Account account = new Account(name);
        boolean isNamePrintable = account.checkNameToEmboss();
        System.out.println(isNamePrintable);
    }

}