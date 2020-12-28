package ex02_singlenton;

import org.apache.commons.logging.Log;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class LogWriter {

    private static LogWriter singhleton = new LogWriter();

    private static BufferedWriter bw;

    private LogWriter() {
        try {
            bw = new BufferedWriter(new FileWriter("log.txt"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static LogWriter getInstance(){
        return singhleton;
    }

    public synchronized void log(String str){
        try {
            bw.write(str + "\n");
            bw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            super.finalize();
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
