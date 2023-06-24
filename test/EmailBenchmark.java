package org.apache.commons.mail.benchmark;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.TearDown;

public class EmailBenchmark {

    private Email email;

    @Setup(Level.Iteration)
    public void setup() throws EmailException {
        email = new SimpleEmail();
        email.setHostName("smtp.example.com");
        email.setSmtpPort(587);
        email.setAuthentication("username", "password");
        email.setFrom("sender@example.com");
        email.addTo("recipient@example.com");
        email.setSubject("Test Email");
        email.setMsg("This is a test email.");
    }

    @TearDown(Level.Iteration)
    public void tearDown() {
        email = null;
    }

    @Benchmark
    public void sendEmailBenchmark() throws EmailException {
        email.send();
    }
}

