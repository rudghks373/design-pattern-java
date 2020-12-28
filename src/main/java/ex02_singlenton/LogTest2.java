package ex02_singlenton;

import org.apache.commons.logging.Log;

public class LogTest2 {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++){
            Thread t = new ThreadSub(i);
            t.start();
        }

    }

}

class ThreadSub extends Thread{
    int num;

    public ThreadSub(int num){
        this.num = num;
    }

    @Override
    public void run() {
        LogWriter logWriter = LogWriter.getInstance();
        if(num < 10)
            logWriter.log("*** 0" + num + " ***");
        else
            logWriter.log("*** " + num + " ***");
    }
}
