
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        int passingSum = 0;
        int passingCount = 0;
        int[] grades = new int[6];  // YENİ: Not dağılımı için dizi
        
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            
            if (point == -1) {
                break;
            }
            
            if (point >= 0 && point <= 100) {
                sum += point;
                count++;
                
                if (point >= 50) {
                    passingSum += point;
                    passingCount++;
                }
                
                // Not hesapla ve diziye ekle (YENİ)
                int grade = pointsToGrade(point);
                grades[grade]++;
            }
        }
        
        // Ortalamalar
        double average = 1.0 * sum / count;
        System.out.println("Point average (all): " + average);
        
        if (passingCount > 0) {
            double passingAverage = 1.0 * passingSum / passingCount;
            System.out.println("Point average (passing): " + passingAverage);
        } else {
            System.out.println("Point average (passing): -");
        }
        
        // Geçme yüzdesi
        double passPercentage = 100.0 * passingCount / count;
        System.out.println("Pass percentage: " + passPercentage);
        
        // Not dağılımını yazdır (YENİ)
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {  // 5'ten 0'a doğru
            System.out.print(i + ": ");
            printStars(grades[i]);
        }
    }
    
    // Puanı nota çevir
    public static int pointsToGrade(int points) {
        if (points < 50) {
            return 0;
        } else if (points < 60) {
            return 1;
        } else if (points < 70) {
            return 2;
        } else if (points < 80) {
            return 3;
        } else if (points < 90) {
            return 4;
        } else {
            return 5;
        }
    }
    
    // Yıldız yazdır
    public static void printStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
   
