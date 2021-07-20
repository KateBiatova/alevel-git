package com.alevel.patterns.builderPattern;

//описываем из чего состоит объект, задаем ему сеттеры и геттеры

class Dress {
    private String sleeve;
    private String bodice;
    private String collar;
    private String hem;

    public Dress() {
    }

    public void setCollar(final String collar) {
    this.collar = collar;
    }

    public void setBodice(final String bodice) {
    this.bodice = bodice;
    }

    public void setHem(final String hem) {
        this.hem = hem;
    }

    public void setSleeve(final String sleeve) {
        this.sleeve = sleeve;
    }

    @Override
    public String toString() {
    return "Dress (bodice = " + bodice + ", sleeve = " + sleeve + ", hem = " + hem + ", collar = " + collar + ")";
    }

    public String getBodice() {
        return bodice;
    }

    public String getSleeve() {
        return sleeve;
    }

    public String getHem() {
        return hem;
    }

    public String getCollar() {
        return collar;
    }
}


