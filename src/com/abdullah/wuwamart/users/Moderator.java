package com.abdullah.wuwamart.users;

import java.util.ArrayList;
import com.abdullah.wuwamart.shop.Ticket;

public class Moderator extends User {
    private String role;
    private int modId;
    private ArrayList<Ticket> tickets;

    public Moderator(int id, String fullName, String userName, String password, String email, String role, int modId) {
        super(id, fullName, userName, password, email);
        this.role = role;
        this.modId = modId;
        this.tickets = new ArrayList<>();
    }

    public void manageTickets() {
        System.out.println("Managing " + tickets.size() + " tickets...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Moderator Role: " + role);
        System.out.println("Moderator ID: " + modId);
    }
}