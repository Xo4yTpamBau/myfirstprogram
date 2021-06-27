package com.company.transport;

public class Автомобиль extends Наземный {
    private String Класс;
    private String ТипКузова;

    public Автомобиль(int грузоподъёмность, int cкорость, String назначение,
                      String типДвижителя, int запасТоплива, int расход,
                      int грузовместимость, int количествоОсей, String проходимость,
                      String типПутей, String класс, String типКузова) {

        super(грузоподъёмность, cкорость, назначение, типДвижителя, запасТоплива,
                расход, грузовместимость, количествоОсей, проходимость, типПутей);

        Класс = класс;
        ТипКузова = типКузова;
    }

    public String getКласс() { return Класс; }

    public void setКласс(String класс) { Класс = класс; }

    public String getТипКузова() { return ТипКузова; }

    public void setТипКузова(String типКузова) { ТипКузова = типКузова; }

    public static void main (String args[]){
        Автомобиль Mustang = new Автомобиль(400, 320, "перевозка",
                "ДВС", 70, 15, 300, 2,
                "низкая", "АД", "S","купе");
    }

}


