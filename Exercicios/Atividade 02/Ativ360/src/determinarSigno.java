public class determinarSigno {
    public static String determinarSigno(String data) {
        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(2, 4));

        if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            return "Aquário";
        } else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)) {
            return "Peixes";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            return "Áries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
            return "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 21)) {
            return "Câncer";
        } else if ((mes == 7 && dia >= 22) || (mes == 8 && dia <= 22)) {
            return "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitário";
        } else {
            return "Capricórnio";
        }
    }
}
