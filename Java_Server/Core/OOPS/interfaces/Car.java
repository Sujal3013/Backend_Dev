package OOPS.interfaces;

public class Car implements Engine,Brake,Media{
    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println("I apply brake.");
        
    }
    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("I start.");
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("I stop.");
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("I accelerate");
        throw new UnsupportedOperationException("Unimplemented method 'acc'");
    }
    
}
