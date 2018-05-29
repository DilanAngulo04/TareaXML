package xmlProjectDomain;

public class Person {
    
    //Atributos
    private String id;
    private String name;
    private String lastName1;
    private String lastName2;
    private String birthdate;
    private String country;
    private String idDad;

    //Contructores
    public Person(String id, String name, String lastName1, String lastName2, String birthdate, 
            String country, String idDad) {
        this.id = id;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.birthdate = birthdate;
        this.country = country;
        this.idDad = idDad;
    }

    public Person() {
        this.id = "";
        this.name = "";
        this.lastName1 = "";
        this.lastName2 = "";
        this.birthdate = "";
        this.country = "";
        this.idDad = "";
    }

    //Setters and Getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIdDad() {
        return idDad;
    }

    public void setIdDad(String idDad) {
        this.idDad = idDad;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name 
                + ", lastName1=" + lastName1 + ", lastName2=" + lastName2 
                + ", birthdate=" + birthdate + ", country=" + country 
                + ", idDad=" + idDad + '}';
    }


    
}