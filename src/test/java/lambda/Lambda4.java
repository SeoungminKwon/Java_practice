package lambda;

import java.util.ArrayList;

public class Lambda4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        //모든 요소 출력
        list.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        //3의배수 또는 2의 배수 제거
        list.removeIf(x-> x % 2 == 0 || x % 3 == 0);
    }
}
