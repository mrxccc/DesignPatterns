package cn.mrxccc.builder;

/**
 * 〈客户类〉
 *
 * @author mrxccc
 * @create 2020/9/1
 */
public class Client {
    public static void main(String[] args)
    {
        Builder builder=new ConcreteBuilder();
        Director director=new Director(builder);
        Product product=director.construct();
        product.show();

    }
}