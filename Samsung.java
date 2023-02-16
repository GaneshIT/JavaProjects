package corejava;

public class Samsung extends Mobile {
    public void CameraClick() {
        System.out.println("Default camera");
    }

    public void CameraClick(String cameraOption) {
        System.out.println("Camera with options");
    }

    public void CameraClick(String cameraOption, int model) {
        System.out.println("Camera with options");
    }

    @Override
    public void SendMessage() {
        super.SendMessage();// super class and method
        System.out.println("Samsung class message");
    }
}
