package Assignment;

import Methods.Util;

/**
 * @Author : Samyam Kafle
 * @Portfolio : https://samyamkafle.com.np
 * @Project : JavaVariableAssignment
 * @CreatedDate : 21/11/2024, Thursday
 **/
public class GstCalculator {
    public static void main(String[] args) {
//        GstCalculator gstCalculator = new GstCalculator();
//        gstCalculator.test();
          test();
//        double planCost = 80000d;
//        int gstValue = 32;
//        double gstPercent = (gstValue/100d);
//        double gst = (gstPercent * planCost); // 0.22 * 10000 => 2200
//        System.out.println(gstValue +"%  GST : $" + gst);
//        System.out.println("Original plan Cost $"+ planCost );
//        System.out.println("plan Cost after adding "+ gst +" GST : $" + (planCost + gst));

        /*
        * 22% GST : $2200
        * Original plan cost $10000
        * Plan cost after adding 2200 GST total amount : $12200
        * */

        /*
        * original plan cost = 699 (for plan without gst)
        * 18% of 699 ==> (amount) GST
        * Total payable by the customer => original plan cost + GST =>  699 + (18% * 699))
        * */
    }

    public static void test(){
        Util util = new Util();
        System.out.println("GST function : xyz    ===> "+util.sum(90,50));
    }
}
