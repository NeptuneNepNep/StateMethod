public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new RunningState());
        context.open();
        context.stop();
        context.close();
    }
}
