public class CNCMachine {
    String idMachine;
    int currentX, currentY;
    int percent;
    private PositionPoint[] programm;
    private boolean isMachineOn;
    private static final int maxWidth  = 1000;
    private static final int maxHeight = 1000;

    public CNCMachine(String idMachine) {
        this.idMachine = idMachine;
    }

    private void goNullPosition() {
        currentX = 0;
        currentY = 0;
    }

    private void moveToNewPosition(PositionPoint positionPoint) {
        currentX = positionPoint.getX();
        currentY = positionPoint.getY();
    }

    class Controller {
        public void execProgramm(cncHead head){
            if(programm.length==0){
                System.out.println("Программа не задана, выполнение не возможно");
            }
            goNullPosition();
            for (int i = 0; i < programm.length; i++) {
                if(programm[i].isOn()){
                    head.headOn();
                    head.setPower(programm[i].getPower());
                } else {
                    head.headOff();
                    head.setPower(0);
                }
                moveToNewPosition(programm[i]);
            }
        }

        public void loadProgramm(PositionPoint[] positionPoints){
            boolean allOk = true;
            programm = new PositionPoint[];
            for (PositionPoint pp: positionPoints){
                if (pp.getX()>maxWidth){
                    allOk = false;
                    System.out.println("Координата Х больше порогового значения("+maxWidth+"). "+pp.toString());
                }
                if (pp.getY()>maxHeight){
                    allOk = false;
                    System.out.println("Координата Y больше порогового значения("+maxHeight+"). "+pp.toString());
                }
            }
            if (allOk){
                programm = positionPoints;
            } else {
                System.out.println("В массиве объектов есть ошибочные значения, загрузка программы прервана");
            }

        }
    }

}
