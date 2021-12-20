package com.company.patterns.behavioral.state;

public class SocketStateAc implements ISocketState {
    @Override
    public void handle(Socket socket) {
        System.out.println("Port acildi " + socket.getPort());

        socket.setState(new SocketDinle());
    }
}
