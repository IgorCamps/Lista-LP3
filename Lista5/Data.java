package Lista5;

public class Data {
    private int dia, mes, ano;

    Data(int dia, int mes, int ano){
        if(verificarData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            this.dia = 21;
            this.mes = 6;
            this.ano = 2023;
        }
    }
    
    public void inicializarData(int dia, int mes, int ano){
        if(verificarData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            System.out.println("Data invalida.");
        }
    }


    private boolean verificarData(int dia, int mes, int ano){

        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > 31) {
            return false;
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                return false;
            }
        } else if (mes == 2) {
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                if (dia > 29) {
                    return false;
                }
            } else {
                if (dia > 28) {
                    return false;
                }
            }
        }

        return true;

    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getDia(){
        return dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getMes(){
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public boolean ehAnterior(Data novaData){
        if(novaData.ano < ano){
            return true;
        }else if(novaData.ano == ano){
            if(novaData.mes < mes){
                return true;
            }else if(novaData.mes == mes){
                if(novaData.dia < dia){
                    return true;
                }
            }
        }
        return false;
    }

    public int quantoDias(Data outraData){
        int restante;
        if(ehAnterior(outraData)){
            restante = -(ano - outraData.ano) * 365;
            restante -= (mes - outraData.mes) * 30;
            restante -= dia - outraData.dia;
            restante ++;
        }else{
            restante = (outraData.ano - ano) * 365;
            restante += (outraData.mes - mes) * 30;
            restante += outraData.dia - dia;
            restante --;
        }

        return restante;
    }

    public String diaDaSemana(){
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        int diaFun = dia, mesFun = mes, anoFun = ano;
        if(mesFun == 1 || mesFun == 2){
            mesFun += 12;
            anoFun--;
        }
        int diaSemana = (diaFun + 2*mesFun + (3*(mesFun+1))/5 + anoFun + anoFun/4 - anoFun/100 + anoFun/400) % 7;
        return dias[diaSemana+1];
    }

    public void imprimirData(){
        System.out.printf("%d/%d/%d", dia, mes, ano);
    }

    public void imprimirDataExtenso(){
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        System.out.printf("%d de %s de %d\n", dia, meses[mes - 1], ano);
    }
}

