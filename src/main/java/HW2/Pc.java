package HW2;

public class Pc {
    private Case aCase;
    private MotherBoard motherBoard;
    private Monitor monitor;

    public Pc(Case aCase, MotherBoard motherBoard,Monitor monitor){
        this.aCase = aCase;
        this.motherBoard = motherBoard;
        this.monitor= monitor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Case getaCase() {
        return aCase;
    }

    public void setaCase(Case aCase) {
        this.aCase = aCase;
    }


    private void drawLogo(){
        monitor.drawPixel(3,6,"Blue");
    }
    public void powerUp(){
            aCase.pressPowerButton();
            drawLogo();
        motherBoard.loadProgram("MacBook Air");
    }

    @Override
    public String toString() {
        return "Pc{" +
                "aCase=" + aCase +
                ", motherBoard=" + motherBoard +
                ", monitor=" + monitor +
                '}';
    }
    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today" +"\n" + aCase +"\n" + motherBoard +"\n"+ monitor);
    }
}
