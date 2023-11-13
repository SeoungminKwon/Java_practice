package lambda;

@FunctionalInterface
interface MyFunction2{
    void myMethod();
}
public class Lambda2 {
    public static void main(String[] args) {
        MyFunction f = () ->{}; // (MyFunchtion)() ->{} 생략되어있음
        Object obj = (MyFunction)() ->{}; //  (Object)(MyFunction)() ->{}
        String str = ((Object)(MyFunction)() ->{}).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

//        System.out.println(() ->{}); //에러
        System.out.println((MyFunction2)() ->{});
//        System.out.println((MyFunction2)()->{}).toString()); //에러
        System.out.println(((Object)(MyFunction2)()->{}).toString());
    }

}
