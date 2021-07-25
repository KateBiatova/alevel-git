package com.alevel.patterns.builderPattern;

//строим объект из набора "деталей"

public interface DressBuilder {
    Dress build();
    DressBuilder setCollar(final String collar);
    DressBuilder setBodice(final String bodice);
    DressBuilder setHem(final String hem);
    DressBuilder setSleeve(final String sleeve);
}
