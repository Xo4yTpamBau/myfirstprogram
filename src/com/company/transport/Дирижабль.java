package com.company.transport;

public class Дирижабль extends Воздушный {
    private int ОбЪём;
    private String Тип;

    public Дирижабль(int грузоподъёмность, int cкорость, String назначение, String типДвижителя,
                     int запасТоплива, int расход, int грузовместимость, int максВысота,
                     String условияБазирования, int обЪём, String тип) {

        super(грузоподъёмность, cкорость, назначение, типДвижителя, запасТоплива, расход,
                грузовместимость, максВысота, условияБазирования);

        ОбЪём = обЪём;
        Тип = тип;
    }

    public int getОбЪём() { return ОбЪём; }

    public void setОбЪём(int обЪём) { ОбЪём = обЪём; }

    public String getТип() { return Тип; }

    public void setТип(String тип) { Тип = тип; }

}

