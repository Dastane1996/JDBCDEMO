package phoneBook.phoneJDBC;

public class Phone {
    private Integer callId;
    private String  name;
    private String type;
    private Integer  duration;

    public Phone() {
    }

    public Phone(Integer callId, String name, String type, Integer duration) {
        this.callId = callId;
        this.name = name;
        this.type = type;
        this.duration = duration;
    }

    public Integer getCallId() {
        return callId;
    }

    public void setCallId(Integer callId) {
        this.callId = callId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "callId=" + callId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", duration=" + duration +
                '}';
    }
}
