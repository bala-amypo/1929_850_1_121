package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "exam_rooms")
public class ExamRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String roomNumber;

    private Integer rows;
    private Integer columns;
    private Integer capacity;

    public ExamRoom() {
    }

    public ExamRoom(String roomNumber, Integer rows, Integer columns) {
        this.roomNumber = roomNumber;
        this.rows = rows;
        this.columns = columns;
        this.capacity = rows * columns;
    }

    // -------- GETTERS --------
    public Long getId() {
        return id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public Integer getRows() {
        return rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public Integer getCapacity() {
        return capacity;
    }

    // -------- SETTERS --------
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
        updateCapacity();
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
        updateCapacity();
    }

    private void updateCapacity() {
        if (rows != null && columns != null) {
            this.capacity = rows * columns;
        }
    }
}
