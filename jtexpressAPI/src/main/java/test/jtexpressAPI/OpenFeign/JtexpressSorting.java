package test.jtexpressAPI.OpenFeign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import test.jtexpressAPI.model.Logistics_interface;

import java.util.List;

@FeignClient(name = "JtexpressSorting",
        url = "https://test-api.jtexpress.ph/philippines-ifd-web/baseData/findSortingCode.do")
public interface JtexpressSorting {

    @PostMapping(path="/test/logi")
    List<Logistics_interface> getAdresse(@RequestBody Logistics_interface logistics_interface);

}
