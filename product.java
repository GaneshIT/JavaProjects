package corejava;

public class product extends p {
    @Override
    public void AddProduct() {
        System.out.println("Add Proudct");
    }

    void DeleteProduct() {
        System.out.println("Delete Proudct");
    }

    String GetProductName() {
        String name = "Laptop";
        return name;
    }
}
