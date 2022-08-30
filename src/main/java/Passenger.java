public class Passenger {

    private String name;
    private String contactInformation;
    private int id;

    public Passenger (String name, String contactInformation, int id){
        this.name = name;
        this.contactInformation = contactInformation;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public void addPassenger(){
//        this.addPassenger();
//    }





}
