package test.jtexpressAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Logistics_interface {

   private String customerid;
    private String province;
    private String city;
    private String area;
    private String sortingcode;


}
