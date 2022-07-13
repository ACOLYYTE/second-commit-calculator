package Calculator;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double ArgumentOne=sc.nextDouble();
        String Operator =sc.next();
        double ArgumentTwo=sc.nextDouble();
        try{
            if(Operator.equals("+") || Operator.equals("-") || Operator.equals("*") || Operator.equals("/")){}else{System.out.println("Operation Error!");}
            if(ArgumentTwo!=0.0){
                if(Operator.equals("+")){System.out.println(ArgumentOne+ArgumentTwo);}
                if(Operator.equals("-")){System.out.println(ArgumentOne-ArgumentTwo);}
                if(Operator.equals("*")){System.out.println(ArgumentOne*ArgumentTwo);}
                if(Operator.equals("/")){System.out.println(ArgumentOne/ArgumentTwo);}
            }else{System.out.println("Error! Division by zero");}
        }catch (Exception ex){System.out.println("Error! Not number");}


        FileReader fr = new FileReader("src/Calculator/input.txt");
        Scanner scan = new Scanner(fr);
        while(scan.hasNextLine()){System.out.println(scan.nextLine());}
        fr.close();
        FileWriter fw = new FileWriter("src/Calculator/output.txt");
        fw.write("holy fuck");
        fw.close();


    }
}
