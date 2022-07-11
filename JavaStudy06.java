// 제로베이스 과제 06번
// 가상 대선 당선 시물레이션 프로그램
// 작성자 : 이상현
import java.util.Random;
import java.util.Arrays;
public class 과제6 {
    public static void main(String[] args){
        Random ran = new Random();
        int[] 대통령후보 = new int[4];
        String [] name = {"이재명","윤석열","심상정","안철수"};
        char a = '%';
        for( int i = 0; i<=10000; i++){
            int number = ran.nextInt(4  );
            double 투표수  = ((double) i/100);
            대통령후보[number]++;
            System.out.println(String.format("[투표 진행률] : %.2f%c, %d명 투표 => %s ",투표수,a, i,name[number]));

            for(int j=0; j<대통령후보.length; j++){
                double 개인투표수 = ((double) 대통령후보[j]/100);
                System.out.println(String.format("[기호 : %d] %s : %02.2f%c, (투표수 : %d)",j+1,name[j],개인투표수,a,대통령후보[j]));
            }
            System.out.println();
        }

        int max = 0;
        int top = 0;
        for (int i=0; i<대통령후보.length; i++){
            if(대통령후보[i]> max) {
                max = 대통령후보[i];
                top = i;
            } else if (대통령후보[i]==max) {
                System.out.println("당선자 동률 다시 시작해 주세요.");
                return;

            }
        }
        System.out.println("[투표결과] 당선인 : "+ name[top]);
    }


    }


