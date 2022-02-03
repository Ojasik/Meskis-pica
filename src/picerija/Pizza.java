package picerija;

import java.util.ArrayList;

public class Pizza {
	private String size, veids;
    private ArrayList<String> toppings;

    
    public String getVeids() {
    	return veids;
    }
    
    public void setVeids(String veids) {
    	this.veids=veids;
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public String toString() {
        return this.size + " pica ar " + this.getToppings();
    }
}

