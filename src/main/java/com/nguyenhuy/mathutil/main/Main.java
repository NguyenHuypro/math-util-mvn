/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyenhuy.mathutil.main;

import com.nguyenhuy.mathutil.core.MathUtility;

/**
 *
 * @author huy16
 */
public class Main {
   
    public static void main(String[] args) {
        //test thử hàm mình vừa viết tính giai thừa có
        //đúng ko
        //chuẩn bị bộ data test, test case
        //Test Case #1: Check ò getFatorial() runs
        //              well with n = 0
        // Test Procedures/:
        //              Given n = 0
        //              Invoke getFactorial(n = 0)
        
        //Expected result: 1; //0! == 1???
        long expected = 1; //em hi vọng là 1 được trả về
        int n = 0;      //nếu anh đưa vào 0!
        long actual = MathUtility.getFactorial(n); // chạy hàm mới biết
        
        //in ra và tự kết luận có giống kì vọng hay ko
        System.out.println(n + "! | expected = " + expected +
                                    " | actual = " + actual);
        
        
        //Test Case #2: Check if getFatorial() runs
        //              well with n = 1
        // Test Procedures/:
        //              Given n = 1
        //              Invoke getFactorial(n = 1)
        
        //Expected result: 1; //1! == 1???
        System.out.println( "1! | expected = 1" +
                                    " | actual = " + MathUtility.getFactorial(1));
    }
}
