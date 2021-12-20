package com.company.patterns.behavioral.state;

public class SocketStateKapat implements ISocketState{
    @Override
    public void handle(Socket socket) {
        System.out.println("Socket state kapatildi "+socket.getPort());
        socket.setState(new SocketStateAc());

    }
}
