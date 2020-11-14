package Models;

public class Theater {
    private int id, numProjectors;
    private String address;

    public Theater(int id, int numProjectors, String address){
        this.id = id;
        this.numProjectors = numProjectors;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumProjectors() {
        return numProjectors;
    }

    public void setNumProjectors(int numProjectors) {
        this.numProjectors = numProjectors;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
