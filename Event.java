package com.ticketbooking;

public class Event {
    private final int id;
    private final String name;
    private final String venue;
    private final String date;
    private final double ticketPrice;
    private final int totalSeats;
    private int availableSeats;

    public Event(int id, String name, String venue, String date, double ticketPrice, int totalSeats) {
        this.id = id;
        this.name = name;
        this.venue = venue;
        this.date = date;
        this.ticketPrice = ticketPrice;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public boolean bookSeats(int seats) {
        if (seats <= 0 || seats > availableSeats) {
            return false;
        }
        availableSeats -= seats;
        return true;
    }

    public void releaseSeats(int seats) {
        availableSeats = Math.min(totalSeats, availableSeats + seats);
    }

    public String getSummary() {
        return String.format(
                "%d. %s | Venue: %s | Date: %s | Price: Rs. %.2f | Seats: %d/%d",
                id, name, venue, date, ticketPrice, availableSeats, totalSeats);
    }
}
