public class item {
    protected int location;
    protected String description;

    // Constructor
    public item(int location, String description) {
        this.location = location;
        this.description = description;
    }

    // Getter and Setter for location
    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}



