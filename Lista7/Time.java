package Lista7;

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

    public static Time diffTime(Time t1, Time t2) {
        int diffHora = t1.hora - t2.hora;
        int diffMin = t1.min - t2.min;
        int diffSeg = t1.seg - t2.seg;

        if (diffSeg < 0) {
            diffMin--;
            diffSeg += 60;
        }
        if (diffMin < 0) {
            diffHora--;
            diffMin += 60;
        }

        return new Time(diffHora, diffMin, diffSeg);
    }

    public static Time diffTime(Time t) {
        int horaAtual = java.time.LocalTime.now().getHour();
        int minAtual = java.time.LocalTime.now().getMinute();
        int segAtual = java.time.LocalTime.now().getSecond();

        int diffHora = horaAtual - t.hora;
        int diffMin = minAtual - t.min;
        int diffSeg = segAtual - t.seg;

        if (diffSeg < 0) {
            diffMin--;
            diffSeg += 60;
        }
        if (diffMin < 0) {
            diffHora--;
            diffMin += 60;
        }

        return new Time(diffHora, diffMin, diffSeg);
    }

    public boolean isAm() {
        return this.hora < 12;
    }

    public boolean isPm() {
        return this.hora >= 12;
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

        Time diff1 = Time.diffTime(tempo1);
        System.out.println("Diferença entre tempo1 e a hora atual: " + diff1.hora + "h " + diff1.min + "min " + diff1.seg + "s");

        Time diff2 = Time.diffTime(tempo1, tempo2);
        
        System.out.println("Diferença entre tempo1 e tempo2 é: " + diff2.hora + "h " + diff2.min + "min " + diff2.seg + "s");

        if (tempo1.isAm()) {
            System.out.println("tempo1 é AM");
        } else {
            System.out.println("tempo1 é PM");
        }
    }
}
