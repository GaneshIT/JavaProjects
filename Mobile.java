package corejava;

public class Mobile {
    private int IMENumber;// Encapsulation
    public String model;

    public void Dial() {
        System.out.println("Dialling....");
    }

    public void Recieve() {
        System.out.println("Receiving....");
    }

    public int GetImeNumber(int imeNum) {
        return imeNum;
    }

    public void SendMessage() {
        System.out.println("Mobile class send msg");
    }
}

// //Method declaration
// void methodname();

// //method calling
// methodname();

// //method definition
// void methoname(){

// }