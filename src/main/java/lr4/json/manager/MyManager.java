package lr4.json.manager;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyManager implements Type {
    private MyManager() { };

    private static MyManager instance;
    private final Gson gson = new Gson();

    private Object serializable;

    public static MyManager getInstance() {
        if(instance == null) {
            instance = new MyManager();
        }
        return instance;
    }

    @Override
    public Object getJason(String path, Object castTo) throws IOException {
        return gson.fromJson(new FileReader(path), (java.lang.reflect.Type) castTo);
    }

    @Override
    public void to_Jason(String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        gson.toJson(serializable, fileWriter);
        fileWriter.close();
    }

    @Override
    public void setSerializable(Object obj) {
        this.serializable = obj;
    }
}
