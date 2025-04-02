package org.example.email;
import org.example.email.birthdaymail;


public class birthdaymail {


    public static String mail() {

        org.example.email.GEmailsender gmailsender = new org.example.email.GEmailsender();
        String to = "xxxx@gmail.com";
        String from = "yyyy@gmail.com";
        String subject = "email using java";
        String Text = "Wishing you a very happy birthday!!";
        boolean b;
        b = gmailsender.sendEmail(to, from, subject, Text);
        if (b) {
            System.out.println("email is sent");
        } else {
            System.out.println("there is a problem");
        }

        return to;
    }


    }

