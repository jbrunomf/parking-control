package com.api.parkingcontrol.dtos;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class ParkingSpotDto {
    @NotBlank(message = "parkingSpotNumber cannot be null.")
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;
    @Size(max = 7, message = "licensePlateCar must have 7 caracters.")
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;
    @NotBlank
    @Column(nullable = false, length = 70)
    private String brandCar;
    @NotBlank
    @Column(nullable = false, length = 70)
    private String modelCar;
    @NotBlank
    @Column(nullable = false, length = 70)
    private String colorCar;
    @NotBlank
    @Column(nullable = false, length = 130)
    private String responsibleName;
    @NotBlank
    @Column(nullable = false, length = 30)
    private String apartment;
    @NotBlank
    @Column(nullable = false, length = 30)
    private String block;

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
