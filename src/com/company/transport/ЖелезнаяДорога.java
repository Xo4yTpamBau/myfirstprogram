package com.company.transport;

public class ЖелезнаяДорога extends Наземный {
    private String ТипВагонов;

    public ЖелезнаяДорога(int грузоподъёмность, int cкорость, String назначение, String типДвижителя,
                          int запасТоплива, int расход, int грузовместимость, int количествоОсей,
                          String проходимость, String типПутей, String типВагонов) {

        super(грузоподъёмность, cкорость, назначение, типДвижителя, запасТоплива, расход,
                грузовместимость, количествоОсей, проходимость, типПутей);

        ТипВагонов = типВагонов;
    }

    public String getТипВагонов() { return ТипВагонов; }

    public void setТипВагонов(String типВагонов) { ТипВагонов = типВагонов; }

    public static void main (String args[]){
        ЖелезнаяДорога Сапсан = new ЖелезнаяДорога(10000, 250, "перевозка",
                "Элекьро", 0, 0, 10000, 10,
                "низкая", "ЖД", "ТурКласс");
    }
}


