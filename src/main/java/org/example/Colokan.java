package org.example;

public abstract class Colokan {
    private String merk;
    private double promisedBandwidth;
    private int harga;

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
    public void setPromisedBandwidth(double promisedBandwidth) {
        this.promisedBandwidth = promisedBandwidth;
    }
    public double getPromisedBandwidth() {
        return promisedBandwidth;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getHarga() {
        return harga;
    }

    public Colokan(int harga, double promisedBandwidth, String merk) {
        this.setMerk(merk);
        this.setPromisedBandwidth(promisedBandwidth);
        this.setHarga(harga);
    }

    public abstract double getRealBandwidth();
}

