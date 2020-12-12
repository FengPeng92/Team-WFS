/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Util;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author fengpeng
 */
public class SendEmail  {
    
    private String myEmailAccount = "fengpeng831@gmail.com";
    private String myEmailPassword = "Pf114301..92";
    private String to;

    public SendEmail(String to) {
        this.to = to;
    }
    
    public void userRegister()  {
        try {
            Properties props = System.getProperties();
        

            props.put("mail.smtp.user", myEmailAccount);
            props.put("mail.smtp.host",  "smtp.gmail.com");
            props.put("mail.smtp.port", "465");
            props.put("mail.smtp.starttls.enable","true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.debug", "true");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.socketFactory.fallback", "false");


            Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);


            MimeMessage message = new MimeMessage(session);


            message.setFrom(new InternetAddress(myEmailAccount));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            message.setSubject("User Registration");
            message.setText("Thank you for registering with us.  You can login with your username and password right now. ");
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", myEmailAccount, to);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch(Exception e) {
            
        }
        
    }
    
    public void VolunteerAgree() {
        try {
            Properties props = System.getProperties();
        

            props.put("mail.smtp.user", myEmailAccount);
            props.put("mail.smtp.host",  "smtp.gmail.com");
            props.put("mail.smtp.port", "465");
            props.put("mail.smtp.starttls.enable","true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.debug", "true");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.socketFactory.fallback", "false");


            Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);


            MimeMessage message = new MimeMessage(session);


            message.setFrom(new InternetAddress(myEmailAccount));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            message.setSubject("Volunteer Qualification");
            message.setText("Thank you for your willing to become a volunteer. You are a volunteer right now. ");
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", myEmailAccount, to);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch(Exception e) {
            
        }
    }
    
    private class SMTPAuthenticator extends javax.mail.Authenticator
    {
        public PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication(myEmailAccount, myEmailPassword);
        }
    }
    
}
