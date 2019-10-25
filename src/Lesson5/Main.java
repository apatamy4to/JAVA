package Lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович", "Руководитель отдела", "ivanov@gmail.com", "+7(999)123-12-12", 250000, 45);
        employees[1] = new Employee("Петров Петр Петрович", "Зам.руководителя", "petrov@gmail.com", "+7(999)123-11-11", 180000, 41);
        employees[2] = new Employee("Семенов Семен Петрович", "Старший специалист", "semenov@gmail.com", "+7(999)125-92-12", 110000, 35);
        employees[3] = new Employee("Гаврилов Иван Васильевич", "Ведущий специалист", "gavrilov@gmail.com", "+7(999)266-25-32", 150000, 40);
        employees[4] = new Employee(" Зубов Иван Иванов", "Стажер", "zybov@gmail.com", "+7(999)183-12-12", 60000, 24);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].info();
            }
        }
    }
}



