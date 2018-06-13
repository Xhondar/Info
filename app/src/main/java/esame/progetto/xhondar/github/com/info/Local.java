package esame.progetto.xhondar.github.com.info;

public class Local {
    private String name;
    private String address;
    private String number;
    private String description;
    private String img_local;

    public Local(String name, String address, String number, String description, String img_local){
        this.name = name;
        this.address = address;
        this.number = number;
        this.description = description;
        this.img_local = img_local;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImg_local(String img_local) {
        this.img_local = img_local;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public String getImg_local() {
        return img_local;
    }
}