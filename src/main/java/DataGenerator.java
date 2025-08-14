import com.github.javafaker.Faker;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

class DataGenerator {
    static Faker faker = new Faker(new Locale("ru"));

    private DataGenerator() {
    }

    static String cityForInput() {
        Random random = new Random();
        int rand = random.nextInt(12);
        String city[] = {"Архангельск", "Волгоград", "Калининград", "Воронеж", "Киров", "Кострома", "Краснодар",
                "Красноярск", "Липецк", "Курск", "Санкт-Петербург", "Москва", "Тамбов"};
        return city[rand];
    }

    static String cityNoVal() {
        Random random = new Random();
        int rand = random.nextInt(8);
        String cityNoVal[] = {"Лиски", "Каменка", "Бобров", "Павловск", "Икорецк", "Давыдовка", "Нововоронеж"};
        return cityNoVal[rand];
    }

    static String dataPhone() {
        String phone = faker.phoneNumber().phoneNumber();
        return phone;
    }

    static String dataName() {
        String name = faker.name().lastName();
        name = name + " " + faker.name().firstName();
        return name;
    }

    static String dataInput(int days) {
        String inputDate = LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.uuuu"));
        return inputDate;
    }

}
