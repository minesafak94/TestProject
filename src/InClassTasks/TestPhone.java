package InClassTasks;

public class TestPhone {

    public static void main(String[] args) {

        Phone [] phone={new Iphone(),new Samsung()}; //if in child class declared as abstract it will give u an error
        // instantiating an abstract class isn't possible

        for (Phone po:phone){
            po.displayPictures();
            po.unlockPhone();
            po.SendText();
        }
    }
}
