public class Time{
    private int hora;
    private int min;
    private int seg;

    Time(){
        this.hora = 0;
        this.min = 0;
        this.seg = 0;
    }

    Time(int hora){
        this.hora = hora;
    }

    Time(int hora, int min){
        this.hora = hora;
        this.min = min;
    }

    Time(int hora, int min, int seg){
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public Time(Time novoTime){
        this.hora = novoTime.hora;
        this.min = novoTime.min;
        this.seg = novoTime.seg;
    }
}