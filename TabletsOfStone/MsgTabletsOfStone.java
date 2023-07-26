package TabletsOfStone;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MsgTabletsOfStone implements Serializable {
    private static final long serialVersionUID = 1;

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

    private void writeObject(ObjectOutputStream ooStream) throws IOException {
        ooStream.writeObject(_msgType);
        ooStream.writeObject(_msgData);
    }

    private void readObject(ObjectInputStream oiStream) throws ClassNotFoundException, IOException {
        _msgType = (Integer)oiStream.readObject();
        _msgData = (String)oiStream.readObject();
    }
}
