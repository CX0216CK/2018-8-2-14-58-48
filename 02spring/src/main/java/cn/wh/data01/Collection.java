package cn.wh.data01;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Collection {
    private List<String>list;
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "list=" + list +
                ", properties=" + properties +
                ", map=" + map +
                '}';
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    private Map<String,String> map;
    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
