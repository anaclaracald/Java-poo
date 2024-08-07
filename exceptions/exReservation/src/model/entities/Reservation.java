package model.entities;

import model.exceptions.DomainException;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
        if (!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after Check-in.");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public Long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkIn, Date checkOut) throws DomainException {
        Date now = new Date();
        if(!checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("Reservation date for update must be future dates.") ;
        }if (!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after Check-in.");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reservation\n");
        sb.append("Room Number: ").append(roomNumber);
        sb.append("\nCheckIn: ").append(sdf.format(checkIn));
        sb.append("\nCheckOut: ").append(sdf.format(checkOut));
        sb.append("\n" + this.duration() + " nights");
        return sb.toString();
    }
}
