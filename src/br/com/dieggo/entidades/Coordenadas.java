package br.com.dieggo.entidades;

public class Coordenadas {
Double latitude;
Double longitude;
public Double getLatitude() {
	return latitude;
}
public void setLatitude(Double latitude) {
	this.latitude = latitude;
}
public Double getLongitude() {
	return longitude;
}
public void setLongitude(Double longitude) {
	this.longitude = longitude;
}
public Coordenadas(Double latitude, Double longitude) {
	super();
	this.latitude = latitude;
	this.longitude = longitude;
}
@Override
public String toString() {
	return "Coordenadas [latitude=" + latitude + ", longitude=" + longitude + "]";
}





}
