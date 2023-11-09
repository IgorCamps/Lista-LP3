package Lista8;
import java.util.Scanner;

public class Data {
    private int day;
    private int month;
    private int year;

    public Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public boolean isEqual(Data otherDate) {
        return this.day == otherDate.day && this.month == otherDate.month && this.year == otherDate.year;
    }

    public boolean isGreather(Data otherDate) {
        if (this.year > otherDate.year) {
            return true;
        } else if (this.year == otherDate.year && this.month > otherDate.month) {
            return true;
        } else if (this.year == otherDate.year && this.month == otherDate.month && this.day > otherDate.day) {
            return true;
        }
        return false;
    }

    public boolean isLower(Data otherDate) {
        if (this.year < otherDate.year) {
            return true;
        } else if (this.year == otherDate.year && this.month < otherDate.month) {
            return true;
        } else if (this.year == otherDate.year && this.month == otherDate.month && this.day < otherDate.day) {
            return true;
        }
        return false;
    }
}

class Hora {
    private int hour;
    private int minute;
    private int second;

    public Hora(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public boolean isEqual(Hora otherTime) {
        return this.hour == otherTime.hour && this.minute == otherTime.minute && this.second == otherTime.second;
    }

    public boolean isGreather(Hora otherTime) {
        if (this.hour > otherTime.hour) {
            return true;
        } else if (this.hour == otherTime.hour && this.minute > otherTime.minute) {
            return true;
        } else if (this.hour == otherTime.hour && this.minute == otherTime.minute && this.second > otherTime.second) {
            return true;
        }
        return false;
    }

    public boolean isLower(Hora otherTime) {
        if (this.hour < otherTime.hour) {
            return true;
        } else if (this.hour == otherTime.hour && this.minute < otherTime.minute) {
            return true;
        } else if (this.hour == otherTime.hour && this.minute == otherTime.minute && this.second < otherTime.second) {
            return true;
        }
        return false;
    }
}

class DataHora {
    private Data data;
    private Hora hora;

    public DataHora(Data data, Hora hora) {
        this.data = data;
        this.hora = hora;
    }

    public String toString() {
        return data.toString() + " " + hora.toString();
    }

    public boolean isEqual(DataHora otherObject) {
        return this.data.isEqual(otherObject.data) && this.hora.isEqual(otherObject.hora);
    }

    public boolean isGreather(DataHora otherObject) {
        if (this.data.isEqual(otherObject.data)) {
            return this.hora.isGreather(otherObject.hora);
        }
        return this.data.isGreather(otherObject.data);
    }

    public boolean isLower(DataHora otherObject) {
        if (this.data.isEqual(otherObject.data)) {
            return this.hora.isLower(otherObject.hora);
        }
        return this.data.isLower(otherObject.data);
    }

}

class Date{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crie objetos Data
        Data data1 = new Data(8, 11, 2023);
        Data data2 = new Data(9, 11, 2023);

        // Crie objetos Hora
        Hora hora1 = new Hora(12, 30, 0);
        Hora hora2 = new Hora(10, 15, 0);

        // Crie objetos DataHora
        DataHora dataHora1 = new DataHora(data1, hora1);
        DataHora dataHora2 = new DataHora(data2, hora2);

        System.out.println("Data e Hora 1: " + dataHora1.toString());
        System.out.println("Data e Hora 2: " + dataHora2.toString());

        System.out.println("DataHora 1 é igual a DataHora 2: " + dataHora1.isEqual(dataHora2));
        System.out.println("DataHora 1 é maior que DataHora 2: " + dataHora1.isGreather(dataHora2));
        System.out.println("DataHora 1 é menor que DataHora 2: " + dataHora1.isLower(dataHora2));

        scanner.close();
    }
}