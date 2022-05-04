package exam_02.models;

public class Subject {
    public String code;
    public String name;
    public String version;
    public String level;
    public int time;

    public Subject() {

    }

    public Subject(String code, String name, String version, String level, int time) {
        this.code = code;
        this.name = name;
        this.version = version;
        this.level = level;
        this.time = time;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", level='" + level + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
