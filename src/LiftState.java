public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }
    //电梯开启
    public abstract void open();
    //电梯关闭
    public abstract void close();
    //电梯停止
    public abstract void run();
    //电梯停止
    public abstract void stop();
}
