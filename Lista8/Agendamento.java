package Lista8;

public class Agendamento {
    private static class Data {
        private int dia;
        private int mes;
        private int ano;

        public Data(int dia, int mes, int ano) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    private static class Hora {
        private int hora;
        private int minuto;

        public Hora(int hora, int minuto) {
            this.hora = hora;
            this.minuto = minuto;
        }
    }

    private static class Contato {
        private String nome;
        private String telefone;

        public Contato(String nome, String telefone) {
            this.nome = nome;
            this.telefone = telefone;
        }
    }

    private String descricao;
    private Data data;
    private Hora hora;
    private Contato contato;

    public Agendamento(String descricao, Data data, Hora hora, Contato contato) {
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
        this.contato = contato;
    }

    public void imprimirAgendamento() {
        System.out.println("Agendamento: " + descricao);
        System.out.println("Data: " + data.dia + "/" + data.mes + "/" + data.ano);
        System.out.println("Hora: " + hora.hora + ":" + hora.minuto);
        System.out.println("Contato: " + contato.nome + " - " + contato.telefone);
    }

    public static void main(String[] args) {
        Data dataAgendamento = new Data(8, 11, 2023);
        Hora horaAgendamento = new Hora(14, 30);
        Contato contatoAgendamento = new Contato("Igor", "73999999");

        Agendamento agendamento = new Agendamento("Reunião da Tecno", dataAgendamento, horaAgendamento, contatoAgendamento);
        agendamento.imprimirAgendamento();
    }
}
