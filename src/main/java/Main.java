public class Main {

    public static void main (String[] args){
        Girl girl = new Girl();
        System.out.println(girl.greeting());

        Boy boy = new Boy("tom");
        System.out.println(boy.greeting());

    }
}
