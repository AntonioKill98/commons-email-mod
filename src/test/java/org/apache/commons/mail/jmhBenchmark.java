package org.apache.commons.mail;

import org.apache.commons.mail.mocks.MockHtmlEmailConcrete;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.openjdk.jmh.annotations.*;

@State(Scope.Thread)
public class jmhBenchmark {

    //Viene eseguito prima di ogni Benchmark
    @Setup(Level.Invocation)
    public void setUp() {
        //COSA FARE PRIMA DEI BENCHMARK
    }

    //Viene eseguito solo dopo il Benchmark, e solo se il Benchmark non genera eccezioni.
    @TearDown(Level.Invocation)
    public void doTearDown() {
        //COSA FARE DOPO IL BENCHMARK.
    }

    //Benchmark Get e Set HTML Message
    @Fork(3)
    @Warmup(iterations = 1) //1 iterazione di riscaldamento
    @Measurement(iterations = 5) //5 iterazioni di test
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchGetSetHTMLMsg() throws Exception {
        HtmlEmailTest htmlTest = new HtmlEmailTest();
        htmlTest.setUpHtmlEmailTest();
        htmlTest.testGetSetHtmlMsg();
    }

    //Benchmark invio eMail HTML sfruttando i Test già scritti
    @Fork(1) //indico di eseguire una sola Fork
    @Warmup(iterations = 1) //1 iterazione di riscaldamento
    @Measurement(iterations = 5) //5 iterazioni di test
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void benchSendHtmlMail() throws Exception {
        JUnitCore jTest = new JUnitCore();
        Request jRunner = Request.method(HtmlEmailTest.class,"testSend");
        Result jResult = jTest.run(jRunner);
        for (Failure failure : jResult.getFailures()) {
            System.out.println(failure.toString());
        }
    }

    //Benchmark invio eMail con immagini multiple
    @Fork(1) //indico di eseguire una sola Fork
    @Warmup(iterations = 1) //1 iterazione di riscaldamento
    @Measurement(iterations = 5) //5 iterazioni di test
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void benchSendMultiImageMail(){
        JUnitCore jTest = new JUnitCore();
        Request jRunner = Request.method(ImageHtmlEmailTest.class,"testSendHTMLAutoResolveMultipleFiles");
        Result jResult = jTest.run(jRunner);
        for (Failure failure : jResult.getFailures()) {
            System.out.println(failure.toString());
        }
    }

    //Benchmark invio eMail semplice
    @Fork(1) //indico di eseguire una sola Fork
    @Warmup(iterations = 1) //1 iterazione di riscaldamento
    @Measurement(iterations = 5) //5 iterazioni di test
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void benchSendSimpleMail(){
        JUnitCore jTest = new JUnitCore();
        Request jRunner = Request.method(SimpleEmailTest.class,"testSend");
        Result jResult = jTest.run(jRunner);
        for (Failure failure : jResult.getFailures()) {
            System.out.println(failure.toString());
        }
    }

    //Benchmark getMsg della SimpleEmailTest
    @Fork(3)
    @Warmup(iterations = 1) //1 iterazione di riscaldamento
    @Measurement(iterations = 5) //5 iterazioni di test
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void benchGetMsg() throws Exception {
        SimpleEmailTest simpleTest = new SimpleEmailTest();
        simpleTest.setUpSimpleEmailTest();
        simpleTest.testGetSetMsg();
    }
}
