package ra.interface_demo;

public interface IDemo1 {
    //1. Gồm các hằng số - mặc định là public static final
    public static final int FIRST_NUMBER = 10;
    float SECOND_NUMBER = 8.5F;

    //2. Gồm các phương thức trừu tượng - trước Java 8 - mặc định là public abstract
    public abstract void test1();

    void test2();

}
