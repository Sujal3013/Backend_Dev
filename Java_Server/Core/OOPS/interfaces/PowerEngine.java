package OOPS.interfaces;

public class PowerEngine  implements Engine{

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Power Engine started.");
        
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Power Engine stopped.");
        // throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("Power Engine accelerating");
        // throw new UnsupportedOperationException("Unimplemented method 'acc'");
    }
    
}
