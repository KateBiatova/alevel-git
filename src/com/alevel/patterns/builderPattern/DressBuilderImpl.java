package com.alevel.patterns.builderPattern;

//реализуем методы из интерфейса (override)

public class DressBuilderImpl implements DressBuilder{
    private Dress eveningDress;
    public DressBuilderImpl() {
        eveningDress = new Dress();
    }

    @Override
    public Dress build() {
        Dress myDress = new Dress();
        myDress.setBodice(eveningDress.getBodice());
        myDress.setSleeve(eveningDress.getSleeve());
        myDress.setHem(eveningDress.getHem());
        myDress.setCollar(eveningDress.getCollar());
        return myDress;
    }

    @Override
    public DressBuilder setBodice (final String bodice) {
        eveningDress.setBodice(bodice);
        return this;
    }

    @Override
    public DressBuilder setSleeve(final String sleeve) {
        eveningDress.setSleeve(sleeve);
        return this;
    }

    @Override
    public DressBuilder setHem(final String hem) {
        eveningDress.setHem(hem);
        return this;
    }

    @Override
    public DressBuilder setCollar(final String collar) {
        eveningDress.setCollar(collar);
        return this;
    }
}
