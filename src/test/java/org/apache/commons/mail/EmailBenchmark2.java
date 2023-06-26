package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class EmailBenchmark2 {

    private Email email;

    public EmailBenchmark2() {
        email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(587);
        email.setAuthentication("your-email@gmail.com", "your-password");
        email.setStartTLSEnabled(true);
        email.setDebug(false);
    }

    @Benchmark
    public void sendEmailBenchmark2() throws EmailException {
        email.setSubject("Hello Benchmark");
        email.setMsg("This is a benchmark email");
        email.setFrom("sender@example.com");
        email.addTo("recipient@example.com");
        email.send();
    }
}
