import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("consumer.xml");
        ProviderService providerService = (ProviderService)con.getBean("ProviderService");
    }
}
