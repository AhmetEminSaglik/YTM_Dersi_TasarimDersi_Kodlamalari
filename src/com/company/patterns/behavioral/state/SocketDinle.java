package com.company.patterns.behavioral.state;

public class SocketDinle implements ISocketState {
    @Override
    public void handle(Socket socket) {
        System.out.println("port soket dinleniyor " + socket.getPort());
        socket.setState(new SocketStateKapat());
    }
}
