package structural.facade;

public class Client {
    private  facadeImpl objFacadeImpl  = new facadeImpl();

    public void main(String[] args){
       System.out.println( objFacadeImpl.GetPCPrice("Inteli7", "RAM1", "HD1"));
        System.out.println( objFacadeImpl.GetPCPrice("Inteli9", "RAM2", "HD3"));
        System.out.println( objFacadeImpl.GetPCPrice("AMD", "RAM3", "HD2"));
    }
}
