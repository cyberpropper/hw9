
public class Main {
    public static void main(String[] args) {
        String firstName = "Роман";
        String middleName = "Сергёёвич";
        String lastName = "Ладошкин";
        String fullName = lastName + " " + firstName + " " + middleName;
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameTrue.toUpperCase());


    }
}