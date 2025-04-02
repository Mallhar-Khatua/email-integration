package org.example.email;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

import static jakarta.mail.Session.getInstance;

public class GEmailsender {


    public boolean sendEmail(String to, String from, String subject, String Text) {
        boolean flag= false;
        Properties properties =new Properties();
        properties.put("mail.smtp.auth",true);
        properties.put("mail.smtp.starttls.enable",true);
        properties.put("mail.smtp.port","587");
        properties.put("mail.smtp.host","smtp.gmail.com");

        String username="xxxxxx";
        String password="xxxxxx";

        Session session;
        session = getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username,password);
            }
        });
        try {
            Message message= new MimeMessage(session);
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setFrom(new InternetAddress(from));
            message.setSubject(subject);
            message.setText(Text);

            Transport.send(message);
           flag =true;
        }catch (Exception e){ System.out.println("failed");}



        return flag;
    }
}
