package test.jtexpressAPI.endpoint;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.jtexpressAPI.OpenFeign.JtexpressApi;
import test.jtexpressAPI.configuration.JtexpressConfig;
import test.jtexpressAPI.httpcommunication.JtexpressRequest;
import test.jtexpressAPI.model.Logistic_interfaceFormatcontent;

import java.awt.*;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;

@RestController
@RequestMapping("/api")
@Data @AllArgsConstructor
public class JtexpressStartAccess {


   private final JtexpressApi jtexpressApi;

    private final JtexpressConfig jtexpressConfig;


    @GetMapping(path="/testaccess")
    public String index() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return "Data digest is : "+jtexpressConfig.init();
    }

    @PostMapping(path="/getAdress")
    public ResponseEntity<?> testlogi(@RequestBody Logistic_interfaceFormatcontent logistics_interface,
                                      String data_digest,
                                      String msg_type,
                                      String eccompanyid)
    {
        JtexpressRequest jtexpressRequest = new JtexpressRequest(data_digest,msg_type,eccompanyid,logistics_interface);

        return ResponseEntity.ok(jtexpressApi.getAdresse(jtexpressRequest));
    }

}
