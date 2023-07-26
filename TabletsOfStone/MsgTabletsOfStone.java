package TabletsOfStone;

public class MsgTabletsOfStone {
    private Integer _msgType;
    private String _msgData;

    @Override
    public String toString() {
        //String output = "Type=" + _msgType + " Data=" + _msgData;
        String output = String.format("Type=%d Data=%s", _msgType, _msgData);
        return output;
    }

    public Integer getType() {
        return _msgType;
    }

    public static int getPort() {
        return 5025;
    }

    public MsgTabletsOfStone(int msgType, String msgData) {
        _msgType = msgType;
        _msgData = msgData;
    }
}
