package model;

public class Notice implements Comparable<Notice> {
    private String title;
    private String description;
    private String address;
    private Double coast;
    private int imageID;

    public Notice(String title, String description, String address, Double coast, int imageID) {
        this.title = title;
        this.description = description;
        this.address = address;
        this.coast = coast;
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getCoast() {
        return coast;
    }

    public void setCoast(Double coast) {
        this.coast = coast;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", address='" + address + '\'' +
                ", coast=" + coast +
                ", imageID=" + imageID +
                '}';
    }

    @Override
    public int compareTo(Notice notice) {

        if (notice == null) {
            return 1;
        }

        if (this.coast > notice.getCoast()) {
            return 1;
        } else if (this.getCoast() < notice.getCoast()) {
            return -1;
        }
        return 0;
    }
}
