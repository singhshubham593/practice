// Class
public class ClassAndObject {
    public static void main(String[] args) {
        //Object is created
        pen pen1 = new pen();//(className ObjectName = new Constractor);classname and constractor are same;
        // value assign
        pen1.color="black";
        pen1.type="ballpoint";
        //method call
        pen1.write();
        pen1.printcolor();
        pen1.workingtype();
    }
}
//Class
class pen{
    String color;
    String type;
    //method
    public void write(){
        System.out.println("Writting something by pen");
    }
    //method
    public void printcolor(){
        System.out.println(this.color);
    }
    //method
    public void workingtype(){
        System.out.println(this.type);
    }
}
