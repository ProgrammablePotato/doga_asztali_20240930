/*
* File: App.java
* Author: Mihelik Tamás
* Copyright: 2021, Mihelik Tamás
* Date: 2024-10-07
* Web: -
* Licenc: MIT
*
*/

public class App {
    public static void main(String[] args) throws Exception {
        Network nw = new Network();
        nw.connectToNetwork("sajat_halozat_:3");
        nw.disconnectFromNetwork();
    }
}
