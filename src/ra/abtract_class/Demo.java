package ra.abtract_class;

public class Demo extends AbstractClass {

    @Override
    public int addTwoNumber(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public void inputData() {
        System.out.println("Nhâp dữ liệu cho đối tượng");
    }

    @Override
    public void displayData() {
        System.out.println("Hiển thị dữ liệu cho đối tuợng");
    }
}
