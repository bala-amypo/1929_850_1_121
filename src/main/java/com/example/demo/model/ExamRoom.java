package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class ExamRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String roomNumber;
    private int capacity;

    public ExamRoom() {}

    public ExamRoom(String roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public Long getId() { return id; }
    public String getRoomNumber() { return roomNumber; }
    public int getCapacity() { return capacity; }

    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}
