public class Passenger {

//    a name, contact information and a unique identifier (id)

    private String name;
    private String contactEmail;
    private String contactNumber;
    private int id;

    public Passenger (String customerName, String contactEmail,String contactNumber, int id){
        this.name = customerName;
        this.contactEmail=contactEmail;
        this.contactNumber=contactNumber;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
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
