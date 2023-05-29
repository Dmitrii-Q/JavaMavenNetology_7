package JavaMavenNetology.JavaMavenNetology_7.radioControl;

public class Radio {
    private int currentRadio;
    private int volumeRadio;

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio < 0) {
            return;
        }
        if (currentRadio > 9) {
            return;
        }
        this.currentRadio = currentRadio;
    }

    public int getVolumeRadio() {
        return volumeRadio;
    }

    public void setVolumeRadio(int volumeRadio) {
        if (volumeRadio < 0) {
            return;
        }
        if (volumeRadio > 10) {
            return;
        }
        this.volumeRadio = volumeRadio;
    }

    public void nextRadio() {
        if (currentRadio < 9) {
            currentRadio++;
        }else {
            currentRadio = 0;
        }
    }

    public void prevRadio() {
        if (currentRadio > 0) {
            currentRadio--;
        }else {
            currentRadio = 9;
        }
    }

    public void nextVolume() {
        if (volumeRadio < 10) {
            volumeRadio++;
        }else {
            volumeRadio = 10;
        }
    }

    public void prevVolume() {
        if (volumeRadio > 0) {
            volumeRadio--;
        }else {
            volumeRadio = 0;
        }
    }
}