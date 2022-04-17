public class OpeningState extends LiftState{

    @Override
    public void open() {
        System.out.println("电梯开启");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        //调用当前close
        super.context.close();
    }

    @Override
    public void run() {
        //什么都不做
    }

    @Override
    public void stop() {
        //什么都不做
    }
}
