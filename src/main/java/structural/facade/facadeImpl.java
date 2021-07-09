package structural.facade;

//Facade is a structural design pattern that provides a simplified interface to a
// library,a framework, or any other complex set of classes.
public class facadeImpl {
    private CPUConfig objCPU = new CPUConfig();
    private RAMConfig objRAM = new RAMConfig();
    private HardDiskConfig objHD = new HardDiskConfig();


    public double GetPCPrice(String CPU, String RAM, String HD)
    {
       double cpuPrice = objCPU.GetCPUPrice(CPU);
       double ramPrice = objRAM.GetRAMPrice(RAM);
       double hdPrice = objHD.GetHDPrice(HD);

       return cpuPrice + ramPrice + hdPrice ;
    }
}
