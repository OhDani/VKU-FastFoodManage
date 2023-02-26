package control;

import javax.swing.*;

public class LoginEvent {
    public LoginEvent() {
    }

    public boolean validate(String username, String password, JTextField txtUserName, JPasswordField txtPassword){
        boolean flag = true;
        if(password.contains("ngoc@151104") && username.contains("Tranngoc")) flag =true;
        else flag = false;
        return flag;
    }
    public void showPassWord(JCheckBox cbxDisplay,JPasswordField txtPassword) {
        if (cbxDisplay.isSelected()) {
            txtPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
        }
    }
}
