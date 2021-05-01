package pl.edu.agh.orchestra;

import java.util.ArrayList;

public class Opera {
    public static void main(String[] args) {
//        Instrument flute = new Flute();
//        Instrument guitar = new Guitar();
//        Instrument trombone = new Trombone();
//
//        flute.play();
//        guitar.play();
//        trombone.play();

//        ArrayList<Instrument> instruments = new ArrayList<>();
//        instruments.add(new Flute());
//        instruments.add(new Guitar());
//        instruments.add(new Trombone());
//        instruments.add(new Guitar());
//
//        for (Instrument instrument : instruments) {
//            instrument.play();
//        }


        Orchestra orchestra = new Orchestra();
        orchestra.addInstruments(new Flute());
        orchestra.addInstruments(new Trombone());
        orchestra.addInstruments(new Guitar());

//        orchestra.play();

        Orchestra b = new Orchestra();
        b.addInstruments(new Guitar());
        b.addInstruments(orchestra);

        b.play();
    }
}
