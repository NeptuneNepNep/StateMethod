public class StoppingState extends LiftState{

    @Override
    public void open() {super.context.setLiftState(Context.OPENING_STATE);
        //调用当前close
        super.context.open();
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        //调用当前close
        super.context.close();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
      System.out.println("电梯停了");
    }
}
