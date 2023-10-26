package Lista5;
import java.util.*;

public class Contato{
    private String Nome, Email, Telefone, dNascimento;

    Contato(String Nome, String Email, String Telefone, String dNascimento){
       if(validaNome(Nome))
           this.Nome = Nome;
       else
           this.Nome = "";
       if(validaEmail(Email))
           this.Email = Email;
       else
           this.Email = "";
       if(validaData(dNascimento))
           this.dNascimento = dNascimento;
       else
           this.dNascimento = "";
       if(validaNumero(Telefone))
           this.Telefone = Telefone;
       else
           this.Telefone = "";
    }

    public void inicializaContato(){
        Email = "NONE";
        Telefone = "NONE";
        Nome = "NONE";
        dNascimento = "00/00/0000";
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    public void setTelefone(String Telefone){
        this.Telefone = Telefone;
    }
    public void setDNascimento(String dNascimento){
        this.dNascimento = dNascimento;
    }

    public String getNome(){return Nome;}
    public String getEmail(){return Email;}
    public String getTelefone(){return Telefone;}
    public String getDNascimento(){return dNascimento;}

    private boolean validaEmail(String Email){
        return Email.contains("@") && (Email.contains(".com") || Email.contains(".br"));
    }
    private boolean validaNome(String Nome){
       return Nome.matches("[A-Z][a-z]{1,}");
    }

    public static boolean validaNumero(String Telefone)
    {
        if(Telefone.length() == 11){

            for (int i = 0; i < Telefone.length(); i++) {
                char c = Telefone.charAt(i);
                if (c < '0' || c > '9') {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    private boolean validaData(String dNascimento){
        String[] dt = dNascimento.split("/");
        if(dt.length != 3)
            return false;

        int dia = Integer.parseInt(dt[0]);
        int mes = Integer.parseInt(dt[1]);
        int ano = Integer.parseInt(dt[2]);

        if(validaValorData(dia, mes, ano))
            return true;
        return false;
    }
    public void imprimeContato(){
        System.out.println("Contatos:\n\tEmail: " + Email + "\n\tTelefone: " + Telefone);
    }

    public int calcularIdade(){
        String[] birth = dNascimento.split("/");
        if(birth.length != 3)
            return -1; 
        int diaNasc = Integer.parseInt(birth[0]);
        int mesNasc = Integer.parseInt(birth[1]);
        int anoNasc = Integer.parseInt(birth[2]);

        Calendar today = Calendar.getInstance();

        int currentYear = today.get(Calendar.YEAR);
        int currentMonth = today.get(Calendar.MONTH) + 1;
        int currentDay = today.get(Calendar.DAY_OF_MONTH);

        int idade = currentYear - anoNasc;

        if(currentMonth < mesNasc || (currentMonth == mesNasc && currentDay < diaNasc)){
            idade--;
        }
        return idade;
    }

    private boolean anoBissexto(int a){
        return(a%400==0 || (a%4==0 && !(a%100==0)));
    }

    private boolean validaValorData(int d, int m, int a){
        if((d >= 1 && d <= 31) && (m >= 1 && m <= 12)){
            if(m==2){
                if(anoBissexto(a) && d<=29)
                    return true;
                else return !(!anoBissexto(a) && d > 28);
            }
            return true;
        }
        return false;
    }
}
