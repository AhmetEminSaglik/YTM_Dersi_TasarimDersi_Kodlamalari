package com.company.patterns.behavioral.state;

public class Socket {
    public int port;
    private ISocketState state;

    public Socket(int port) {
        this.port = port;
        state = new SocketStateAc();
    }

    public void Do() {
        state.handle(this);
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ISocketState getState() {
        return state;
    }

    public void setState(ISocketState state) {
        this.state = state;
    }
}
