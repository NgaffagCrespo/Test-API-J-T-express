package test.jtexpressAPI.OpenFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import test.jtexpressAPI.httpcommunication.JtexpressRequest;


@FeignClient(name = "JtexpressAdress",
        url = "https://test-api.jtexpress.ph/philippines-ifd-web/baseData/findProvCityAreaList.do")
public interface JtexpressApi {

    @PostMapping(path="/test/logi")
    ResponseEntity<?> getAdresse(@RequestBody JtexpressRequest jtexpressRequest);

}
