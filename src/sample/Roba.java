package sample;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class Roba {
    int ID;
    SimpleStringProperty ime;
    SimpleIntegerProperty kolicina;
    SimpleDoubleProperty trenutnaVrijednostJedinice;
    SimpleDoubleProperty minimalnaVrijednostJedinice;
    SimpleDoubleProperty maximalnaVrijednostJedinice;
    ArrayList<Double> historija;

    public Roba(int ID, String ime, int kolicina, double trenutnaVrijednostJedinice, double minimalnaVrijednostJedinice, double maximalnaVrijednostJedinice) {
        this.ID = ID;
        this.ime = new SimpleStringProperty(ime);
        this.kolicina = new SimpleIntegerProperty(kolicina);
        this.trenutnaVrijednostJedinice = new SimpleDoubleProperty(trenutnaVrijednostJedinice);
        this.minimalnaVrijednostJedinice = new SimpleDoubleProperty(minimalnaVrijednostJedinice);
        this.maximalnaVrijednostJedinice = new SimpleDoubleProperty(maximalnaVrijednostJedinice);
        this.historija = new ArrayList<>();
        historija.add(trenutnaVrijednostJedinice);
    }

    public Roba() {
    }

    public int getKolicina() {
        return kolicina.get();
    }

    public void setKolicina(int kolicina) {
        this.kolicina.set(kolicina);
    }

    public SimpleIntegerProperty kolicinaProperty() {
        return kolicina;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIme() {
        return ime.get();
    }

    public void setIme(String ime) {
        this.ime.set(ime);
    }

    public SimpleStringProperty imeProperty() {
        return ime;
    }

    public double getTrenutnaVrijednostJedinice() {
        return trenutnaVrijednostJedinice.get();
    }

    public void setTrenutnaVrijednostJedinice(double trenutnaVrijednostJedinice) {
        this.trenutnaVrijednostJedinice.set(trenutnaVrijednostJedinice);
    }

    public SimpleDoubleProperty trenutnaVrijednostJediniceProperty() {
        return trenutnaVrijednostJedinice;
    }

    public double getMinimalnaVrijednostJedinice() {
        return minimalnaVrijednostJedinice.get();
    }

    public void setMinimalnaVrijednostJedinice(double minimalnaVrijednostJedinice) {
        this.minimalnaVrijednostJedinice.set(minimalnaVrijednostJedinice);
    }

    public SimpleDoubleProperty minimalnaVrijednostJediniceProperty() {
        return minimalnaVrijednostJedinice;
    }

    public double getMaximalnaVrijednostJedinice() {
        return maximalnaVrijednostJedinice.get();
    }

    public void setMaximalnaVrijednostJedinice(double maximalnaVrijednostJedinice) {
        this.maximalnaVrijednostJedinice.set(maximalnaVrijednostJedinice);
    }

    public SimpleDoubleProperty maximalnaVrijednostJediniceProperty() {
        return maximalnaVrijednostJedinice;
    }

    public ArrayList<Double> getHistorija() {
        return historija;
    }

    public void setHistorija(ArrayList<Double> historija) {
        this.historija = historija;
    }

    public int rand(int granica) {
        int num = (int) (Math.random() * 100);
        return num > granica ? 1 : 0;
    }



/*
    public void novaCijena() {
        Random r= new Random(System.currentTimeMillis());
        int num = rand((int)trenutnaVrijednostJedinice.get() % 100);
        if((trenutnaVrijednostJedinice.get() / (maximalnaVrijednostJedinice.get() - minimalnaVrijednostJedinice.get()))*100 <= 40) {
            if(num == 0) trenutnaVrijednostJedinice.get() -= (trenutnaVrijednostJedinice.get() /100)*(r.nextDouble()*5);
            else trenutnaVrijednostJedinice += (trenutnaVrijednostJedinice/100)*(r.nextDouble()*10);
        }
        else if((trenutnaVrijednostJedinice/ (maximalnaVrijednostJedinice-minimalnaVrijednostJedinice))*100 >= 60) {
            if(num == 0)
                trenutnaVrijednostJedinice -= (trenutnaVrijednostJedinice/100)*(r.nextDouble()*35);
            else trenutnaVrijednostJedinice += (trenutnaVrijednostJedinice/100)*(r.nextDouble()*5);
        }
        else {
            if(num == 0) trenutnaVrijednostJedinice -= (trenutnaVrijednostJedinice/100)*(r.nextDouble()*5);
            else trenutnaVrijednostJedinice += (trenutnaVrijednostJedinice/100)*(r.nextDouble()*3);
        }

        trenutnaVrijednostJedinice*=100;
        trenutnaVrijednostJedinice = (int) trenutnaVrijednostJedinice;
        trenutnaVrijednostJedinice /= 100;
    }

    void napadNaRobu () {
        System.out.println(trenutnaVrijednostJedinice);
        System.out.println("Desilo se nešto jebeno baš! Vrijednost " + ime  + " je opala za 35%");
        trenutnaVrijednostJedinice = trenutnaVrijednostJedinice - (trenutnaVrijednostJedinice / 3.5);
        System.out.println(trenutnaVrijednostJedinice);

    }

    */

    @Override
    public String toString() {
        return ime.get();
    }
}
