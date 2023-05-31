package com.spthhrms.bean;

public class EventsBean {

	private int eventId;
	private String eventDate;
	private String eventTime;
	private String eventDay;
	private String eventMonth;
	private String eventYear;
	private String eventTitle;
	private String eventDescription;
	private String eventVenue;
	private String eventRaiserId;
	private String eventCycle;

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getEventDay() {
		return eventDay;
	}

	public void setEventDay(String eventDay) {
		this.eventDay = eventDay;
	}

	public String getEventMonth() {
		return eventMonth;
	}

	public void setEventMonth(String eventMonth) {
		this.eventMonth = eventMonth;
	}

	public String getEventYear() {
		return eventYear;
	}

	public void setEventYear(String eventYear) {
		this.eventYear = eventYear;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public String getEventVenue() {
		return eventVenue;
	}

	public void setEventVenue(String eventVenue) {
		this.eventVenue = eventVenue;
	}

	public String getEventRaiserId() {
		return eventRaiserId;
	}

	public void setEventRaiserId(String eventRaiserId) {
		this.eventRaiserId = eventRaiserId;
	}

	public String getEventCycle() {
		return eventCycle;
	}

	public void setEventCycle(String eventCycle) {
		this.eventCycle = eventCycle;
	}

	@Override
	public String toString() {
		return "EventsBean [eventId=" + eventId + ", eventDate=" + eventDate + ", eventTime=" + eventTime
				+ ", eventDay=" + eventDay + ", eventMonth=" + eventMonth + ", eventYear=" + eventYear + ", eventTitle="
				+ eventTitle + ", eventDescription=" + eventDescription + ", eventVenue=" + eventVenue
				+ ", eventRaiserId=" + eventRaiserId + ", eventCycle=" + eventCycle + "]";
	}

}
