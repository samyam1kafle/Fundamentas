/**
 * @Author : Samyam Kafle
 * @Portfolio : https://samyamkafle.com.np
 * @Project : ${PROJECT_NAME}
 * @CreatedDate : ${DAY}/${MONTH}/${YEAR}, ${DAY_NAME_FULL}
 **/
public class Main {
    public static void main(String[] args) {
        // wap to calculate the jioFiber silver plan which costs 699 + gst 18% calculate the final plat cost

        double planCost = 80000d;
        double gst = ((32d/100d) * 80000);
        System.out.println(" 32% GST : " + gst);
        System.out.println("plan Cost after adding 32% GST : " + (planCost + gst));

    }
}