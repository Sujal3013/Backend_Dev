package OOPS.interfaces;

public class Nicecar {
    private Engine engine;
    private Media media=new CDplayer();
    public Nicecar() {
        engine=new PowerEngine();
    }

    public Nicecar(Engine engine) {
        this.engine=engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        media.start();
    }
    public void stopMusic(){
        media.stop();
    }
    
    
}
