package utils;

public class year {
    public static boolean leap(double n) {
        if (n % 4 == 0 || (n % 100 == 0 && n % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int monthDays(int mes, int ano) {
        int diasNoMes = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasNoMes = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                diasNoMes = 30;
                break;

            case 2:
                if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                    diasNoMes = 29;
                } else {
                    diasNoMes = 28;
                }
                break;
        }
        return diasNoMes;
    }


    public static boolean validarData(int day, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (ano < 1) {
            return false;
        }
        if (day<1 || day>monthDays(mes,ano)){
            return false;
        }
        return true;
    }

    public static boolean validarData( int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (ano < 1) {
            return false;
        }
        return true;
    }
}



