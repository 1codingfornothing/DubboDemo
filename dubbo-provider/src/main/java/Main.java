import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //加载xml配置文件发布接口
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("METE-INF.spring");
        context.start();
        System.in.read();
    }
}
