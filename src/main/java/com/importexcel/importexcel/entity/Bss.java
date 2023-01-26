package com.importexcel.importexcel.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "bss")
public class Bss {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String location;
    private Double longitude;
    private Double latitude;
    private Integer slot;
    private Integer status;
    private String city;
    private String province;

    public Bss() {
    }

    public Bss(UUID id, String name, String location, Double longitude, Double latitude, Integer slot, Integer status, String city, String province) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.longitude = longitude;
        this.latitude = latitude;
        this.slot = slot;
        this.status = status;
        this.city = city;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
