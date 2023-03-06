import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day, month;
        String horoscope;

        while (true) {
            System.out.print("Digite a data de nascimento (ddmm): ");
            int date = scanner.nextInt();

            if (date == 9999) {
                break;
            }

            day = date / 100;
            month = date % 100;

            switch (month) {
                case 1:
                    if (day <= 20) {
                        horoscope = "Capricórnio";
                    } else {
                        horoscope = "Aquário";
                    }
                    break;
                case 2:
                    if (day <= 19) {
                        horoscope = "Aquário";
                    } else {
                        horoscope = "Peixes";
                    }
                    break;
                case 3:
                    if (day <= 20) {
                        horoscope = "Peixes";
                    } else {
                        horoscope = "Áries";
                    }
                    break;
                case 4:
                    if (day <= 20) {
                        horoscope = "Áries";
                    } else {
                        horoscope = "Touro";
                    }
                    break;
                case 5:
                    if (day <= 20) {
                        horoscope = "Touro";
                    } else {
                        horoscope = "Gêmeos";
                    }
                    break;
                case 6:
                    if (day <= 21) {
                        horoscope = "Gêmeos";
                    } else {
                        horoscope = "Câncer";
                    }
                    break;
                case 7:
                    if (day <= 22) {
                        horoscope = "Câncer";
                    } else {
                        horoscope = "Leão";
                    }
                    break;
                case 8:
                    if (day <= 22) {
                        horoscope = "Leão";
                    } else {
                        horoscope = "Virgem";
                    }
                    break;
                case 9:
                    if (day <= 22) {
                        horoscope = "Virgem";
                    } else {
                        horoscope = "Libra";
                    }
                    break;
                case 10:
                    if (day <= 22) {
                        horoscope = "Libra";
                    } else {
                        horoscope = "Escorpião";
                    }
                    break;
                case 11:
                    if (day <= 21) {
                        horoscope = "Escorpião";
                    } else {
                        horoscope = "Sagitário";
                    }
                    break;
                case 12:
                    if (day <= 21) {
                        horoscope = "Sagitário";
                    } else {
                        horoscope = "Capricórnio";
                    }
                    break;
                default:
                    horoscope = "Data de nascimento inválida.";
                    break;
            }

            System.out.println("Seu signo é " + horoscope + ".");
        }

        scanner.close();
    }
}
