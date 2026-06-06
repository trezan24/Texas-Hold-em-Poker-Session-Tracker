package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Session implements Serializable {
    private int id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String location;
    private String note;

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public Session(int id, String startTime, String endTime, String location, String note) {
        this.id = id;
        this.startTime = LocalDateTime.parse(startTime, FORMATTER);
        this.endTime = LocalDateTime.parse(endTime, FORMATTER);
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
        return java.time.Duration.between(startTime, endTime).toMinutes();
    }

    @Override
    public String toString() {
        return "Session{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", location='" + location + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public abstract double getProfit();
    public abstract double getProfitPerHours();
}
