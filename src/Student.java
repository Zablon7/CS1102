

public class Student {
    private String name;
    public double test1, test2, test3;
    private int ID;
    private static int nextUniqueID = 0;

    public Student(String theName) {
        if (theName == null) {
            throw new IllegalArgumentException("name can't be null.");
        }
        
        nextUniqueID++;
        ID = nextUniqueID;
    }

    public Student() {

    }


    public double getAverage() {
        return (test1 + test2 + test3) / 3;
    }

    public void setName(String newTitle) {
        this.name = newTitle;
    }

    public String getName() {
        return "Name: " + this.name;
    }

    public String getID(){
        return "ID: " + String.valueOf(ID);
    }

}
