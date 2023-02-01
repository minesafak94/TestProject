package class15;

public class Task1 {


    /*Create a method createEmail().
    Based on values of users name, lastName and email type,
    your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or

     */
    String createEmail(String name,String lastName,String eMail){
        return name+lastName+"@"+eMail+".com";
    }

    }

