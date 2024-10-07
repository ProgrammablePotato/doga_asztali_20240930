public class Network implements Connectable {
    @Override
    public void disconnectFromNetwork() {
        System.out.println("Lecsatlakozva a hálózatról!");
    }

    @Override
    public void connectToNetwork(String networkName) {
        System.out.printf("Csatlakozva a ehhez a hálózathoz: %s\n",networkName);
    }
}
