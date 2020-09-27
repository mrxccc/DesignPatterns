package jieachan.factory.abstractfactory;

import jieachan.factory.headset.AppleHeadset;
import jieachan.factory.phone.ApplePhone;

/**
 * 苹果工厂
 * @author jieachan
 * @create 2020/9/23
 */
public class AppleFactory implements Factory{
    @Override
    public ApplePhone getPhone() {
        ApplePhone applePhone = new ApplePhone();
        applePhone.setBrand("Apple");
        return applePhone;
    }

    @Override
    public AppleHeadset getHeadset() {
        AppleHeadset appleHeadset = new AppleHeadset();
        appleHeadset.setBrand("Apple");
        return appleHeadset;
    }

}