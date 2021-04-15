//定义服务端接口的实现类
public class ProvideServiceImpl implements ProviderService {

    public String Hello(String name) {
        return "hello" + name;
    }
}
