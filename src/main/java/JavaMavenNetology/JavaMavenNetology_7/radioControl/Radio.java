package JavaMavenNetology.JavaMavenNetology_7.radioControl;

public class Radio {
    private int currentRadio;
    private int volumeRadio;
    private int maxRadioStation;

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio < 0) {
            return;
        }
        if (currentRadio > maxRadioStation) {
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
        if (volumeRadio > 100) {
            return;
        }
        this.volumeRadio = volumeRadio;
    }

    public void nextRadio() {
        if (currentRadio < maxRadioStation) {
            currentRadio++;
        }else {
            currentRadio = 0;
        }
    }

    public void prevRadio() {
        if (currentRadio > 0) {
            currentRadio--;
        }else {
            currentRadio = maxRadioStation;
        }
    }

    public void nextVolume() {
        if (volumeRadio < 100) {
            volumeRadio++;
        }else {
            volumeRadio = 100;
        }
    }

    public void prevVolume() {
        if (volumeRadio > 0) {
            volumeRadio--;
        }else {
            volumeRadio = 0;
        }
    }

    public Radio () {
        maxRadioStation = 9;
    }

    public Radio (int countRadioStation) {
        maxRadioStation = countRadioStation -1;
    }
}
