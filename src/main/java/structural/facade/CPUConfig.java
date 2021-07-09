package structural.facade;

import java.util.HashMap;
import java.util.Map;

public class CPUConfig {

    private Map<String, Double> Price = new HashMap<>()
    {
        {
            put("Inteli7",10000.00) ;
            put("Inteli9",30000.00) ;
            put("Inteli7",15000.00) ;
        }
    };

    public double GetCPUPrice(String CPUName){
        return Price.get(CPUName);
    }
}
