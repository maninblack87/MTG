package Study;
import java.util.*;

public class DoWhile {
    public static void main(String[] args) {
        int answer;
        int guess;
        int tries = 0;

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int min = 1;
        int max = 10;
        answer = rand.nextInt(max-min-1)+min;
        do{
            System.out.print("정답을 추측해보세요(1-10):");
            guess = scan.nextInt();
            tries++;
            if(guess < answer){
                System.out.println("제시한 정수가 낮습니다.");
            }else if(guess > answer){
                System.out.println("제시한 정수가 높습니다.");
            }
        }while(answer != guess);
        System.out.printf("축하합니다. 시도 횟수 = %d\n", tries);
    }
}
