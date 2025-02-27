package org.example;

public class HDMI extends Colokan{
    public HDMI(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }
    @Override
    public double getRealBandwidth() {
        if (super.getHarga()/50000 < 1){
            return super.getPromisedBandwidth()*super.getHarga()/50000;
        }
        else return super.getPromisedBandwidth();
    }
}
