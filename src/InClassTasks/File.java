package InClassTasks;

public abstract class File {

    abstract void open();

    void edit(){
        System.out.println("editing");
    };

    void close(){
        System.out.println("closing");
    }
}

class JAvaFile extends File{
void open(){
    System.out.println("open with notepad or sublime");
}
}

class WordFile extends File{
void open(){
    System.out.println("open with Microsoft Word");
}
}

abstract class PdfFile extends File{

}

