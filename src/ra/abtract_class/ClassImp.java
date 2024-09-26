package ra.abtract_class;

public class ClassImp {
    public static void main(String[] args) {
        //Khai báo đối tượng từ lớp AbstractClassDemo - Khởi tạo đối tượng gián tiếp
        AbstractClassDemo ccd = new AbstractClassDemo() {
            @Override
            public void inputData() {
                System.out.println("Triển khai phương thức trừu tượng inputData ");
            }

            @Override
            public void displayData() {
                System.out.println("triển khai phương thưc trừu tượng displayData");
            }
        };
    }
}
