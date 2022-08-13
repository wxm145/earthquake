package com.earthquake.map.entity;

import sun.dc.pr.PRError;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Table(name = "tb_earthquake_data")
public class EarthquakeEntity {

    private String date;
    private String time;
    private String latitude;
    private String longitude;
    private String type;
    private String depth;
    private String magnitude;
    private String magnitudeType;
    private String magnitudeError;
    private String magnitudeSeismicStations;
    private String azimuthalGap;
    private String horizontalDistance;
    private String horizontalError;
    private String rootMeanSquare;
    private String id;
    private String source;
    private String locationSource;
    private String magnitudeSource;
    private String status;
    private String nation;
    @Id
    private Long eartgquakeId;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getMagnitudeType() {
        return magnitudeType;
    }

    public void setMagnitudeType(String magnitudeType) {
        this.magnitudeType = magnitudeType;
    }

    public String getMagnitudeError() {
        return magnitudeError;
    }

    public void setMagnitudeError(String magnitudeError) {
        this.magnitudeError = magnitudeError;
    }

    public String getMagnitudeSeismicStations() {
        return magnitudeSeismicStations;
    }

    public void setMagnitudeSeismicStations(String magnitudeSeismicStations) {
        this.magnitudeSeismicStations = magnitudeSeismicStations;
    }

    public String getAzimuthalGap() {
        return azimuthalGap;
    }

    public void setAzimuthalGap(String azimuthalGap) {
        this.azimuthalGap = azimuthalGap;
    }

    public String getHorizontalDistance() {
        return horizontalDistance;
    }

    public void setHorizontalDistance(String horizontalDistance) {
        this.horizontalDistance = horizontalDistance;
    }

    public String getHorizontalError() {
        return horizontalError;
    }

    public void setHorizontalError(String horizontalError) {
        this.horizontalError = horizontalError;
    }

    public String getRootMeanSquare() {
        return rootMeanSquare;
    }

    public void setRootMeanSquare(String rootMeanSquare) {
        this.rootMeanSquare = rootMeanSquare;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLocationSource() {
        return locationSource;
    }

    public void setLocationSource(String locationSource) {
        this.locationSource = locationSource;
    }

    public String getMagnitudeSource() {
        return magnitudeSource;
    }

    public void setMagnitudeSource(String magnitudeSource) {
        this.magnitudeSource = magnitudeSource;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Long getEartgquakeId() {
        return eartgquakeId;
    }

    public void setEartgquakeId(Long eartgquakeId) {
        this.eartgquakeId = eartgquakeId;
    }
}
