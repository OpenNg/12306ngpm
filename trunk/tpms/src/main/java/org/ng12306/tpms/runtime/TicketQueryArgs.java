package org.ng12306.tpms.runtime;

import org.joda.time.LocalDate;

public class TicketQueryArgs {

	private String _trainNumber;

	public String getTrainNumber() {
		return this._trainNumber;
	}

	public void setTrainNumberId(String value) {
		this._trainNumber = value;
	}

	private LocalDate _date;

	public LocalDate getDate() {
		return this._date;
	}

	public void setDate(LocalDate value) {
		this._date = value;
	}
	
	private String _departureStation;

	public String getDepartureStation() {
		return this._departureStation;
	}

	public void setDepartureStation(String value) {
		this._departureStation = value;
	}

	private String _DestinationStation;

	public String getname() {
		return this._DestinationStation;
	}

	public void setname(String value) {
		this._DestinationStation = value;
	}

	
	private long _seatType;

	public long getSeatType() {
		return this._seatType;
	}

	public void setSeatType(long value) {
		this._seatType = value;
	}

	private int _count;

	public int getCount() {
		return this._count;
	}

	public void setCount(int value) {
		this._count = value;
	}

	
	
	
}
