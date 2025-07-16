package com.abdullah.wuwamart.users;

public class Admin extends User {
    private String role;
    private int adminId;

    public Admin(int id, String fullName, String userName, String password, String email, String role, int adminId) {
        super(id, fullName, userName, password, email);
        this.role = role;
        this.adminId = adminId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Admin Role: " + role);
        System.out.println("Admin ID: " + adminId);
    }
}
