public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String firstName = ("Ivan");
        String middleName = ("Ivanovich");
        String lastName = ("Ivanov");
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println(" ");
        System.out.println("Task 2");
        System.out.println(fullName.toUpperCase());
        System.out.println(" ");
        System.out.println("Task 3");
        String fullName1 = ("Иванов Семён Семёнович");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName1.replace("ё","е"));


    }
}