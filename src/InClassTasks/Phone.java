package InClassTasks;

public abstract class Phone {

    abstract void unlockPhone();

    abstract void displayPictures();

    abstract void SendText();


}


class Iphone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("go to IGallery");
    }

    @Override
    void SendText() {
        System.out.println("Send with IMessage");

    }

    void unlockPhone(){
        System.out.println("Face ID");
    }
}

class Samsung extends Phone{
    @Override
    void unlockPhone() {
        System.out.println("Swipe up");
    }

    @Override
    void SendText() {
        System.out.println("Send with SamsungMessage");

    }

    void displayPictures(){
        System.out.println("Go to gallery!");
    }
}