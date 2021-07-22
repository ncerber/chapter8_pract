public class cncShop {
    void execPaintWork() {
        CNCMachine cncMachine = new CNCMachine("Paint machine");
        CNCMachine.Controller controller = cncMachine.controller;
        controller.loadProgramm(new PositionPoint[]{
                new PositionPoint(12, 12, 2, true),
                new PositionPoint(34, 45, 0, false),
                new PositionPoint(56, 23, 9, true)
        });

        controller.execProgramm(new cncHead() {
            @Override
            public void headOn() {
                System.out.println("AirBrush on");
            }

            @Override
            public void headOff() {
                System.out.println("AirBrush off");
            }

            @Override
            public void setPower(int powerValue) {
                System.out.println("The power is " + powerValue);
            }
        });
    }

    public void execMillingWork(){
        CNCMachine cncMachine = new CNCMachine("Milling machine");
        CNCMachine.Controller controller = cncMachine.controller;
        controller.loadProgramm(new PositionPoint[]{
                new PositionPoint(22, 172, 2, true),
                new PositionPoint(134, 5, 0, false),
                new PositionPoint(96, 23, 9, true)
        });

        controller.execProgramm(new cncHead() {
            @Override
            public void headOn() {
                System.out.println("Cutter on");
            }

            @Override
            public void headOff() {
                System.out.println("Cutter off");
            }

            @Override
            public void setPower(int powerValue) {
                System.out.println("The power is " + powerValue);
            }
        });
    }

    public void execWeldingWork(){
        CNCMachine cncMachine = new CNCMachine("Welding machine");
        CNCMachine.Controller controller = cncMachine.controller;
        controller.loadProgramm(new PositionPoint[]{
                new PositionPoint(22, 172, 2, true),
                new PositionPoint(134, 5, 0, false),
                new PositionPoint(96, 23, 9, true)
        });

        controller.execProgramm(new cncHead() {
            @Override
            public void headOn() {
                System.out.println("Welding on");
            }

            @Override
            public void headOff() {
                System.out.println("Welding off");
            }

            @Override
            public void setPower(int powerValue) {
                System.out.println("The power is " + powerValue);
            }
        });
    }
}
