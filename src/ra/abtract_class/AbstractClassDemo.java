package ra.abtract_class;

public abstract class AbstractClassDemo {
    //1. Gồm các thuộc tính
    private int firstNumber;
    private String fullName;

    //2. Các constructor
    public AbstractClassDemo() {
    }

    public AbstractClassDemo(int firstNumber, String fullName) {
        this.firstNumber = firstNumber;
        this.fullName = fullName;
    }

    //3. Các phương thức triển khai
    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void hello() {
        System.out.println("Hello");
    }

    //4. Các phương thức trừu tượng - Không có phần triển khai - Không có thân
    public abstract void inputData();

    public abstract void displayData();
}
