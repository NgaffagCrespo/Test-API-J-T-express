package test.jtexpressAPI.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.DigestUtils;
import test.jtexpressAPI.model.Logistic_interfaceFormatcontent;
import test.jtexpressAPI.model.Logistics_interface;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;

@Configuration
@Data @AllArgsConstructor @NoArgsConstructor
public class JtexpressConfig {

    @Value("${jtexpress.api.key}")
    String JtKey;

    @Value("${jtexpress.api.eccompanyid}")
    String JtEconomicId;

    public void init() throws RuntimeException, NoSuchAlgorithmException, UnsupportedEncodingException {

       // Logistic_interfaceFormatcontent logistics_interface = new Logistic_interfaceFormatcontent("1","KALIDERES","JAKARTA","CHARGE","EZ");

        MessageDigest MD5Util = MessageDigest.getInstance("MD5");

       // Signature data_digest = new String(Base64.encodeBase64(MD5Util.code32(logistics_interface + JtKey, "UTF-8").getBytes("UTF-8")));
    }

}
