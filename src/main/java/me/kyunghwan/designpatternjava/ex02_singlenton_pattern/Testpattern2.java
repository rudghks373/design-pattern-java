package me.kyunghwan.designpatternjava.ex02_singlenton_pattern;

public class Testpattern2 {

    static int nNum = 0;

    public static void main(String[] args) {

        Runnable task = () -> {
            try {
                nNum++;
                Database database = Database.getInstance(nNum + "번째 Database");
                System.out.println("This is the " + database.getName() + "!!!");
            }catch (Exception e){
                e.printStackTrace();
            }
        };

        for (int i = 0; i< 10; i++){
            Thread t = new Thread(task);
            t.start();
        }
        System.out.println("aa");
    }
}
