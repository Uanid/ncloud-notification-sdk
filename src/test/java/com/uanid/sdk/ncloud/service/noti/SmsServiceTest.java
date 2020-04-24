package com.uanid.sdk.ncloud.service.noti;

import com.nbp.ncp.nes.ApiClient;
import com.nbp.ncp.nes.ApiResponse;
import com.nbp.ncp.nes.auth.CredentialsProvider;
import com.nbp.ncp.nes.auth.PropertiesFileCredentialsProvider;
import com.nbp.ncp.nes.marshaller.JsonMarshaller;
import com.uanid.sdk.ncloud.service.noti.model.SendSmsRequest;
import com.uanid.sdk.ncloud.service.noti.model.SendSmsResponse;
import com.uanid.sdk.ncloud.service.noti.model.SmsMessage;
import com.uanid.sdk.ncloud.service.noti.model.SmsType;
import com.uanid.sdk.ncloud.service.util.Utils;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Properties;

/**
 * @author uanid
 * @since 2020-04-23
 */
public class SmsServiceTest {

    private SmsService smsService;
    private SmsProfile smsProfile;

    @Before
    public void setup() {
        CredentialsProvider provider = new PropertiesFileCredentialsProvider("credentials.properties");
        ApiClient apiClient = new ApiClient.ApiClientBuilder()
                .addMarshaller(JsonMarshaller.getInstance())
                .setCredentials(provider.getCredentials())
                .build();
        this.smsService = new SmsService(apiClient);

        Properties properties = Utils.loadPropertiesFromFile("smsProfile.properties");
        this.smsProfile = new SmsProfile(properties.getProperty("serviceId"), properties.getProperty("fromNumber"));
    }

    @Test
    public void test() {
        SendSmsRequest request = new SendSmsRequest();
        request.setType(SmsType.SMS);
        request.setContent("Faker fFFFF");

        //이렇게 쪼개면 개인정보 수집하는 봇이 수집 못할듯?
        request.setMessages(Collections.singletonList(new SmsMessage("010" + "3759" + "1038", null, null)));
        ApiResponse<SendSmsResponse> response = smsService.sendSms(request, smsProfile);
        System.out.println("AAa");
    }
}
