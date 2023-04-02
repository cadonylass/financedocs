package com.mycompany.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import io.github.cdimascio.dotenv.Dotenv;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App{


    public static void main(String[] args ) {
        Dotenv dotenv = Dotenv.load();

        String apiKey = dotenv.get("API_KEY");





        SpringApplication.run(App.class, args);

    }

//            String month = "ling";
//
//            switch (month) {
//
//                case 2:
//
//                    System.out.println("February");
//
//                    break;
//
//                case 3:
//
//                    System.out.println("March");
//
//                    break;
//
//                case 4:
//
//                    System.out.println("April");
//
//                    break;
//
//                case 5:
//
//                    System.out.println("May");
//
//                    break;
//
//                case 6:
//
//                    System.out.println("June");
//
//                    break;
//
//                default: System.out.println("In next half");
//
//            }




//        String[] actual = {"q", "s", "q"};
//        String converted = String.join(",", actual);
//        System.out.println(converted);
//        System.out.println(actual);
//
//        int n =   12345;
//        int rev = 0;
//
//        while (n > 0) {
//            int rem = n % 10;
//            rev = (10 * rev) + rem;
//            n = n / 10;
//
//        }
//
//        System.out.println(rev);
//        String.
//                String text = "Sakkettyyzz";
//        char[] ch = text.toCharArray();
//        int count = 0;
//        for (int i = 0; i < ch.length; i++) {
//
//            for (int j = i + 1; j < ch.length; j++) {
//                if (ch[i] == ch[j]) {
//                    System.out.println(ch[j]);
//                    count++;
//                    break;
//                }
//            }
//        }
//        System.out.println(count);

//            int init_builder= new Pizza.Builder("2","1").mushroomsCountint(9);
//            System.out.println(init_builder);
//    Pizza pizza = new Pizza.Builder("large", "thin")
//            .cheeseCount(1)
//            .pepperoniCount(1)
//            .build();
//        String convertedToString = String.valueOf(pizza);
//        System.out.println(convertedToString.getClass().getSimpleName());
//        System.out.println(convertedToString.toString());
//        System.out.println(pizza.toString());
//
//


    //    System.out.println( "Hello World!" );
        googleCashflowstatementBuilder init_googleCashflowstatementBuilder = new googleCashflowstatementBuilder();
//        init_googleCashflowstatementBuilder.getoperationalflowtotal();
//        init_googleCashflowstatementBuilder.getinvestingflowtotal();
//        init_googleCashflowstatementBuilder.getfinancingflowtotal();
//        init_googleCashflowstatementBuilder.gettotalcf();
       // init_googleCashflowstatementBuilder.getdate();
    }

