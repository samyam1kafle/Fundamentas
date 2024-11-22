package Assignment;

/**
 * @Author : Samyam Kafle
 * @Portfolio : https://samyamkafle.com.np
 * @Project : JavaVariableAssignment
 * @CreatedDate : 21/11/2024, Thursday
 **/
public class SwapTwoVariables {
    public static void main(String[] args) {
        int firstValue = 4; // firstValue => 15
        int secondValue = 3; // secondValue => 30
        System.out.println("Before Swapping First Value => " + firstValue
                + " Second Value => " + secondValue
        );
        int temp = firstValue; // temp => 15
        firstValue = secondValue; // firstValue => 30
        secondValue = temp; // secondValue => 15

        System.out.println("After Swapping First Value => " + firstValue
                + " Second Value => " + secondValue
        );

        /*
        * Before Swapping First Value => 15 Second Value => 30
        * After Swapping First Value => 30 Second Value => 15
        * */
    }
}
