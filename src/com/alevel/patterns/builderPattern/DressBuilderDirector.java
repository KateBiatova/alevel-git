package com.alevel.patterns.builderPattern;

//собираем объект из деталей

public class DressBuilderDirector {
    private DressBuilder builder;

    public DressBuilderDirector (final DressBuilder builder) {
        this.builder = builder;
    }

    public Dress construct() {                  //метод, который собирает объект с индивидуальными параметрами, вызывая все отдельные методы
        return builder.setBodice("brilliant")
                .setSleeve("no sleeves")
                .setHem("long")
                .setCollar("edging")
                .build();
    }

    public static void main(final String [] arguments) {
        final DressBuilder builder = new DressBuilderImpl();

        final DressBuilderDirector dressBuilderDirector = new DressBuilderDirector(builder);

        System.out.println(dressBuilderDirector.construct());
    }
}
