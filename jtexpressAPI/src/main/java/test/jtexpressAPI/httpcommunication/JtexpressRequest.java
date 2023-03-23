package test.jtexpressAPI.httpcommunication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import test.jtexpressAPI.model.Logistic_interfaceFormatcontent;

import java.awt.*;
import java.security.Signature;

@Data
public class JtexpressRequest {

    private Logistic_interfaceFormatcontent logistics_interface;
    private String data_digest;
    private String msg_type;
    private String eccompanyid;

    public JtexpressRequest(String data_digest, String msg_type, String eccompanyid,Logistic_interfaceFormatcontent logistics_interface) {
        this.data_digest = data_digest;
        this.msg_type = msg_type;
        this.eccompanyid = eccompanyid;
        this.logistics_interface = logistics_interface;
    }
}
