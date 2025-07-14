package classes.school;

public class Person extends Object {

    private int id;
    private String name;
    private String taxIdNumber; // NIF
    private String idNumber; // c.c

    public Person() {

    }

    public int getId() {
        System.out.println("I'm a Person");
        return Integer.valueOf(idNumber);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public void setTaxIdNumber(String taxIdNumber) {
        this.taxIdNumber = taxIdNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString(){
        var objectString = "Object : " + super.toString();
        return objectString + "Person";
    }
}
