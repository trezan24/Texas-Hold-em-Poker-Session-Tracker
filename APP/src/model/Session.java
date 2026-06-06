package model;

import java.time.LocalDateTime;

public class Session {
    private int id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String location;
    private String note;

    public Session(int id, LocalDateTime startTime, LocalDateTime endTime, String location, String note) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getLocation() {
        return location;
    }

    public String getNote() {
        return note;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public long getDuration() {
        return java.time.Duration.between(startTime, endTime).toHours();
    }
}
