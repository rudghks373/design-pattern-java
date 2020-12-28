package ex02_singlenton;

public class LogTest {

    public static void main(String[] args) {
        LogWriter logWriter;

        logWriter = LogWriter.getInstance();
        logWriter.log("테스트1");

        logWriter = LogWriter.getInstance();
        logWriter.log("테스트2");
    }

}
