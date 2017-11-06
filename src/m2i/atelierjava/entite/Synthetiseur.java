/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

/**
 *
 * @author Formation
 */
public class Synthetiseur {

    protected boolean on;
    protected String instrument;
    protected int volume;

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void allumageOnOff() {
        if (on == false) {
            on = true;
            instrument = "piano";
            volume = 9;
        } else {
            on = false;
        }
    }

    public void volumePus() {

        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void volumeMoins() {

        if (volume > 0) {
            volume = volume - 1;
        }
    }

    public void jouerNote(String note) {

        System.out.println(note + " " + instrument + " " + volume + " " + on);

    }

}
