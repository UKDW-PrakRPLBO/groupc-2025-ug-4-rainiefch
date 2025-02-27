package org.example;

public class VGA extends Colokan{
    public VGA(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }
    public double getRealBandwidth(){
        if (super.getHarga()/30000 < 1){
            return super.getPromisedBandwidth()*super.getHarga()/30000;
        }
        else return super.getPromisedBandwidth();
    }
}
