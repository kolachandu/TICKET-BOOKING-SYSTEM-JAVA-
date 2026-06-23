# Ticket Booking System in Java

A simple console-based ticket booking project built with core Java.

## Features

- View available events
- Book tickets with customer details
- Check current bookings
- Cancel bookings
- Automatic seat availability updates

## Project Structure

```text
src/
  com/
    ticketbooking/
      Main.java
      TicketBookingSystem.java
      Event.java
      Customer.java
      Booking.java
```

## How to Run

Compile:

```powershell
javac -d out src/com/ticketbooking/*.java
```

Run:

```powershell
java -cp out com.ticketbooking.Main
```

## Menu Options

```text
1. View events
2. Book ticket
3. View bookings
4. Cancel booking
5. Exit
```
