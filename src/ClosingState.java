public class ClosingState extends LiftState{


    @Override
    public void open() {super.context.setLiftState(Context.OPENING_STATE);
        //调用当前close
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯关了");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
