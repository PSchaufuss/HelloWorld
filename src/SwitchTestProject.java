public class SwitchTestProject
{
    public static void main(String[] args)
    {

            String day = "Monday";
            String result = "";

            result = switch(day)
             {
                 case "Saturday", "Sunday" -> "6am";
                 case "Monday" -> "8am";
                 default -> "7am";
             };

            System.out.println(result);
    }
}

/* Old Method:

switch(day)
             {
                 case "Saturday", "Sunday":
                     System.out.println("6am");
                     break;

                 case "Monday":
                     System.out.println("8am");
                     break;

                 default:
                     System.out.println("7am");


             } */

/* New Method

 switch(day)
             {
                 case "Saturday", "Sunday" -> System.out.println("6am");


                 case "Monday" -> System.out.println("8am");


                 default -> System.out.println("7am");


             } */

/*  New method with result

{

            String day = "Monday";
            String result = "";

            switch(day)
             {
                 case "Saturday", "Sunday" -> result = "6am";
                 case "Monday" -> result = "8am";
                 default -> result = "7am";
             }
        System.out.println(result);
    }

    */