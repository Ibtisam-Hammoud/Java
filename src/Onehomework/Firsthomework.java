package Onehomework;

import java.util.Scanner;

public class Firsthomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        int max; // لتخزين أكبر رقم
        int num; // الرقم الذي سيدخله المستخدم

        System.out.println("Enter number 1:");
        max = input.nextInt(); // نعتبر أول رقم هو الأكبر مؤقتاً

        // حلقة لإدخال باقي الأرقام (4 أرقام متبقية)
        for (int i = 2; i <= 5; i++) {
            System.out.println("Enter number " + i + ":");
            num = input.nextInt();

            if (num > max) { // إذا الرقم الحالي أكبر من max
                max = num;   // حدث max
            }
        }

        System.out.println("The largest number is: " + max);


	}

}
