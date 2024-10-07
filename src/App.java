public class App {
    public static void main(String[] args) throws Exception {
        Network nw = new Network();
        nw.connectToNetwork("sajat_halozat_:3");
        nw.disconnectFromNetwork();
    }
}
