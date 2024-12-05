public class Main {
    public static String findLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return year + " год - високосный";
        } else {
            return year + " год - невисокосный";
        }
    }

    public static String calculateDeviceVersion(int phoneType, int phoneAge) {
        if (phoneType == 1) {
            if (phoneAge < 2024) {
                return "Установите облегченную версию приложения для Android по ссылке";
            } else {
                return "Установите версию приложения для Android по ссылке";
            }
        } else {
            if (phoneAge < 2024) {
                return "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                return "Установите версию приложения для iOS по ссылке";
            }
        }
    }
    public static void calculateDeliveryDistance(int distance) {
        if (distance <= 20) {
            System.out.println("Доставка займет сутки");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Доставка займет двое суток");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Доставка займет трое суток");
        } else if (distance > 100) {
            System.out.println("Доставки нет");
        }
    }


    public static void main(String[] args) {
        int year = 2024;
        System.out.println(findLeapYear(year));
        year = 1917;
        System.out.println(findLeapYear(year));
        int phoneType = 1;
        int phoneAge = 2017;
        System.out.println(calculateDeviceVersion(phoneType, phoneAge));
        int distance = 39;
        calculateDeliveryDistance(distance);
        distance = 106;
        calculateDeliveryDistance(distance);
    }
}