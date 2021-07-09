package structural.facade;

import java.util.HashMap;
import java.util.Map;

public class RAMConfig {
    private Map<String, Double> Price = new HashMap<>()
    {
        {
            put("RAM1",1000.00) ;
            put("RAM2",3000.00) ;
            put("RAM3",1500.00) ;
        }
    };

    public double GetRAMPrice(String RAMPrice){
        return Price.get(RAMPrice);
    }
}
