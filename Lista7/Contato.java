package Lista7;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Contato {
    private String nome;
    private String email;
    private String cell;
    private LocalDate dataNasc;
    private static int totalContatos = 0;

    public Contato(String nome, String email, String cell, LocalDate dataNasc) {
        this.nome = nome;
        this.email = email;
        this.cell = cell;
        this.dataNasc = dataNasc;
        totalContatos++;
    }

    public void printContato() {
        System.out.println("Full Name: " + nome);
        System.out.println("Email Address: " + email);
        System.out.println("Phone Number: " + cell);
        System.out.println("Birth Date: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataNasc));
    }

    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - dataNasc.getYear();

        if (currentDate.getMonthValue() < dataNasc.getMonthValue()
                || (currentDate.getMonthValue() == dataNasc.getMonthValue() && currentDate.getDayOfMonth() < dataNasc.getDayOfMonth()))
            age--;

        return age;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCell() {
        return cell;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public static void mostrarTotalContatos() {
        System.out.println("Total de contatos na agenda: " + totalContatos);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Numero telefone: ");
        String cell = scanner.nextLine();

        System.out.print("Data do nascimento (Exemplo: dd/MM/yyyy): ");
        String dataNascStr = scanner.nextLine();

        LocalDate dataNasc = LocalDate.parse(dataNascStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Contato contato = new Contato(nome, email, cell, dataNasc);

        System.out.println("\nInformações:");
        contato.printContato();

        Contato.mostrarTotalContatos(); 
        
        scanner.close();
    }
}
