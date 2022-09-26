// Class
public class ClassAndObject {
    public static void main(String[] args) {
        //Object is created
        pen pen1 = new pen();//(className ObjectName = new Constractor);classname and constractor are same;
        // value assign
        pen1.color="black";// doubt = property of object is access by use in main function
        pen1.type="ballpoint";
        //Object call function
        pen1.write();
        pen1.printcolor();
        pen1.workingtype();
    }
}
//Class
class pen{
    String color;//property or attribute
    String type;
    //method
    public void write(){                                //method
        System.out.println("Writting something by pen");//method
    }                                                   //method
    //method
    public void printcolor(){
        System.out.println(this.color);//this = who call the printcolor funcyion by which object
    }
    //method
    public void workingtype(){
        System.out.println(this.type);
    }
}
