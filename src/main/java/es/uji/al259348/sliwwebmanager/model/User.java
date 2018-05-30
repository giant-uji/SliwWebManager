package es.uji.al259348.sliwwebmanager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Mapping;
import org.springframework.data.elasticsearch.annotations.Setting;

import java.util.ArrayList;
import java.util.List;

@Document(indexName = "sliw", type = "users")
@Setting(settingPath = "elasticsearch/settings.json")
@Mapping(mappingPath = "elasticsearch/mappings.users.json")
public class User {

    @Id
    private String id;
    private String name;
    private List<Location> locations;
    private boolean configured;
    private List<String> bssids; // BSSIDs used in classifiers
    private List<String> classifiers; // Classifiers in base64

    public User() {
        this.locations = new ArrayList<>();
        this.bssids = new ArrayList<>();
        this.classifiers = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public boolean isConfigured() {
        return configured;
    }

    public void setConfigured(boolean configured) {
        this.configured = configured;
    }

    public List<String> getBssids() {
        return bssids;
    }

    public void setBssids(List<String> bssids) {
        this.bssids = bssids;
    }

    public List<String> getClassifiers() {
        return classifiers;
    }

    public void setClassifiers(List<String> classifiers) {
        this.classifiers = classifiers;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", locations=" + locations +
                ", configured=" + configured +
                ", bssids=" + bssids +
                ", classifiers=" + classifiers +
                '}';
    }

}
