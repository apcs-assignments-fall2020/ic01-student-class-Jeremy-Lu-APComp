//INHERITANCE - Jeremy Lu 10/28/2020
public class Student extends Person {
    //Instance Variables:
    private int classyear;

    //Constructors: [Come back to this LATER]
    public Student(String a, String b, int c){
        super(a , b);
        // this.firstName = a;
        // this.lastName = b;
        this.classyear = c;
    }

    public Student() {
        super("Jerry", "Seinfeld");
        this.classyear = 2024;
    }

    public String toString(){
        String str = this.getFirstName() + " " + this.getLastName() + " " + this.getclassyear();
        return str;
    }

    //Getter:
    public int getclassyear() {
        return this.classyear;
    }
    //Setter:
    public void setclassyear(int classyear) {
        if(classyear > 2020 && classyear <= 2025){
            this.classyear = classyear;
        }
    }
}