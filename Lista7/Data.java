package Lista7;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Month;

public class Data {
    private int day;
    private int month;
    private int year;

    public Data(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Data inválida.");
        }
    }

    public Data() {
        this(1, 1, 2000);
    }

    public Data(Data anotherDate) {
        this(anotherDate.day, anotherDate.month, anotherDate.year);
    }

    private static boolean isValidDate(int day, int month, int year) {
        if (year >= 2000 && year <= 2100 && month >= 1 && month <= 12) {
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                daysInMonth[1] = 29;
            }

            return day >= 1 && day <= daysInMonth[month - 1];
        }
        return false;
    }

    public void printDate() {
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }

    public void printDateInFull() {
        Month monthEnum = Month.of(month);
        System.out.printf("%02d de %s de %04d\n", day, monthEnum.toString().toLowerCase(), year);
    }

    public int howManyDaysUntilEndYear() {
        LocalDate currentDate = LocalDate.of(year, month, day);
        LocalDate endOfYear = LocalDate.of(year, Month.DECEMBER, 31);
        return (int) ChronoUnit.DAYS.between(currentDate, endOfYear);
    }

    public int howManyDaysUntilNextMonth() {
        LocalDate currentDate = LocalDate.of(year, month, day);
        LocalDate firstDayOfNextMonth = currentDate.plusMonths(1).withDayOfMonth(1);
        return (int) ChronoUnit.DAYS.between(currentDate, firstDayOfNextMonth);
    }

    public boolean isBisexto() {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public String dayOfWeek() {
        LocalDate currentDate = LocalDate.of(year, month, day);
        return currentDate.getDayOfWeek().toString();
    }

    public String dayToPrintShort() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public String dayToPrintLong() {
        Month monthEnum = Month.of(month);
        return String.format("%02d de %s de %04d", day, monthEnum.toString().toLowerCase(), year);
    }

    public boolean isBefore(Data anotherDate) {
        LocalDate date1 = LocalDate.of(this.year, this.month, this.day);
        LocalDate date2 = LocalDate.of(anotherDate.year, anotherDate.month, anotherDate.day);
        return date1.isBefore(date2);
    }

    public int daysBetween(Data anotherDate) {
        LocalDate date1 = LocalDate.of(this.year, this.month, this.day);
        LocalDate date2 = LocalDate.of(anotherDate.year, anotherDate.month, anotherDate.day);
        return (int) ChronoUnit.DAYS.between(date1, date2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int newDay, newMonth, newYear;

        do {
            System.out.print("Digite o dia: ");
            newDay = scanner.nextInt();

            System.out.print("Digite o mês: ");
            newMonth = scanner.nextInt();

            System.out.print("Digite o ano: ");
            newYear = scanner.nextInt();

            if (!isValidDate(newDay, newMonth, newYear)) {
                System.out.println("Data inválida. Por favor, tente novamente.");
            }
        } while (!isValidDate(newDay, newMonth, newYear));

        Data date1 = new Data(newDay, newMonth, newYear);

        Data date2 = new Data(10, 10, newYear);

        System.out.println("Data1 é anterior a Data2? " + date1.isBefore(date2));
        System.out.println("Quantos dias entre Data1 e Data2? " + date1.daysBetween(date2));
        System.out.println("Dia da semana de Data1: " + date1.dayOfWeek());
        System.out.println("Dias até o final do ano a partir de Data1: " + date1.howManyDaysUntilEndYear());
        System.out.println("Dias até o primeiro dia do próximo mês a partir de Data1: " + date1.howManyDaysUntilNextMonth());
        System.out.println("É ano bissexto? " + date1.isBisexto());
        System.out.println("Data1 no formato curto: " + date1.dayToPrintShort());
        System.out.println("Data1 no formato longo: " + date1.dayToPrintLong());

        scanner.close();
    }
}
