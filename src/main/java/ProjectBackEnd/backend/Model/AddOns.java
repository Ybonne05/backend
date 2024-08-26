package ProjectBackEnd.backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AddOns {

    @Id
    @GeneratedValue Long addOnsId;
    private int nata;
    private int coffeeJelly;
    private int pearl;
    private int cheeseCake;
    private int grassJelly;

    public AddOns(){}

    public AddOns(int nata, int coffeeJelly, int pearl, int cheeseCake, int grassJelly) {
        this.nata = nata;
        this.coffeeJelly = coffeeJelly;
        this.pearl = pearl;
        this.cheeseCake = cheeseCake;
        this.grassJelly = grassJelly;
    }

    public Long getAddOnsId() {
        return addOnsId;
    }

    public void setAddOnsId(Long addOnsId) {
        this.addOnsId = addOnsId;
    }

    public int getNata() {
        return nata;
    }

    public void setNata(int nata) {
        this.nata = nata;
    }

    public int getCoffeeJelly() {
        return coffeeJelly;
    }

    public void setCoffeeJelly(int coffeeJelly) {
        this.coffeeJelly = coffeeJelly;
    }

    public int getPearl() {
        return pearl;
    }

    public void setPearl(int pearl) {
        this.pearl = pearl;
    }

    public int getCheeseCake() {
        return cheeseCake;
    }

    public void setCheeseCake(int cheeseCake) {
        this.cheeseCake = cheeseCake;
    }

    public int getGrassJelly() {
        return grassJelly;
    }

    public void setGrassJelly(int grassJelly) {
        this.grassJelly = grassJelly;
    }

    

}
