package structural.facade;

import java.util.HashMap;
import java.util.Map;

public class HardDiskConfig {
    private Map<String, Double> Price = new HashMap<>()
    {
        {
            put("HD1",1000.00) ;
            put("HD2",3000.00) ;
            put("HD3",1500.00) ;
        }
    };


    public double GetHDPrice(String HDName){
        return Price.get(HDName);
    }
}
