package JavaMavenNetology.JavaMavenNetology_7.radioControl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void midRadioStation () {
        Radio radio = new Radio();
        radio.setCurrentRadio(7);

        int expected = 7;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void botBorderRadioStation () {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void topBorderRadioStation () {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void underBotBorderRadioStation () {
        Radio radio = new Radio();
        radio.setCurrentRadio(-1);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void outTopBorderRadioStation () {
        Radio radio = new Radio();
        radio.setCurrentRadio(10);

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void midVolumeLevel () {
        Radio radio = new Radio();
        radio.setVolumeRadio(55);

        int expected = 55;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void botBorderVolumeLevel () {
        Radio radio = new Radio();
        radio.setVolumeRadio(0);

        int expected = 0;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void topBorderVolumeLevel () {
        Radio radio = new Radio();
        radio.setVolumeRadio(100);

        int expected = 100;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void underBotBorderVolumeLevel () {
        Radio radio = new Radio();
        radio.setVolumeRadio(-1);

        int expected = 0;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void outTopBorderVolumeLevel () {
        Radio radio = new Radio();
        radio.setVolumeRadio(101);

        int expected = 0;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTopBorderRadioStation () {
        Radio radio = new Radio();
        radio.setCurrentRadio(8);
        radio.nextRadio();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextOutTopBorderRadioStation () {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);
        radio.nextRadio();

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextBotBorderRadioStation () {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);
        radio.nextRadio();

        int expected = 1;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTopBorderRadioStation () {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);
        radio.prevRadio();

        int expected = 8;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevBotBorderRadioStation () {
        Radio radio = new Radio();
        radio.setCurrentRadio(1);
        radio.prevRadio();

        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevOutBotBorderRadioStation () {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);
        radio.prevRadio();

        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTopBorderVolumeLevel () {
        Radio radio = new Radio();
        radio.setVolumeRadio(99);
        radio.nextVolume();

        int expected = 100;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextOutTopBorderVolumeLevel () {
        Radio radio = new Radio();
        radio.setVolumeRadio(100);
        radio.nextVolume();

        int expected = 100;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextBotBorderVolumeLevel () {
        Radio radio = new Radio();
        radio.setVolumeRadio(0);
        radio.nextVolume();

        int expected = 1;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTopBorderVolumeLevel () {
        Radio radio = new Radio();
        radio.setVolumeRadio(100);
        radio.prevVolume();

        int expected = 99;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevBotBorderVolumeLevel () {
        Radio radio = new Radio();
        radio.setVolumeRadio(1);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevOutBotBorderVolumeLevel () {
        Radio radio = new Radio();
        radio.setVolumeRadio(0);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getVolumeRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxRadioStation () {
        Radio radio = new Radio(30);
        radio.setCurrentRadio(29);

        int expected = 29;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMaxRadioStation () {
        Radio radio = new Radio(30);
        radio.setCurrentRadio(29);
        radio.prevRadio();

        int expected = 28;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMaxRadioStation () {
        Radio radio = new Radio(30);
        radio.setCurrentRadio(28);
        radio.nextRadio();

        int expected = 29;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
}