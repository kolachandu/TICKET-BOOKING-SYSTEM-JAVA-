package com.ticketbooking;

public class Booking {
    private final int bookingId;
    private final Customer customer;
    private final Event event;
    private final int seats;
    private final double totalAmount;

    public Booking(int bookingId, Customer customer, Event event, int seats) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.event = event;
        this.seats = seats;
        this.totalAmount = seats * event.getTicketPrice();
    }

    public int getBookingId() {
        return bookingId;
    }

    public Event getEvent() {
        return event;
    }

    public int getSeats() {
        return seats;
    }

    public String getReceipt() {
        return String.format(
                "Booking ID: %d%nCustomer: %s%nPhone: %s%nEvent: %s%nSeats: %d%nTotal: Rs. %.2f",
                bookingId,
                customer.getName(),
                customer.getPhone(),
                event.getName(),
                seats,
                totalAmount);
    }
}
