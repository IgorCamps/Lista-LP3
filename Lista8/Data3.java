package Lista8;
import java.util.Scanner;

class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}

class Hora {
    private int hora;
    private int minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public String toString() {
        return String.format("%02d:%02d", hora, minuto);
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

    public boolean isEqual(DataHora outroObjeto) {
        return this.toString().equals(outroObjeto.toString());
    }

    public boolean isGreater(DataHora outroObjeto) {
        return this.toString().compareTo(outroObjeto.toString()) > 0;
    }

    public boolean isLower(DataHora outroObjeto) {
        return this.toString().compareTo(outroObjeto.toString()) < 0;
    }
}

public class Data3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data (dd/mm/yyyy): ");
        String dataStr = scanner.nextLine();
        String[] dataParts = dataStr.split("/");
        int dia = Integer.parseInt(dataParts[0]);
        int mes = Integer.parseInt(dataParts[1]);
        int ano = Integer.parseInt(dataParts[2]);

        System.out.print("Digite a hora (hh:mm): ");
        String horaStr = scanner.nextLine();
        String[] horaParts = horaStr.split(":");
        int hora = Integer.parseInt(horaParts[0]);
        int minuto = Integer.parseInt(horaParts[1]);

        Data data = new Data(dia, mes, ano);
        Hora horaObj = new Hora(hora, minuto);
        DataHora dataHora = new DataHora(data, horaObj);

        System.out.println("Data e Hora inseridas: " + dataHora);

        scanner.close();
    }
}
