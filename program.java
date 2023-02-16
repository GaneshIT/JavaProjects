package corejava;

import java.util.Scanner;

class program {
    public static void main(String[] args) {
        String a = "101";
        try {
            int[] values = new int[2];
            values[0] = 100;
            values[1] = 200;
            values[2] = 300;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {

        }
        Report reportObj = new Report("pdf", "IT");
        reportObj.DisplayReport();
        // Samsung samsungObj=new Samsung();
        // samsungObj.SendMessage();
        // samsungObj.CameraClick("",101);
        // Mobile mobileObj = new Mobile();
        // mobileObj.model = "M101";
        // mobileObj.Dial();
        // mobileObj.Recieve();
        // int output = mobileObj.GetImeNumber(101);
        // System.out.print(output);
        // product p = new product();
        // p.AddProduct();
        // p.DeleteProduct();
        // String result = p.GetProductName();
        // System.out.print(result);
        // Scanner s = new Scanner(System.in);
        // System.out.print("Enter number: ");
        // boolean a = s.nextBoolean();
        // System.out.println("You entered number: " + a);
        // for (int i = 0; i < 5; i++) {
        // System.out.print(i);
        // }
    }
}

// 11111
// 1111
// 111
// 11
// 1
