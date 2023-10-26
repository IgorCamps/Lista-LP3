package Lista5;

public class Time {
    private int horas;
    private int minutos;
    private int segundos;

    Time(int horas, int minutos, int segundos){
        if(validateTime(horas, minutos, segundos)){
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }

    private boolean validateTime(int horas, int minutos, int segundos){
        return validateHours(horas) && validateMinutesOrSeconds(minutos) && validateMinutesOrSeconds(segundos);
    }

    private boolean validateHours(int horas){
        return (horas >= 0) && (horas < 25);
    }

    private boolean validateMinutesOrSeconds(int param){
        return (param >= 0) && (param < 61);
    }

    public boolean isAM(){
        return this.horas < 12;
    }

    public int timeDifference(Time OutraHora){
        int NovaHora = OutraHora.horas * 3600 - this.horas * 3600;
        int NovoMin = OutraHora.minutos * 60 - this.minutos * 60;
        int NovoSeg = (OutraHora.segundos - this.segundos) + NovoMin + NovaHora;

        if(this.horas < OutraHora.horas){
            return NovoSeg;
        } else {
            return NovoSeg + 86400;
        }
    }

    public void addSeconds(int segundos){
        this.segundos += segundos;
        if(this.segundos > 59){
            this.minutos += this.segundos / 60;
            this.segundos %= 60; 
        }

        if(this.minutos > 59){
            this.horas += this.minutos / 60;
            this.minutos %= 60;
        }
        
        if(this.horas > 23){
            this.horas %= 24;
        }
    }

    public void setTime(int horas, int minutos, int segundos){
        if (validateTime(horas, minutos, segundos)) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
        else{
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    public String getTime(){
        return this.horas + ":" + this.minutos + ":" + this.segundos;
    }

    public void printTime(){
        System.out.println(getTime());
    }
}
