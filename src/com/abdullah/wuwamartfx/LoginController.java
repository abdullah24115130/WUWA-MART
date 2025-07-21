// 📁 File: com/abdullah/wuwamartfx/LoginController.java
package com.abdullah.wuwamartfx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class LoginController {

    // 🔹 login.fxml এর TextField এবং PasswordField কে link করছি
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    // 🔹 Login Button এ click করলে এই মেথড call হবে
    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if ("admin".equals(username) && "1234".equals(password)) {
            System.out.println("✅ Login successful!");
        } else {
            System.out.println("❌ Invalid username or password.");
        }
    }
}


    