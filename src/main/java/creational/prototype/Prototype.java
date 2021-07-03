package creational.prototype;

public class Prototype implements Cloneable {
    public int PersonID ;
    public String PersonName;
    private int QualifierID;
    public String Address;

    public Prototype(int PersonID, String PersonName, int QualifierID, String Address){
        this.PersonID = PersonID;
        this.PersonName = PersonName;
        this.QualifierID = QualifierID;
        this.Address = Address;
    }

 public Prototype Clone(){
        return  new Prototype(PersonID, PersonName, QualifierID, Address);
 }


}
