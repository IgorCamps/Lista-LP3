public class Time {
    public int hora;
    public int min;
    public int seg;

    public Time() {
        this.hora = 0;
        this.min = 0;
        this.seg = 0;
    }

    public Time(int hora) {
        this.hora = hora;
        this.min = 0;
        this.seg = 0;
    }

    public Time(int hora, int min) {
        this.hora = hora;
        this.min = min;
        this.seg = 0;
    }

    public Time(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public Time(Time novoTime) {
        this.hora = novoTime.hora;
        this.min = novoTime.min;
        this.seg = novoTime.seg;
    }

    public void addTime(int seg) {
        this.seg += seg;
        normalTime();
    }

    public void addTime(int min, int seg) {
        this.min += min;
        this.seg += seg;
        normalTime();
    }

    public void addTime(int hora, int min, int seg) {
        this.hora += hora;
        this.min += min;
        this.seg += seg;
        normalTime();
    }

    public void addTime(Time obj) {
        this.hora += obj.hora;
        this.min += obj.min;
        this.seg += obj.seg;
        normalTime();
    }

    private void normalTime() {
        int extraSeg = this.seg / 60;
        this.seg = this.seg % 60;

        int extraMin = (this.min + extraSeg) / 60;
        this.min = (this.min + extraSeg) % 60;

        this.hora += extraMin;
}
    public static void main(String[] args) {
        Time tempo1 = new Time(); 
        System.out.println("tempo1: " + tempo1.hora + "h " + tempo1.min + "min " + tempo1.seg + "s");

        Time tempo2 = new Time(2, 30, 45); 
        System.out.println("tempo2: " + tempo2.hora + "h " + tempo2.min + "min " + tempo2.seg + "s");

        tempo1.addTime(15, 40, 10); 
        System.out.println("tempo1 após adição: " + tempo1.hora + "h " + tempo1.min + "min " + tempo1.seg + "s");

        tempo2.addTime(1, 15); 
        System.out.println("tempo2 após adição: " + tempo2.hora + "h " + tempo2.min + "min " + tempo2.seg + "s");

        Time tempo3 = new Time(tempo2); 
        System.out.println("tempo3: " + tempo3.hora + "h " + tempo3.min + "min " + tempo3.seg + "s");
}
}

