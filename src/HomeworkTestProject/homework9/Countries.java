package HomeworkTestProject.homework9;

public class Countries {
    public static void main(String[] args) {

        //6) Create an array of countries.
        // While retrieving all values from an array
        // print capital for each country choose any five countries.

        String [] countries={"Turkey","Spain","Germany","UK", "USA"};
        String [] capital={"Ankara","Madrid","Berlin","London","Washington"};

        for (int i=0;i<=5;i++){
            System.out.println(countries[i]+" "+capital[i]);



          /* switch (countries[4]){
                    case "Turkey":
                    System.out.println("Ankara");
                        break;
                    case "Spain":
                    System.out.println("Madrid");
                        break;
               case "Germany":
                        System.out.println("Berlin");
                   break;
               case "UK":
                   System.out.println("London");
                   break;
               case "USA":
                   System.out.println("Washington");
                   break;
               default:
                   System.out.println("not listed");*/



        }
    }
}
