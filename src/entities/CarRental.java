package entities;

import java.util.Date;

public class CarRental {

	private Date start;
	private Date finhish;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental() {
	}

	public CarRental(Date start, Date finhish, Vehicle vehicle) {
		this.start = start;
		this.finhish = finhish;
		this.vehicle = vehicle;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinhish() {
		return finhish;
	}

	public void setFinhish(Date finhish) {
		this.finhish = finhish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
}
