package lr4.json.manager;

import java.io.IOException;

interface Type {
    Object getJason(String path, Object castTo) throws IOException;
    void to_Jason(String path) throws IOException;
    void setSerializable(Object serializable);
}
