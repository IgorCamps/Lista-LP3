import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Contato {
    private String nome;
    private String email;
    private String cell;
    private LocalDate dataNasc;

    public Contato(String nome, String email, String cell, LocalDate dataNasc) {
        this.nome = nome;
        this.email = email;
        this.cell = cell;
        this.dataNasc = dataNasc;
    }

    public void printnContato() {
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

    public String getnome() {
        return nome;
    }

    public String getemail() {
        return email;
    }

    public String getcell() {
        return cell;
    }

    public LocalDate getdataNasc() {
        return dataNasc;
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

        Contato Contato = new Contato(nome, email, cell, dataNasc);

        System.out.println("\nInformações:");
        Contato.printnContato();

        scanner.close();
    }
}
