package creational.prototype;

public class PrototypeImpl {
    public static void main(String[] args){
        Prototype pObj1 = new Prototype(10,"Sharath", 78, "Bengaluru");
        Prototype pObj2 = pObj1.Clone();

        if(pObj1.PersonID == pObj2.PersonID){
            System.out.println("Objects are same");
        }
        else{
            System.out.println("Objects are different");
        }
    }
}
