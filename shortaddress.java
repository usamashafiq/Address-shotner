package testserver;

import java.util.Scanner;

public class shortaddress {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the address ");
        String address = sc.nextLine();

        System.out.println("Short address is "+shortaddress(address));

    }
    //this fun use to short the address like givre format
    public static String shortaddress(String input) {

        //split the string by comma
        String[] sap = input.split(",");
        int len = sap.length;
        //locate the Passcode in address
        String Passcode = sap[len-1];
        //locate the first number of the address
        String[] Num = input.split("\\s");
        String Fnum = Num[0];

        if (CheckPasscode(Passcode)&&checkFnum(Fnum)&&input!=null&&!input.equals("")){

           return  sap[0]+Passcode;
        }

        else {


            return null;
        }

    }
     //that fun check tha Passcode format adddaa (alphabetic character and d is a digit)
    public static Boolean CheckPasscode(String input){
        //char check at first and second last index to check format
        char f,s,t,tl,sl,l;
        //remove all spaces in Passcode
        String P = input.replaceAll("\\s","");
        //locate the all char position one by one
        f=P.charAt(0);
        s=P.charAt(1);
        t=P.charAt(2);
        tl=P.charAt(3);
        sl=P.charAt(4);
        l=P.charAt(5);
        //String number to int (ASCII) to check three digit
        int a,b,c;
        a=s;
        b=t;
        c=tl;

        return (a >= 48 && a <= 57) && (b >= 48 && b <= 57) && (c >= 48 && c <= 57)
                && (f >= 'A' && f <= 'Z') && (sl >= 'A' && sl <= 'Z') && (l >= 'A' && l <= 'Z');
    }
     //that fun check tha first number is a integer for address format

    public static Boolean checkFnum(String Fnum){

        int lenN = Fnum.length();

        char F ;
        int a ;
        int count =0;
        //loop life is depend on number lenght
        for(int i=0;i<lenN;i++){
            //check number one by one
            F = Fnum.charAt(i);
            //string to int (ASCII)
            a =F;

            if(a>=48&&a<=57){

                count = count+1;

                if(lenN==count){

                    return true;
                }


            }



        }
        return false;



    }

}
