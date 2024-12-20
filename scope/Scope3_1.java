// 이번에는 Scope에 대해서 배운다
package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int a = 10;
        int temp = 0;
        if (a > 0) {
            temp = a + 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("a = " + a);
    }
}
/* Temp 변수가 if절 밖에서 불필요하게 겉돌고있지?
그러면 1.비효율적으로 메모리 사용하고 2. 코드가 복잡해
3_2에서 해결해보자
*/