package com.jieachan.combine.factoryandbuilder;

import com.jieachan.factory.phone.ApplePhone;

/**
 * @author jieachan
 * @create 2020/9/23
 */
public class ApplePhoneFactory implements PhoneFactory {
    private PhoneDirector director = new PhoneDirector();

    @Override
    public ApplePhone getPhone() {
        ApplePhoneBuilder builder = new ApplePhoneBuilder();
        return (ApplePhone) director.construct(builder);
    }
}
