package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;

    public int getResolution() {
        int resolusi;

        if (colokan.getRealBandwidth() >= 10 && colokan.getRealBandwidth() <= 35) {
            resolusi = 480;
        }
        else if(colokan.getRealBandwidth() > 35 && colokan.getRealBandwidth() <= 100){
            resolusi = 720;
        }
        else if(colokan.getRealBandwidth() > 100){
            resolusi = 1080;
        }
        else resolusi = 0;

        if (resolusi > this.maxResolusi){
            resolusi = this.maxResolusi;
        }

        return resolusi;
    }

    public TV(int maxResolusi) {
        this.maxResolusi = maxResolusi;
    }

    public void connect(Colokan colokan) {
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }
}
