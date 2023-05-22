public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener success = System.out::println;
        OnTaskErrorListener failure = System.out::println;
        Worker worker = new Worker(success, failure);
        worker.start();
    }
}

